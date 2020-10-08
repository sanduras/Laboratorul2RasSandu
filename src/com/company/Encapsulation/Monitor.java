package com.company.Encapsulation;

public class Monitor {
    private String name;
    private float resolution;
    private int frequency;
    private  String display;
    private  double response;

    public Monitor(String name, float resolution, int frequency, String display, double response) {
        this.name = name;
        this.resolution = resolution;
        this.frequency = frequency;
        this.display = display;
        this.response = response;
    }

    public void setResponse(double response) {
        this.response = response;
    }

    public String getDisplay() {
        return display;
    }

    public String print() {
        return ("Name: " + name + "\n" +
                "Resolution px: " + resolution + "\n" +
                "Frequency Hz: " + frequency + "\n" +
                "Response time: " + response + "\n" +
                "Display: " + display
        );
    }

}
