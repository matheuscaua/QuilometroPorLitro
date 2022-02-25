import javax.swing.*;

public class quilometragemCombustivelTest {
    public static void main(String[] args){
        quilometragemCombustivel calcViagem = new quilometragemCombustivel();
        //Combustível
        int qtdViagens = Integer.parseInt(JOptionPane.showInputDialog("Quantas viagens fez? "));
        for (int i = 1 ; i <= qtdViagens; i++) {
            double combustivel = Double.parseDouble(JOptionPane.showInputDialog("Quanto foi gasto de combustível na viagem (Litros) " + i + "?"));
            if (combustivel > 0) {
                calcViagem.setCombustivel(combustivel);
            } else {
                JOptionPane.showMessageDialog(null, "Insira um valor maior que 0!");
                combustivel = Double.parseDouble(JOptionPane.showInputDialog("Quanto foi gasto de combustível na viagem (Litros)" + i + "?"));
                if (combustivel > 0) {
                    calcViagem.setCombustivel(combustivel);
                }
            }
            //Quilometragem
            double quilometragem = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a distância percorrida na viagem (KM)" + i + "?"));
            if (quilometragem >= 0) {
                calcViagem.setQuilometragem(quilometragem);
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido!! Digite novamente a distância! ");
                quilometragem = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a distância percorrida na viagem (KM) ?"));
                if (quilometragem > 0) {
                    calcViagem.setCombustivel(quilometragem);
                }
            }

        }
        //Cálculo de Quilometro por litro
        double message = Double.parseDouble(String.format("%.2f", calcViagem.getCalculo()));
        JOptionPane.showMessageDialog(null, message + " Quilômetros por litro");
    }
}
