public class quilometragemCombustivel {
    private double combustivel;
    private double quilometragem;

    public void setCombustivel(double combustivel){
        this.combustivel = combustivel;
    }
    public void setQuilometragem(double quilometragem){
        this.quilometragem = quilometragem;
    }

    public double getCalculo(){
        double calculo = quilometragem / combustivel;
        return calculo;
    }

}
