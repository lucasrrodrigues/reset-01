package TemaAula01;

public class Guerreiro {
    String nomeDoGuerreiro;
    int vida;
    int ataque;
    int defesa;

    Guerreiro(String nomeDoGuerreiro, int vida, int ataque, int defesa) {
        this.nomeDoGuerreiro = nomeDoGuerreiro;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Guerreiro guerreiro, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - this.defesa;
        this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoGuerreiro + " atacou " + this.nomeDoGuerreiro + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (this.vida <= 0) {
                this.vida = 0;
                System.out.println(this.nomeDoGuerreiro + " atacou " + this.nomeDoGuerreiro + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoGuerreiro + " atacou " + this.nomeDoGuerreiro + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + this.nomeDoGuerreiro + " = " + this.vida);
    }}}

    public void atacar(Barbaro barbaro, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - barbaro.defesa;
        barbaro.vida -= dano;
            if (this.vida <= 0) {
                System.out.println(this.nomeDoGuerreiro + " atacou " + barbaro.nomeDoBarbaro + " com " + arma.nomeDaArma + " causando 0 de dano.");
            } else {
                if (barbaro.vida <= 0) {
                    barbaro.vida = 0;
                    System.out.println(this.nomeDoGuerreiro + " atacou " + barbaro.nomeDoBarbaro + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
                } else {
        System.out.println(this.nomeDoGuerreiro + " atacou " + barbaro.nomeDoBarbaro + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + barbaro.nomeDoBarbaro + " = " + barbaro.vida);
    }}}

    public void atacar(Mago mago, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - mago.defesa;
        mago.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoGuerreiro + " atacou " + mago.nomeDoMago + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (mago.vida <= 0) {
                mago.vida = 0;
                System.out.println(this.nomeDoGuerreiro + " atacou " + mago.nomeDoMago + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoGuerreiro + " atacou " + mago.nomeDoMago + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial da " + mago.nomeDoMago + " = " + mago.vida);

    }}}

    public void atacar(Feiticeiro feiticeiro, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - feiticeiro.defesa;
        feiticeiro.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoGuerreiro + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (feiticeiro.vida <= 0) {
                feiticeiro.vida = 0;
                System.out.println(this.nomeDoGuerreiro + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoGuerreiro + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + feiticeiro.nomeDoFeiticeiro + " = " + feiticeiro.vida);

    }}}

    public void atacar(Druida druida, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - druida.defesa;
        druida.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoGuerreiro + " atacou " + druida.nomeDoDruida + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (druida.vida <= 0) {
                druida.vida = 0;
                System.out.println(this.nomeDoGuerreiro + " atacou " + druida.nomeDoDruida + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoGuerreiro + " atacou " + druida.nomeDoDruida + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + druida.nomeDoDruida + " = " + druida.vida);

    }}}

    public void atacar(Clerigo clerigo, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - clerigo.defesa;
        clerigo.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoGuerreiro + " atacou " + clerigo.nomeDoClerigo + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (clerigo.vida <= 0) {
                clerigo.vida = 0;
                System.out.println(this.nomeDoGuerreiro + " atacou " + clerigo.nomeDoClerigo + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoGuerreiro + " atacou " + clerigo.nomeDoClerigo + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial da " + clerigo.nomeDoClerigo + " = " + clerigo.vida);

    }}}

}
