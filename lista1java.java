package com.mycompany.lista1;

public class Lista1 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setPeso(25.5);
        cachorro.setRaca("Labrador");

        Peixe peixe = new Peixe();
        peixe.setNome("Nemo");
        peixe.setPeso(0.2);
        peixe.setTipoHabitat("Oceano");

        System.out.println("Cachorro: " + cachorro.toString());
        System.out.println("Peixe: " + peixe.toString());
    }

    // Classe Animal
    public static class Animal {
        private String nome;
        private double peso;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        @Override
        public String toString() {
            return "Animal: " +
                    "nome='" + nome + '\'' +
                    ", peso=" + peso;
        }
    }

    // Classe Peixe que herda de Animal
    public static class Peixe extends Animal {
        private String tipoHabitat;

        public String getTipoHabitat() {
            return tipoHabitat;
        }

        public void setTipoHabitat(String tipoHabitat) {
            this.tipoHabitat = tipoHabitat;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", tipoHabitat='" + tipoHabitat + '\'';
        }
    }

    // Classe Cachorro que herda de Animal
    public static class Cachorro extends Animal {
        private String raca;

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", raca='" + raca + '\'';
        }
    }

}
