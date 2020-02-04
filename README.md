## Peoples Map API

Api desenvolvida utilizando o framework Spring-Boot na versão 2.2.4 com o banco dados Postgres.
Com a linguagem java na versão 8.


O projeto pode ser rodado localmente, através dos comandos:


### `npm clean install`
Para instalar todas dependencias


### `npm spring-boot:run`
Para iniciar a aplicação


OBS:. Para rodar a aplicação é necessário a presença de uma instância do Postgres 
em execução com as seguintes configurações:
 - database: peoplesmap
 - username: postgres
 - password: Postgres


Após a execução a api estará disponível na url:
 - http://localhost:8000


As rotas seguem o padrão REST:

 - GET localhost:8000/api/v1/peoples
 - GET localhost:8000/api/v1/peoples/{id}
 - POST localhost:8000/api/v1/peoples
 - PUT localhost:8000/api/v1/peoples/{id}
 - DELETE localhost:8000/api/v1/peoples/{id}


O projeto também se encontra disponível hospedado no Heroku:
- https://peoplesmap-api.herokuapp.com:8000

está hospedado no plano gratuito onde tem acesso a uma instancia do Postgres
e a cada 1 hora sem acessos entra em modo de hibernação, demorando alguns segundos
para retornar ao seu funcionamento após o primeiro acesso.
