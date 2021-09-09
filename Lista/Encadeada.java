/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author pierr
 */
public class ListaEncadeada<T> {
// instancia a lista vazia, não tem rezerva na memória e a media que vai 
//criando/instanciando elementos elementos, alocando o espaço da memória mas sob demanda
// não é rezervado premeditadamente
// sei que a lista terminou quando o ponteiro aponta para null
 
    private No inicio;
    
    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
    }

    @Override
    public String toString() {
       // return "ListaEncadeada{" + "inicio=" + inicio + '}';
       StringBuilder builder = new StringBuilder();
       builder.append("ListaEncadeeada[inicio=").append(inicio).append(",proximo=").append("]");
       return builder.toString();
    }
    
    
    public static void main(String[] args) {
        // Teste da lista
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        
        lista.adiciona(1);
        System.out.println(lista);
        
    }
    
}
