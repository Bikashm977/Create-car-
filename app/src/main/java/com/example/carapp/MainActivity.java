package com.example.carapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ET_carname,ET_year, ET_color,ET_price,ET_engineSize;
    TextView TV_results;
    Button addCar;

    CarModel cars = new CarModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_carname = findViewById(R.id.make_EditText);
        ET_year = findViewById(R.id.year_EditText);
        ET_color = findViewById(R.id.color_EditText);
        ET_price = findViewById(R.id.price_EditText);
        ET_engineSize = findViewById(R.id.size_EditText);

        TV_results = findViewById(R.id.result);
        addCar=findViewById(R.id.btn_addCar);


        addCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cars.setCarName(ET_carname.getText().toString());
                cars.setYear(ET_year.getText().toString());
                cars.setColor(ET_color.getText().toString());
                cars.setPrice(ET_price.getText().toString());
                cars.setEngineSize(ET_engineSize.getText().toString());

                String carname, year, color, price, EngineSize;
                carname= cars.getCarName().toString();
                color = cars.getColor().toString();
                year=cars.getYear().toString();
                price=cars.getPrice().toString();
                EngineSize=cars.getEngineSize().toString();

                Log.d("car name", "Car name: "+ET_carname.getText().toString());


                String load_data = TV_results.getText().toString() +
                        "\r\n" +
                        "\r\n" + "Car name : " + carname +
                        "\r\n" + "Year : " + year +
                        "\r\n" + "Color : " + color +
                        "\r\n" + "Price : " + price +
                        "\r\n" + "Engine Size : " + EngineSize;

                TV_results.setText(load_data);

            }
        });









        }
}
