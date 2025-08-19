/**
 * Classe que representa uma lâmpada com funcionalidades básicas.
 * Permite ligar, desligar e verificar o estado da lâmpada.
 */
public class Lampada {
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }
    
    public void ligar() {
        this.ligada = true;
    }
    
    public void desligar() {
        this.ligada = false;
    }
    
    /**
     * Verifica se a lâmpada está ligada
     * @return true se estiver ligada, false caso contrário
     */
    public boolean estaLigada() {
        return this.ligada;
    }
    
    /**
     * Retorna o estado atual da lâmpada
     * @return String descrevendo o estado
     */
    public String getEstado() {
        return this.ligada ? "Ligada" : "Desligada";
    }
}