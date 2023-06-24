/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

/**
 *
 * @author Jon
 */
public class Banka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LlogariaRrjedhese lb1=new LlogariaRrjedhese(123456L, "Filani",1000);
       LlogariaBankare lb2=new LlogariaBankare(123456789L , "Filanja ",5.0);
       
       lb1.depono(100.0);
       lb2.depono(500.0);
       lb2.terhjek(175.0);
       lb1.terhjek(200.0);
//        System.out.println("lb1 = " + lb1);
//        System.out.println("lb2 = " + lb2);
       
       LlogariaBankare lb3=new LlogariaRrjedhese(1234567L,"Deme",500);
       lb3.depono(250.0);
       lb3.terhjek(300.0);
//       System.out.println("lb3 = " + lb3);
//        lb1.setMbiterheqja(2000);
//        lb3.setMbiterheqja(2000);
       
       LlogariaKursyese lk1= new LlogariaKursyese(1234567L,"Jon",3.5);
       lk1.depono(99999999999.99);
       
       LlogariaBankare lk2=new LlogariaKursyese(1234567L, "Ana", 5.5);
       lk2.depono(500.0);
       

       LlogariaBankare [] llogarite = new LlogariaBankare[5];
       llogarite[0]=lb1;
       llogarite[1]=lb2;
       llogarite[2]=lb3;
       llogarite[3]=lk1;
       llogarite[4]=lk2;
       for(LlogariaBankare llogaria : llogarite){
           System.out.println(llogaria);
       }
       
   }
    
}
