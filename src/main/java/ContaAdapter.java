public class ContaAdapter extends ContaUltimate {
    private ContaGratuita contaGratuita;
    private ContaBasica contaBasica;
    private ContaUltimate contaUltimate;

    public ContaAdapter(ContaUltimate contaUltimate){
        this.contaUltimate = contaUltimate;
    }

    public ContaAdapter(ContaBasica contaBasica){
        this.contaBasica = contaBasica;
    }

    public ContaAdapter(ContaGratuita contaGratuita){
        this.contaGratuita = contaGratuita;
    }

    public String solicitarBasico(){
        return contaBasica.cBasico();
    }

    public String solicitarGratuito(){
        return contaGratuita.cGratuito();
    }

    public String solicitarUtimate(){
       return contaUltimate.cBancoUtimate();
    }
}
