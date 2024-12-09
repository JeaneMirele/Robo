public class Robo {
    private int posicaoLinha;
    private int posicaoColuna;
    private int passo;
    private int nLinha = 20;
    private int nColuna = 40;


    public Robo(int posicaoLinha, int posicaColuna, int passo, int nLinha, int nColuna) {
        this.posicaoLinha = posicaoLinha;
        this.posicaoColuna = posicaoColuna;
        this.passo = passo;
        this.nLinha = nLinha;
        this.nColuna = nColuna;
    }
    public int getnColuna() {
        return nColuna;
    }

    public void setnColuna(int nColuna) {
        this.nColuna = nColuna;
    }

    public int getnLinha() {
        return nLinha;
    }

    public void setnLinha(int nLinha) {
        this.nLinha = nLinha;
    }

    public int getPosicaColuna() {
        return posicaoColuna;
    }

    public void setPosicaColuna(int posicaColuna) {
        this.posicaoColuna = posicaColuna;
    }

    public int getPasso() {
        return passo;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }

    public int getposicaoLinha() {
        return posicaoLinha;
    }

    public void setposicaoLinha(int linha) {
        this.posicaoLinha = linha;
    }



    public void mostrarPosicaoAtual() {
        System.out.println("Posição atual: " + posicaoLinha + ", " + posicaoColuna);

    }

    public void andarFrente() {
        if (posicaoLinha + passo < nLinha) {
            posicaoLinha += passo;
        } else {
            posicaoLinha = nLinha - 1;
        }
    }

    public void andarTras() {
        if (posicaoLinha - passo >= 0) {
            posicaoLinha -= passo;
        } else {
            posicaoLinha = 0;
        }
    }

    public void andarDireita() {
        if (posicaoColuna + passo < nColuna) {
            posicaoColuna += passo;
        } else {
            posicaoColuna = nColuna - 1;
        }

    }

    public void andarEsquerda() {
        if (posicaoColuna - passo >= 0) {
            posicaoColuna -= passo;
        } else {
            posicaoColuna = 0;
        }

    }

    public void criandoSala() {


            for (int j = 0; j < nColuna; j++) {
                System.out.print("-");
            }
            System.out.println();

            for (int i = 0; i < nLinha; i++) {
                System.out.print("|");
                for (int j = 0; j < nColuna; j++) {
                    if (i == posicaoLinha && j == posicaoColuna) {
                        System.out.print("1");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("|");
                System.out.println();
            }

            for (int j = 0; j < nColuna; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
}


