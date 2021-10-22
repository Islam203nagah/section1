/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgin;

/**
 *
 * @author islam
 */
public class TV {
    public int channel;
    public int volumelevel;
    public boolean on;
    public TV()
    {
        channel=120;
        volumelevel=7;
        on=false;
    }
    public void turnon()
    {
       if( on==true)
        System.out.println("Error :This TV is on");
       else{
           on=true;
           System.out.println("TV turn on");
           }
    }
    public void turnoff()
    {
       if( on==false)
        System.out.println("Error :This TV is off");
       else{
           on=false;
           System.out.println("TV turn off");
       }
    }
    public void setChannal(int newchannal)
    {
       if( channel>=newchannal)
            System.out.println("The channal is exisit");
       else{
           channel=newchannal;
           System.out.println("The channal is set");
           }
           
    }
    public void setVolume(int newvolumelevel)
    {
       if( volumelevel>=newvolumelevel)
            System.out.println("The TV in Volume "+newvolumelevel);
       else{
           volumelevel=newvolumelevel;
           System.out.println("the volume is set");
       }
    }
    public void channalUp()
    {
        channel++;
    }
    public void channalDown()
    {
        channel--;
    }
    public void volumeUp()
    {
        volumelevel++;
    }
    public void volumeDown()
    {
        volumelevel--;
    }

}
