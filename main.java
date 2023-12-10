/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders4__Threading;

/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KronometreThread thread1 = new KronometreThread("kronomertre ",5);
        thread1.start();
        /*  KronometreThread thread2 = new KronometreThread("thread2");
        KronometreThread thread3 = new KronometreThread("thread3");
        thread2.start();
        thread3.start();
         */
    }

}
