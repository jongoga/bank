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
public class LlogariaRrjedhese extends LlogariaBankare {
    private Integer mbiterheqja;
    
    public LlogariaRrjedhese(Long nr , String e, Integer m ){
        super(nr,e);
        mbiterheqja = m;
    }
    public Integer getMbiterheqja(){
        return mbiterheqja;
    }
    
    public void setMbiterheqja( Integer mbiterheqja){
        this.mbiterheqja=mbiterheqja;
    }
    
    @Override
    public Double getBilanci(){
        return bilanci + mbiterheqja;
    }
    
    @Override
    public String toString(){
        return super.toString()+String.format("[%d]",mbiterheqja );
    }
    
}
