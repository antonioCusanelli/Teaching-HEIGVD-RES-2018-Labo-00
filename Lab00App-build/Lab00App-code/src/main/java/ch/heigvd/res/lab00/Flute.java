/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Antonio
 */
public class Flute implements IInstrument {
	public String play(){
		return "Fff";
	}
	public int getSoundVolume(){
		return 30;
	}
	public String getColor(){
		return "black";
	}
}
