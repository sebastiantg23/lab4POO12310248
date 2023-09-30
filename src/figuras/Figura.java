package figuras;

public class Figura {
    private String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea(){
        return 0;
    }

    public boolean isRegular(){
        return true || false;
    }
}
