/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marasco;

public class Auto {

    private String marca;

    private String targa;

    private String modello;

    private Integer numeroPorte;

    private Integer annoImmatricolazione;

    private String statoDiImmatricolazione;

    private Integer cilindrata;

    private Integer velocità;

    private Boolean isAcceso;

    public Auto() {
    }

    
    public Auto(String marca, String targa, String modello, Integer numeroPorte, Integer annoImmatricolazione, String statoDiImmatricolazione, Integer cilindrata, Integer velocità, Boolean isacceso) {
        this.marca = marca;
        this.targa = targa;
        this.modello = modello;
        this.numeroPorte = numeroPorte;
        this.annoImmatricolazione = annoImmatricolazione;
        this.statoDiImmatricolazione = statoDiImmatricolazione;
        this.cilindrata = cilindrata;
        this.velocità = velocità;
        this.isAcceso = isacceso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(Integer numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public Integer getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(Integer annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getStatoDiImmatricolazione() {
        return statoDiImmatricolazione;
    }

    public void setStatoDiImmatricolazione(String statoDiImmatricolazione) {
        this.statoDiImmatricolazione = statoDiImmatricolazione;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public Integer getVelocità() {
        return velocità;
    }

    public void setVelocità(Integer velocità) {
        this.velocità = velocità;
    }

    public Boolean getIsacceso() {
        return isAcceso;
    }

    public void setIsacceso(Boolean isacceso) {
        this.isAcceso = isacceso;

    }

    public void accelera() {

    }

    public void rellenta() {

    }

    public void spegni() {

    }

    public void accendi() {

    }

}
