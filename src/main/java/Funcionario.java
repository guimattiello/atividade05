/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guimat
 */
class Funcionario {

    String nome;
    String email;
    double salarioBase;
    String cargo;
    
    void setNome(String pNome) {
        this.nome = pNome;
    }

    void setEmail(String pEmail) {
        this.email = pEmail;
    }

    void setSalarioBase(double pSalarioBase) {
        this.salarioBase = pSalarioBase;
    }

    void setCargo(String pCargo) {
        this.cargo = pCargo;
    }
    
    double getSalarioLiquido() {
        return this.salarioBase * 0.8;
    }
    
}
