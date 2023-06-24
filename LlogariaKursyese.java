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
public class LlogariaKursyese  extends LlogariaBankare {
    private Double interesi;
    
    public LlogariaKursyese(Long nr , String e , Double i){
        super(nr,e );
        interesi=i;
    }
    @Override
    public Double getBilanci(){
        return bilanci * (1+interesi /100);
    }
    
    @Override
    public String toString(){
        return super.toString()+String.format(" , interesi %.2f %%", interesi );
    }
    
}
