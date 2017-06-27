package com.vgarcia.fcamc;

import java.awt.Color;

public class ColorSpace {

	
	public static String getColorFromLocation(double x, double y, double z, double max){
		float h;
		float s;
		float v;
		
		v = (float)(y/max);
		
		if(x==0&&z==0){
			s = 0.0f;
		}else{
			s = (float) (Math.sqrt(Math.pow(x/max, 2)+Math.pow(z/max, 2)));
		}
		h = (float)(Math.atan2(x, z)/Math.PI);
		
		System.out.println(h);
		System.out.println(s);
		System.out.println(v);
		int color = Color.HSBtoRGB(h, s, v);
		String colorS = Integer.toHexString(color);
		colorS = "#"+colorS.substring(2);
		return colorS;

	}
	public static void CreateTexture(){
		
	}

}
