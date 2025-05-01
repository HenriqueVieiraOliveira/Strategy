public class Geometrica implements MediaStrategy {
    private double media;
    private String situacao;
    
    @Override
    public double calcularMedia(double p1, double p2){
        return media = (Math.sqrt(p1*p2));
    }
    
    @Override
    public String verificarSituacao(double media){
        if(media >= 7){
            return situacao = "Aprovado";
        }
    
        return situacao = "Reprovado";
    }
}
