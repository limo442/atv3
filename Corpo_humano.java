/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv3;

/**
 *
 * @author alunocmc
 */

  

public class Corpo_humano {

     public double massa;
     private double densidade;
     private double volume;
     public double altura;
     public double IMC;
     public Corpo_humano(double massa, double volume, double altura) 
              
{
this.massa = massa;
this.volume = volume;
this.altura = altura;
densidade = massa/volume;
IMC = massa/altura;
}
     public double GetMassa()
     {
        return massa;
         
     }
     
     public double GetVolume(){
         
         return volume;
     }
     public double GetDensidade()
     {
         return densidade;
     }
     
     public double GetAltura()
     {
         return altura;
     }
     
     public double GetIMC()
     {
    return IMC;
     }

     public void SetMassa(double massa){
         this.massa = massa;
         densidade = massa/volume;
         
         
     }
     
     private void SetVolume(double volume){
         this.volume = volume;
         densidade = massa/volume;
              
         
     
         
     
     }
     public void SetAltura(double altura) {
      this.altura = altura;
      IMC = massa/altura;
         
     }
 
      
       
   
    
}


