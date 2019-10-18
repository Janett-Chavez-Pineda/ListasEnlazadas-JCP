package listasenlazadas.jcp;
public class Lista {
    
     private Nodo Principio;
 private Nodo Final;
  

 public Lista()
 {
  Principio=Final=null;
 }
  

 public void agregarFin(int info)
 {
   
  Nodo nuevo = new Nodo(info, null);
  
  if(Principio==null)
  {
   Principio=Final=nuevo;
  }
  else
  {
   Final.setSiguiente(nuevo);
   Final = nuevo;
  }
  
 }
  
 public void imprimir()
 {
  Nodo aux=Principio; 
  while(aux!=null)
  {
   System.out.println(aux.getDato());
   aux = aux.getSiguiente();
  } 
}
 public void eliminar(int valor)
 {
  Nodo anterior=Principio;
  Nodo aux= Principio.getSiguiente();
  Nodo temp;
  while(aux!=null)
  {

   if(aux.getDato() > valor)
   {
    temp=aux.getSiguiente();   
    anterior.setSiguiente(aux.getSiguiente()); 
    aux = temp;   
   }
   else
   {
    anterior=anterior.getSiguiente();
    aux=aux.getSiguiente();
   } 
  }
 }
}