/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.util.Objects;
/**
 *
 * @author Jon
 */
public class LlogariaBankare {
    
    private Long nrLlogarise;
    private String emri;
    protected Double bilanci=0.0;
    
    public LlogariaBankare( Long nr, String e){
        nrLlogarise= nr;
        emri=e;
    }
    
    public LlogariaBankare(Long nr, String e , Double b){
        nrLlogarise = nr;
        emri=e;
        bilanci=b;
        }
    public Long getNrLlogarise(){
        return nrLlogarise;
    }
    public String getEmri(){
        return emri;
    }
    
    public Double getBilanci(){
        return bilanci;
    }
    
    public void depono(Double shuma){
        if(shuma>0){
            bilanci+=shuma;
        }else{
            System.out.println("DEPONO: vlera e shumes duhet te jete pozitive");
            
        }
    }
    
    public void terhjek (Double shuma){
        if(shuma<=0){
            System.out.println("TERHJEK: Vlera e shumes duhet te jete pozitive");   
        }else if(shuma>getBilanci()){
            System.out.println("TERHJEK: Nuk keni mjete te mjaftueshme");
        }else{
            bilanci-=shuma;
        }
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof LlogariaBankare){
            LlogariaBankare llogaria=(LlogariaBankare)obj;
            return Objects.equals(nrLlogarise, llogaria.nrLlogarise);
        }
        return false;
    }
    
    @Override
    public String toString(){
        return String.format("%s (%d) - %s: %.2f ", getClass().getSimpleName(),nrLlogarise,emri,getBilanci());
    }
}
