<h1 align="center"><img src="https://capgemini.proway.com.br/assets/img/logo-capgemini.png"/></h1>

# Sobre

<p>Neste repositório se encontra as soluções dos problemas de programação propostos pela Capgemini no âmbito da Academia Capgemini.</p>

## Tecnologias ultilizadas

<ul>
    <li>Java 11</li>
    <li>Eclipse IDE for Java Developers - 2021 - 03</li>
    <li>Junit 5</li>
</ul>

## Como rodar a aplicação

<p>Clone o repositório dentro da pasta <strong>eclipse-workspace</strong></p>

`$ git clone https://github.com/DausterBarbosa/AcademiaCapgemini.git`

<p>Abra o Eclipse vá em <strong>File</strong> -> <strong>Import</strong></p>

<p>Selecione <strong>Existing Projects into Workspace</strong> e clique em <strong>Next</strong></p>

<img src=".github/Screenshot_2022-02-18_14-39-53.png"/>

<p>No próximo painel selecione <strong>Select root directory</strong> clique em <strong>Browse</strong> e procure o diretório do <strong>eclipse-workspace</strong>, no painel <strong>Projects</strong> será listado todos os projetos do <strong>eclipse-workspace</strong>, selecione o projeto desejado e clique em <strong>Finish</strong>, feito isso o projeto será importado para o Eclipse e estará pronto para ser trabalhado.</p>

<img src=".github/Screenshot_2022-02-18_14-40-32.png"/>

## Como o projeto está estruturado

<p>O projeto está estruturado da seguinte forma:</p>
<img src=".github/Screenshot_2022-02-18_15-19-24.png"/>
<p>Dentro de <strong>src</strong> contém os pacotes com a solução dos desafios em ordem e um pacote contendo os testes unitários dos mesmos, dentro de cada pacote de solução de um desafio contém uma classe com o algoritmo <strong>(EX: Desafio01Solucao.java)</strong> que resolve o problema proposto, e uma classe contendo o método Main <strong>(EX: Desafio01.java)</strong> onde é instanciada a classe com o algoritmo.</p>

## Como executar os testes unitários

<p>Para executar os testes basta clicar com o botão direito sobre o arquivo de teste ir até <strong>Run As</strong> e depois clicar em <strong>JUnit Test</strong>, se quiser executar todos os testes clique com o botão direito sobre <strong>Academia Capgemini</strong> e siga os mesmos passos descritos antes.</p>

<img src=".github/Screenshot_2022-02-18_15-37-37.png"/>

<p>Se tudo ocorrer como o esperado o painel do Junit não irá acusar nenhum erro nem falha.</p>

<img src=".github/Screenshot_2022-02-18_15-44-50.png"/>
