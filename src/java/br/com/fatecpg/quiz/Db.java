/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

import java.util.ArrayList;

/**
 *
 * @author a
 */
public class Db {
    
    public static ArrayList <Question> getTest(){
       
      ArrayList<Question> test = new ArrayList <>();
       
        
       
      
        test.add(new Question("1.Sobre sistemas operacionais, assinale a alternativa falsa:","A arquitetura de Von Neumann era baseada em multiprogramação através da CPU (Unidade Central de Processamento).", new String[]{"Sistema operacional é um gerenciador de recursos, ou seja, uma interface entre o hardware e o usuário.","Direciona o processador no uso dos recursos do sistema e sobre o momento de executar outros programas.","A primeira geração de computadores era caracterizada por válvulas e painéis de programação.","A arquitetura de Von Neumann era baseada em multiprogramação através da CPU (Unidade Central de Processamento)."}));
        test.add(new Question("2.Sobre monoprogramação, assinale a alternativa falsa:","Sistema projetado para gerenciar a execução de vários programas (jobs) por vez.", new String[]{"Nessa época de jobs e lotes (ou batchs), o sistema operacional era monoprogramável.","Sistema projetado para gerenciar a execução de vários programas (jobs) por vez.","Qualquer outro programa para ser executado, deve aguardar o término do programa corrente.","Nesse sistema o processador, a memória e os periféricos permanecem exclusivamente dedicados à execução de um único\n" +
"programa."}));
        test.add(new Question("3.Sobre monitor residente, assinale a alternativa falsa:","Programa que fica temporariamente em memória.", new String[]{"Sequenciamento automático de jobs, transferindo o controle de um job a outro.","Programa que fica temporariamente em memória.","Qualquer outro programa para ser executado, deve aguardar o término do programa corrente.","Nesse sistema o processador, a memória e os periféricos permanecem exclusivamente dedicados à execução de um único\n" +
"programa."}));
        test.add(new Question("4.Sobre multiprogramação, assinale a alternativa falsa:","Usuários não tem interação com o programa de execução.", new String[]{"Manter mais de um programa em “execução” simultaneamente.","Duas inovações de hardware (interrupção e discos magnéticos) possibilitaram o surgimento da multiprogramação.","TimeSharing era utilizado para multiprogramação, para atendimento de tarefas interativas, dando ilusão de possuir a\n" +
"máquina dedicada a execução de seu programa.","Usuários não tem interação com o programa de execução."}));
        test.add(new Question("5.Sobre sistemas multitarefa, assinale a alternativa falsa:","Existem dois tipos de sistemas multitarefa: cooperativo e não-preemptivo.", new String[]{"Sistemas multitarefa são capazes de executar várias tarefas simultaneamente.","Existem dois tipos de sistemas multitarefa: cooperativo e não-preemptivo.","Nos sistemas multitarefa preemptivos o S.O. define prioridades conforme a necessidade momentânea de cada programa.","Nos sistemas preemptivos os recursos são otimizados pelo gerenciamento eficiente do hardware disponível ao estabelecer\n" +
"prioridades em função das necessidades de cada programa."}));
        test.add(new Question("6.Sobre processos, assinale a alternativa falsa:","Vários programas podem estar ativos a cada momento.", new String[]{"É um programa em execução.","Contém um contador de programa que especifica qual a próxima instrução a ser seguida.","Vários programas podem estar ativos a cada momento.","Início do sistema, execução de chamada ao sistema de criação de processos, solicitação do usuário para criar um novo\n" +
"processo e início de um job em lote são os principais eventos que levam à criação de processos."}));
        test.add(new Question("7.Sobre hierarquia de processos, assinale a alternativa falsa:","O Windows possui o conceito de hierarquia de processos.", new String[]{"Pai cria um processo filho, processo filho pode criar seu próprio processo.","Os processos formam uma hierarquia. O UNIX chama isso de “grupo de processos” (pais e filhos).","O Windows possui o conceito de hierarquia de processos.","Possíveis estados de processos: em execução, bloqueado e pronto."}));
        test.add(new Question("8.Sobre THREADS, assinale a alternativa exceção:","Criação de processos é mais “barato” computacionalmente que a de threads.", new String[]{"Uma unidade básica de utilização de CPU, sendo executado dentro de um processo de forma independente utilizando seus\n" +
"recursos.","Um processo com um único thread não pode executar nada de útil enquanto o disco está sendo acessado. Com threads\n" +
"múltiplos, um thread pode continuar a executar enquanto o outro espera pelo E/S.","Criação de processos é mais “barato” computacionalmente que a de threads.","Todas os threads em um processo partilham o mesmo espaço de endereçamento."}));
        test.add(new Question("9.Assinale a alternativa correta. O Modelo Entidade-Relacionamento é utilizado para:","Modelar os processos de negócio.", new String[]{"Modelar os processos de negócio.","Mapear as principais funções de negócio de um sistema.","Avaliar a necessidade de índices de acesso às estruturas de armazenamento.","Replicar os dados necessários à execução das funções de negócio de um sistema."}));
        test.add(new Question("10.Em um diagrama entidade relacionamento, uma situação de composição tal qual “empregado gerencia empregado”, geralmente é apresentada como:","Auto relacionamento", new String[]{"Entidade fraca","Relacionamento associativo","Auto relacionamento","Relacionamento interativo"}));
        test.add(new Question("11.Assinale a opção que apresenta uma das finalidades da análise de requisitos.","Organizar, levantar e documentar funcionalidades e restrições.", new String[]{"Gerar versões dos artefatos produzidos.","Prover o ambiente adequado para a organização.","Documentar processos de negócio usando casos de uso de negócios.","Organizar, levantar e documentar funcionalidades e restrições."}));
        test.add(new Question("12.Disciplina: Engenharia de Software (TI) - Assuntos: RUP (Rational Unified Process) No RUP (Rational Unified Process), casos de uso são:","cenários de utilização do sistema por usuários.", new String[]{"casos de usuários unificados em processos de racionalização.","cenários de utilização do sistema por usuários.","cenários de racionalização de aplicações.","casos de utilização do RUP para maior racionalidade na aplicação dos recursos."}));
        test.add(new Question("13.A disciplina de Gerenciamento de Projetos do RUP enfatiza o planejamento de um projeto interativo por meio.","dos riscos e iterações.", new String[]{"dos riscos e iterações.","do ciclo de vida e iterações.","do ciclo de vida e métricas.","do ciclo de vida e riscos."}));
        test.add(new Question("14.Na Engenharia de Software, os requisitos que descrevem o comportamento das funções do sistema, estabelecendo uma descrição detalhada das funções, são os requisitos:","funcionais", new String[]{"funcionais","externos","de sistema","não funcionais"}));
        test.add(new Question("15.No Unified Process os papéis não são pessoas; eles descrevem como as pessoas se comportam no negócio e quais são as responsabilidades que elas têm. Nesse sentido, um Desenvolvedor desempenha os papéis de:","Implementador, Integrador e Designer.", new String[]{"Analista de Sistemas, Designer de Negócios e Revisor de Requisitos.","Analista de Teste, Implementador e Designer de Interface de Usuário.","Revisor de Requisitos, Analista de Teste e Revisor do Projeto.","Implementador, Integrador e Designer."}));
        test.add(new Question("16.A série ISO 9000 é:","Uma norma internacional que descreve um sistema de qualidade recomendado", new String[]{"Um conjunto de diretrizes para qualidade","Um conjunto de formas e procedimentos para garantir qualidade","Uma norma internacional que descreve um sistema de qualidade recomendado","Uma norma de gerência de projetos"}));
        test.add(new Question("17.Qual das situações abaixo NÃO representa um risco externo que seja imprevisível?","Inflação", new String[]{"Mudanças governamentais e de leis","Desastres naturais","Vandalismo","Inflação"}));
        test.add(new Question("18.Eventos ou resultados desfavoráveis ao projeto são conhecidos como:","Ameaças", new String[]{"Ameaças","Oportunidades","Surpresas","Contingências"}));
        test.add(new Question("19.Eventos ou resultados favoráveis ao projeto são conhecidos como:","Oportunidades", new String[]{"Ameaças","Oportunidades","Surpresas","Contingências"}));
        test.add(new Question("20.Gerenciamento dos Riscos em um projeto pode ser definido como uma função que visa reduzir:","A Incerteza", new String[]{"As Falhas","O Prazo","Os Custos","A Incerteza"}));
        return test;
    }
}
