package com.example.softlabtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class color{
    public String name ;
    public color(String name){
        this.name = name ;
    }
    public String showColor() {
        return "The color is " + name + "\n";
    }
}

class Red extends color{
    public Red(){
        super("Red");
    }
}

class Green extends color{
    public Green(){
        super("Green");
    }
}

class Blue extends color{
    public Blue(){
        super("Blue");
    }
}

abstract class Vehicle {
    public String name;
    public Vehicle(String name)
    {
        this.name=name;

    }
    public abstract int wheels();
    public abstract double fuel();
    public abstract double milage();
}
class Sedan extends Vehicle{
    public int wheels;
    public double fuel;
    public double milage;

    public Sedan(int wheels, double fuel, double milage) {
        super("Sedan");
        this.wheels = wheels;
        this.fuel = fuel;
        this.milage = milage;
    }

    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public double fuel() {
        return fuel;
    }
    @Override
    public double milage() {
        return milage;
    }
}

class Motorcycle extends Vehicle{
    public int wheels;
    public double fuel;
    public double milage;

    public Motorcycle(int wheels, double fuel, double milage) {
        super("Motocycle");
        this.wheels = wheels;
        this.fuel = fuel;
        this.milage = milage;
    }

    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public double fuel() {
        return fuel;
    }
    @Override
    public double milage() {
        return milage;
    }
}

class SUV extends Vehicle{
    public int wheels;
    public double fuel;
    public double milage;

    public SUV(int wheels, double fuel, double milage) {
        super("SUV");
        this.wheels = wheels;
        this.fuel = fuel;
        this.milage = milage;
    }

    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public double fuel() {
        return fuel;
    }
    @Override
    public double milage() {
        return milage;
    }
}


public class MainActivity extends AppCompatActivity {

    public EditText VehicleEditText, ColorEditText ;
    public Button button ;
    public TextView VehicleTextView , VehicleTextView1 , VehicleTextView2 , ColorTextView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleEditText = findViewById(R.id.ShapeEditText);

        ColorEditText = findViewById(R.id.ColorEditText);
        button = findViewById(R.id.button);
        VehicleTextView = findViewById(R.id.ShapeTextView);
        VehicleTextView1 = findViewById(R.id.ShapeTextView2);
        VehicleTextView2 = findViewById(R.id.ShapeTextView3);

        ColorTextView = findViewById(R.id.ColorTextView);

        button.setOnClickListener(v -> {
            String shape = VehicleEditText.getText().toString();
            String color = ColorEditText.getText().toString() ;

            if(shape.equals("Sedan")){
                Sedan c = new Sedan(4, 100, 400);

                VehicleTextView.setText(String.valueOf(c.wheels()));
                VehicleTextView1.setText(String.valueOf(c.fuel()));
                VehicleTextView2.setText(String.valueOf(c.milage()));
            }
            else if(shape.equals("Motorcycle")){
                Motorcycle s = new Motorcycle(2, 10, 50);
                VehicleTextView.setText(String.valueOf(s.wheels()));
                VehicleTextView1.setText(String.valueOf(s.fuel()));
                VehicleTextView2.setText(String.valueOf(s.milage()));
            }
            else if(shape.equals("SUV")){
                SUV t = new SUV(4,200, 600);
                VehicleTextView.setText(String.valueOf(t.wheels()));
                VehicleTextView1.setText(String.valueOf(t.fuel()));
                VehicleTextView2.setText(String.valueOf(t.milage()));
            }
            else{
                VehicleTextView.setText("Invalid vehicle");
            }

            if(color.equals("Red")){
                Red r = new Red();
                ColorTextView.setText(r.showColor());
            }
            else if(color.equals("Green")){
                Green g = new Green();
                ColorTextView.setText(g.showColor());
            }
            else if(color.equals("Blue")){
                Blue b = new Blue();
                ColorTextView.setText(b.showColor());
            }
            else{
                ColorTextView.setText("Invalid Color");
            }
        });
    }
}
