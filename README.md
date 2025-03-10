# Schedule API :mailbox:

## Descrição

O **Schedule API** é um projeto pessoal desenvolvido para testar e experimentar a funcionalidade de envio de e-mails utilizando o Spring Boot. Este projeto serve como uma base para entender e implementar serviços de agendamento e notificações por e-mail em aplicações Java. Foi inspirado no projeto da Giulia Bezerra: [E-mail Spring Boot](https://github.com/giuliana-bezerra/email-springboot/blob/22f00878c5187d82780840234b404c8afa84664a/README.md)

## Funcionalidades

- **Envio de E-mails:** Implementa o envio de e-mails utilizando o Spring Boot.

## Tecnologias e Ferramentas Utilizadas

- **Java 17** - Linguagem de programação principal do projeto.
- **Spring Boot 3.4.3** - Framework para construção de aplicações Java.
- **Spring Mail** - Módulo do Spring utilizado para o envio de e-mails.
- **Banco de dados H2** - Banco de dados em memória
- **Maven** - Ferramenta de automação de compilação e gerenciamento de dependências.
- **MailTrap** - Ferramenta para testar envio de e-mails

## Pré-requisitos

Certifique-se de ter instalado:
- **Java 17**
- **Maven**

## Configuração e Execução

```bash
# Clone o repositório
git clone https://github.com/Viniberaldo/schedule-api.git

# Navegue até o diretório do projeto
cd schedule-api

# Configure as propriedades de e-mail no arquivo application.properties
nano src/main/resources/application.properties
# Adicione ou edite as seguintes linhas:
spring.mail.host=smtp.seuprovedor.com
spring.mail.port=587
spring.mail.username=seu_usuario
spring.mail.password=sua_senha
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

# Compile o projeto
mvn clean install

# Execute a aplicação
mvn spring-boot:run
```
A aplicação deverá estar disponível em `http://localhost:8080`

## Endpoints Disponíveis

- POST /api/schedule - Agenda uma nova tarefa de envio de e-mail.

exemplo com cURL:
```
curl -X POST http://localhost:8080/appointment \
     -H "Content-Type: application/json" \
     -d '{"name":"João","dateTime":"10/03/25 10:25","email":"joao@email.com"}'
```

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.
