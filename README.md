DOCUMENTAÇÃO DE TESTES FRONT-END AUTOMATIZADOS
-----------------------------------------------------------------------------------------
ATIVIDADE DO ENCONTRO REMOTO 2, UNIDADE CURRICULAR 11 (ER2UC11)
-----------------------------------------------------------------------------------------
RELATÓRIO DE TESTE AUTOMATIZADO REFERENTE AO ARQUIVO TesteLoginEplay.java
-----------------------------------------------------------------------------------------
Este relatório versa do teste automatizado referente ao arquivo TesteLoginEplay.java.
Destina-se a testar a funcionalidade de Login e Senha da página do site de jogos 
desenvolvida como atividade ao longo das aulas de Front-End.
-----------------------------------------------------------------------------------------
Ferramentas empregadas: 
1) Visual Studio Code (com aplicações Angular/Angular Material);
2) Eclipse IDE for Java Developers (com aplicações JDK, Selenium e ChromeDriver);
3) Navegador Google Chrome;
-----------------------------------------------------------------------------------------
Especificações do sistema de teste:
1) Notebook Dell com sistema operacional Windows e acesso à internet;
2) Navegador Google Chrome (Versão oficial 101.0.4951.67 64 bits);
-----------------------------------------------------------------------------------------
Teste realizado:
1) Teste automatizado usando Eclipse, por meio de código Java.
2) Foram testadas 4 entradas (3 erradas e 1 correta) nos campos Login e Senha do site.
O teste automático para senha está nas linhas 33-46 e, para o login, 47-60, no arquivo
.java supracitado.
-----------------------------------------------------------------------------------------
Resultado dos testes:
Sucesso. Fixados login ou senha, quando o código finalmente, na quarta tentativa, percorre
a senha/login corretos, ocorre o redirecionamento à página Index, do site, conforme
programado.
-----------------------------------------------------------------------------------------
Relatório de problemas:
Por vezes, a página monitorada pelo Eclipse tem problemas de carregamento, chegando até
a travar. Supõe-se que a razão disso seja problemas de memória do computador de rodar,
simultaneamente, o Visual Studio Code, o Eclipse e o navegador Chrome em modo monitorado.
-----------------------------------------------------------------------------------------
Pessoas envolvidas no teste:
1) Marco Antonio Calil Machado (desenvolvedor);
2) Jéssica Santo (supervisor);
-----------------------------------------------------------------------------------------
Repositório dos arquivos:
https://github.com/ma2ke3/ER2UC11
-----------------------------------------------------------------------------------------