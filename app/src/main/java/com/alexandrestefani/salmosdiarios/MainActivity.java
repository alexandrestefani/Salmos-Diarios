package com.alexandrestefani.salmosdiarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getSalmons(View view){

        String[] salmons = {
                "  Mil poderão cair ao seu lado; dez mil, à sua direita, mas nada o atingirá. Salmos 91:7  "  ,
                "  Depositei toda a minha esperança no Senhor; ele se inclinou para mim e ouviu o meu grito de socorro. Salmo 40:1  "  ,
                "  Aquele que habita no abrigo do Altíssimo e descansa à sombra do Todo-poderoso. Salmo 91:1  "  ,
                "  Entregue o seu caminho ao Senhor; confie nele, e ele agirá: Salmos 37:5  "  ,
                "  Ouve o meu clamor, ó Deus; atenta para a minha oração. Salmo 61:1  "  ,
                "  Deleite-se no Senhor, e ele atenderá aos desejos do seu coração. Salmo 37:4  "  ,
                "  Levanto os meus olhos para os montes e pergunto: De onde me vem o socorro? 2 O meu socorro vem do Senhor, que fez os céus e a terra. Salmo 121:1,2  "  ,
                "  Aquele que sai chorando enquanto lança a semente, voltará com cantos de alegria, trazendo os seus feixes. Salmo 126:6  "  ,
                "  Espero no Senhor com todo o meu ser e na sua palavra ponho a minha esperança. Salmo 130:5  "  ,
                "  Aqueles que semeiam com lágrimas, com cantos de alegria colherão. Salmo 126:5  "  ,
                "  Sim, coisas grandiosas fez o Senhor por nós, por isso estamos alegres. Salmo 126:3  "  ,
                "  Entregue o seu caminho ao Senhor; confie nele, e ele agirá: Salmo 37:5  "  ,
                "  Alegrei-me com os que me disseram: Vamos à casa do Senhor! Salmo 122:1  "  ,
                "  A tua palavra é lâmpada que ilumina os meus passos e luz que clareia o meu caminho. Salmos 119:105  "  ,
                "  Espere no Senhor. Seja forte! Coragem! Espere no Senhor. Salmos 27:14  "  ,
                "  Deleite-se no Senhor, e ele atenderá aos desejos do seu coração. Salmos 37:4  "  ,
                "  Guardei no coração a tua palavra para não pecar contra ti. Salmos 119:11  "  ,
                "  Pois a palavra do Senhor é verdadeira; ele é fiel em tudo o que faz. Salmos 33:4  "  ,
                "  Mesmo quando eu andar por um vale de trevas e morte, não temerei perigo algum, pois tu estás comigo; a tua vara e o teu cajado me protegem. Salmos 23:4  "  ,
                "  O Senhor é o meu pastor; de nada terei falta. Salmos 23:1  "  ,
                "  Saibam eles que tu, cujo nome é Senho Salmos 83:18  "  ,
                "  Deus é o nosso refúgio e a nossa fortaleza, auxílio sempre presente na adversidade. Salmos 46:1  "  ,
                "  Os que confiam no Senhor são como o monte Sião, que não se pode abalar, mas permanece para sempre. Salmo 125:1  "  ,
                "  Bendiga o Senhor a minha alma! Não esqueça nenhuma de suas bênçãos! Salmo 103:2  "  ,
                "  Senhor, quero dar-te graças de todo o coração e falar de todas as tuas maravilhas. Em ti quero alegrar-me e exultar, e cantar louvores ao teu nome, ó Altíssimo. Salmo 9:1-2  "  ,
                "  Entrem por suas portas com ações de graças e em seus átrios com louvor; deem-lhe graças e bendigam o seu nome. Salmo 100:4  "  ,
                "  Damos-te graças, ó Deus, damos-te graças, pois perto está o teu nome; todos falam dos teus feitos maravilhosos. Salmo 75:1  "  ,
                "  O Senhor é a minha luz e a minha salvação; de quem terei temor? O Senhor é o meu forte refúgio; de quem terei medo? Salmo 27:1  "  ,
                "  O Senhor firma os passos de um homem, quando a conduta deste o agrada; ainda que tropece, não cairá, pois o Senhor o toma pela mão. Salmo 37:23,24  "  ,
                "  A minha salvação e a minha honra de Deus dependem; ele é a minha rocha firme, o meu refúgio. Salmo 62:7  "  ,
                "  Bendiga o Senhor a minha alma! Bendiga o Senhor todo o meu ser! Salmo 103:1  "  ,
                "  Deem graças ao Senhor porque ele é bom; o seu amor dura para sempre. Salmo 107:1  "  ,
                "  As tuas mãos me fizeram e me formaram; dá-me entendimento para aprender os teus mandamentos. Salmo 119:73  "  ,
                "  Eu clamo pelo Senhor na minha angústia, e ele me responde. Salmo 120:1  "  ,
                "  O Senhor é refúgio para os oprimidos, uma torre segura na hora da adversidade. Salmo 9:9  "

        };

        int numberAleatory = new Random().nextInt(35);
        String salmo = "\n\n\n\n\n\n"+ salmons[numberAleatory];
        TextView text = findViewById(R.id.textView);
        text.setText(salmo);


    }
}