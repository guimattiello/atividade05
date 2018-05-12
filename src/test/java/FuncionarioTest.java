/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guimat
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }

    @Test
    public void desenvolvedorMaior3000Test() {
        Funcionario f = new Funcionario();
        f.setNome("Guilherme");
        f.setEmail("guilhermer@utfpr.edu.br");
        f.setSalarioBase(5000.00);
        f.setCargo("DESENVOLVEDOR");
        
        assertEquals(4000.00, f.getSalarioLiquido(), 0.01);
    }
    
    @Test
    public void desenvolvedorMenor3000Test() {
        Funcionario f = new Funcionario();
        f.setNome("Guilherme");
        f.setEmail("guilhermer@utfpr.edu.br");
        f.setSalarioBase(2000.00);
        f.setCargo("DESENVOLVEDOR");
        
        assertEquals(1800.00, f.getSalarioLiquido(), 0.01);
    }
    
}
