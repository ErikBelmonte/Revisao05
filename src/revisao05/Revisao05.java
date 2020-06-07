package revisao05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Revisao05 {
    public static void main(String[] args) {
        /* Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, 
        conforme a tabela abaixo. Faça um programa que leia o salário e o código do cargo de um funcionário e 
        calcule o seu novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 15% de aumento. 
        Mostre o salário antigo, o novo salário e a diferença entre ambos. */
        
        String name;
        int code;
        double salary, newSalary, increase, difference;
        DecimalFormat f = new DecimalFormat("0.00");
        
        name = JOptionPane.showInputDialog("Informe seu nome:");
        code = Integer.parseInt(JOptionPane.showInputDialog(name+", informe seu código de funcionário:"));
        salary = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário atual:"));
        
        switch (code) {
            case 310:
                newSalary = ((salary * 5)/100);
                increase = newSalary + salary;
                break;
            case 456:
                newSalary = ((salary * 7.5)/100);
                increase = newSalary + salary;
                break;
            case 885:
                newSalary = ((salary * 10)/100);
                increase = newSalary + salary;
                break;
            default:
                newSalary = ((salary * 15)/100);
                increase = newSalary + salary;
                break;
        }
        difference = increase - salary;
        JOptionPane.showMessageDialog(null, "Seu salário antigo era de R$ "+f.format(salary)+"\n O novo salário é R$ "+f.format(increase)+
                "\n E a diferença foi de R$ "+f.format(difference)+"\n------------------\n Nome da Empresa");
    }
    
}
