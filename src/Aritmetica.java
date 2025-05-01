public class Aritmetica implements MediaStrategy {
    private double media;
    private String situacao;

    @Override
    public double calcularMedia(double p1, double p2){
        media = (p1+p2)/2;
        return media;
    }

    @Override
    public String verificarSituacao(double media){
        if(media >= 5){
            return situacao = "Aprovado";
        }

        return situacao = "Reprovado";
    }
}
