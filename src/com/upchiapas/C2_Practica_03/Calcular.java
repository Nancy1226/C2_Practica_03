package com.upchiapas.C2_Practica_03;

public class Calcular {

  public void CalcularNumero(Persona persona) {
    int numero=0, resultado, suma=0; String aux;
    resultado = persona.getDia() + persona.getMes() + persona.getAnio();
    String numCadena = resultado + " ";

    for (int i=0;i<4;i++) {
      aux = String.valueOf(numCadena.charAt(i));
      numero = Integer.parseInt(aux);
      suma += numero;
    }
    System.out.println(suma);
  }
}
