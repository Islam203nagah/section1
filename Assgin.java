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
public class Assgin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        TV t1=new TV();
//        t1.on=true;
//        t1.turnon();
//        t1.channalUp();
//        t1.channalUp();
//        System.out.println(t1.channel);
//        t1.channalDown();
//        System.out.println(t1.channel);
//        t1.setChannal(120);
//        t1.setChannal(121);
//        t1.setChannal(122);
//        System.out.println(t1.channel);
//        t1.volumeUp();
//        t1.volumeUp();
//        System.out.println(t1.volumelevel);
//        t1.setVolume(6);
//        t1.setVolume(7);
//        t1.setVolume(10);
//        System.out.println(t1.volumelevel);
///////////////////////////////////////////////////////////////
        Account acc=new Account(2000,23000);
        acc.setAnnualInterestRate(5.1);
        acc.withdraw(4000.0);
        acc.deposit(3000.0);
        System.out.println("Balance :"+acc.getBalance());
        System.out.println("Data Created: "+acc.getDateCreated());
    }
    
}
