package listaencadeada;

/**
 *
 * @author pierr
 */
public class No<T>{
    
    private T elemento;
    private No<T>proximoNo;

    
    public No(T elemento) {
        this.elemento = elemento;
        this.proximoNo = null;
    }


    public No(T elemento, No<T> proximoNo) {
        this.elemento = elemento;
        this.proximoNo = proximoNo;
    }
     
    

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("No [elemento=").append(elemento).append(",proximo=").append(proximoNo).append("]");
        return builder.toString();
        //return "No{" + "elemento=" + elemento + ", proximoNo=" + proximoNo + '}';
    }
    
    
}
