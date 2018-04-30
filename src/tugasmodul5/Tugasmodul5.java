/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul5;

/**
 *
 * @author rafli
 */
public class Tugasmodul5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kelompok 22");
        Class1 c1 =  new Class1("Rafli Adhiyaksa Putra\t","Moch Chamdan Erbono\t","21120117120004","21120117140018");
        System.out.println(c1.namakesatu());
        System.out.println(c1.namakedua());
        
        Class2 c2 = new Class2();
        System.out.println(c2.memesan());   
    }   
}

