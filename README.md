# desafio

Esta aplicação foi desenvolvida no Spring Tool Suite 4 e usa um banco PostgreSQL,
para configurar o ambiente é necessário abrir no projeto em src/main/resources 
no arquivo aplication.properties, em spring.datasource.url= mudar pelo url do seu banco de dados postgresql,
em spring.datasource.username= o nome do usuario do banco postgresql em seguida por a senha em
spring.datasource.password=

Para mudar a porta no application.properties ex: server.port=8081

com o aplication.properties configurado basta selecionar o projeto e Run As Spring Boot App e no browser http://localhost:8080/index.

Obs: No src/main/java ha um pacote com o nome utils e dentro dele uma classe chamada Popular Banco,
ele popula o banco com o arquivo .csv da base de dados no metodo salvar, este metodo só precisa ser executado uma vez,
apos executa-lo comente a assinatura @PostConstruct. 



