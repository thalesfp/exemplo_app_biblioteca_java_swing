/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livraria;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import livraria.controllers.ControllerClientes;
import livraria.controllers.ControllerLivros;
import livraria.modelos.Cliente;
import livraria.modelos.Livro;

/**
 *
 * @author thales
 */
public class Feed {
        public static void livros() {
        ControllerLivros controllerLivros = ControllerLivros.getInstance();
        
        String[][] livros = {
            { "850105402X", 
              "Quem Mexeu no Meu Queijo?", 
              "Quem mexeu no meu queijo? é uma parábola que revela verdades"
                + " profundas sobre mudança. Dois ratinhos e dois homenzinhos"
                + " vivem em um labirinto em busca de queijo - uma metáfora"
                + " para o que se deseja ter na vida, de um bom emprego à paz"
                + " espiritual. Um deles é bem-sucedido e escreve o que "
                + "aprendeu com sua experiência nos muros do labirinto. As "
                + "palavras rabiscadas nas paredes ensinam a lidar com mudança"
                + " para viver com menos estresse e alcançar mais sucesso no"
                + " trabalho e na vida pessoal. Quem mexeu no meu queijo? é"
                + " uma leitura rápida, mas sua idéias permanecerão por toda"
                + " a vida.",
              "Johnson, Spencer",
              "14",
              "12.64",
              "28/10/2014",
              "Auto-Ajuda"
            },
            { "9788576081739",
              "Use a Cabeça Java",
              "'Use a Cabeça Java' é uma experiência completa de aprendizado"
                + " em programação orientada a objetos (OO) e Java. Projetado"
                + " de acordo com princípios de aprendizado mentalmente "
                + "amigáveis, este livro o mostrará tudo, dos aspectos básico"
                + " da linguagem a tópicos avançados que incluem segmentos,"
                + " soquetes de rede e programação distribuída. O mais"
                + " importante é que você aprenderá a pensar como um"
                + " desenvolvedor orientado a objetos. Você vai participar"
                + " de jogos, resolver quebra-cabeças, refletir sobre mistérios"
                + " e interagir com Java de formas nunca imaginadas. No"
                + " decorrer da leitura, você escreverá muitos códigos Java"
                + " reais, inclusive o jogo 'sink a dot com' e o cliente de"
                + " bate-papo de uma rede. A abordagem de aprendizado da série"
                + " Use a Cabeça o ajudará a memorizar rapidamente o"
                + " conhecimento de maneira permanente. Prepare-se para abrir"
                + " sua mente enquanto aprende (e compreende) tópicos-chave,"
                + " entre eles - A linguagem Java; Desenvolvimento orientado a"
                + " objetos; Criação, teste e implantação de aplicativos; Uso"
                + " da biblioteca do API Java; Manipulação de exceções; Uso de"
                + " vários segmentos; Programação de GUI com o Swing; Rede"
                + " com RMI e soquetes; Conjuntos e tipos genéricos.",
              "Sierra, Kathy",
              "23",
              "69.50",
              "10/09/2014",
              "Informática"
            },
            { "9788565837835",
              "Java Para Iniciantes - Crie, Compile e Execute Programas Java Rapidamente",
              "Aprenda os fundamentos da programação Java rapidamente com Herbert Schildt, autor best-seller em publicações sobre programação. Atualizado para Java SE 7, este livro apresenta os aspectos básicos da linguagem  como compilar e executar um programa Java  e discute as palavras-chave, a sintaxe e as estruturas que formam a base da linguagem. Aborda também alguns dos recursos mais avançados em Java, inclusive a programação com várias threads e os tipos genéricos. Uma introdução a Swing termina o livro.",
              "Schildt, Herbert",
              "8",
              "94.05",
              "10/10/2014",
              "Informática"
            }
        };
        
        for (String[] livro : livros) {
            Livro l = new Livro();
            l.setISBN(livro[0]);
            l.setTitulo(livro[1]);
            l.setDescricao(livro[2]);
            l.setAutor(livro[3]);
            l.setEstoque(Integer.parseInt(livro[4]));
            l.setPreco(Float.parseFloat(livro[5]));
            try {
                DateFormat df = new SimpleDateFormat("d/M/yy", Locale.ENGLISH);
                l.setDataCadastro(df.parse(livro[6]));
            } catch (ParseException e) {
                
            }
            l.setCategoria(livro[7]);
            
            controllerLivros.salvar(l);
        }
    }
    
    public static void clientes() {
        ControllerClientes controllerClientes = ControllerClientes.getInstance();
        
        String[][] clientes =
        {
            {
                "Thales Figueredo Pereira", 
                "thalesfp@gmail.com",
                "33476678",
                "thalesfp",
                "secret",
                "Coroados",
                "156",
                "103",
                "27267213",
                "Aterrado",
                "Volta Redonda",
                "RJ"
            },
            {
                "João Afonso Buchaim Pereira",
                "jbpereira@hotmail.com",
                "22344456",
                "jbpereira",
                "jb123",
                "J",
                "100",
                "",
                "27654123",
                "Jardim Ponte Alta",
                "Volta Redonda",
                "RJ"
            }
        };
        
        for (String[] cliente : clientes) {
            Cliente c = new Cliente();
            c.setNome(cliente[0]);
            c.setEmail(cliente[1]);
            c.setFone(cliente[2]);
            c.setLogin(cliente[3]);
            c.setSenha(cliente[4]);
            c.setRua(cliente[5]);
            c.setNumero(Integer.parseInt(cliente[6]));
            c.setComplemento(cliente[7]);
            c.setCEP(Integer.parseInt(cliente[8]));
            c.setBairro(cliente[9]);
            c.setCidade(cliente[10]);
            c.setEstado(cliente[11]);
            
            controllerClientes.salvar(c);
        }
    }
}
