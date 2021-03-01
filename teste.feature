# language: pt
Funcionalidade: Teste AGE
Cenario: Realizar estimativa FAP
Dado que esta na pagina gestao fap
Quando inserir nome da empresa
	E inserir FAP
	E selecionar RAT
	E inserir a Projecao de massa salarial
	E clicar no botao estimar FAP
Entao deve conferir os valores


Cenario: Realizar Pesquisa
Dado que esteja na pagina blog
Quando inserir pesquisa
E clicar no  botao
Entao deve verificar resultado