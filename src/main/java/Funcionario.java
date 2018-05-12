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
        if (this.cargo.equals("DESENVOLVEDOR")) {
            if (this.salarioBase >= 3000) {
                return this.salarioBase * 0.8;
            } else {
                return this.salarioBase * 0.9;
            }
        } else if (this.cargo.equals("DBA")) {
            if (this.salarioBase >= 2000) {
                return this.salarioBase * 0.75;
            } else {
                return this.salarioBase * 0.85;
            }
        } else if (this.cargo.equals("TESTADOR")) {
            return this.salarioBase * 0.75;
        } else {
            return 0;
        }

    }

}
