package ie.tudublin;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class DANI extends PApplet {

	public void loadFile() {

		String[] wordLL;
		
		wordLL = loadStrings("small.txt");
	}

	public String findWord() {
		return "0"; 
	}

	public String findFollow() {
		return "0"; 
	}

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
