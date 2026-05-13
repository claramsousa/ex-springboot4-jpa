# SistemaPedidos-Spring

Este é um sistema de back-end para gestão de pedidos, desenvolvido com o objetivo de aplicar padrões de arquitetura REST, persistência de dados relacional e tratamento especializado de erros. O projeto utiliza as versões mais recentes do ecossistema Java (Spring Boot 4.x).

---

## Tecnologias e Ferramentas
* **Java 21** (LTS)
* **Spring Boot 4.0.2**
* **Spring Data JPA** (Hibernate)
* **PostgreSQL** (Banco de dados persistente)
* **H2 Database** (Banco de dados em memória para o perfil `test`)
* **SpringDoc OpenAPI (Swagger)** (Documentação interativa da API)
* **Maven** (Gerenciamento de dependências)

---

## Funcionalidades Principais
* **CRUD Completo:** Gerenciamento de Usuários, Pedidos e Produtos.
* **Mapeamento de Associações:** Implementação de relacionamentos Um-para-Muitos, Muitos-para-Muitos e Um-para-Um.
* **Tratamento de Exceções Global:** Uso de `@ControllerAdvice` para capturar erros como `ResourceNotFoundException` e `DatabaseException`, retornando códigos HTTP semânticos (404, 400, etc).
* **Segurança de Credenciais:** Configuração de perfis de ambiente (`dev`, `test`) e uso de **Variáveis de Ambiente** para proteção de dados sensíveis.

---

## Documentação da API (Swagger)
A API conta com uma interface visual para testes e consulta de endpoints. Com a aplicação rodando, acesse:
`http://localhost:8080/swagger-ui/index.html`

---

## Estrutura do Projeto
O projeto segue o padrão de camadas para facilitar a manutenção:
* `controladores`: Endpoints da API.
* `servicos`: Lógica de negócio e regras do sistema.
* `repositorios`: Interfaces de acesso ao banco de dados (JPA).
* `entidades`: Classes que mapeiam as tabelas do PostgreSQL.
* `exceptions`: Handler global para tratamento de erros.

---

## Como configurar e rodar

### 1. Pré-requisitos
* Java 21+
* PostgreSQL instalado e rodando.

### 2. Configuração do Banco de Dados
1. Crie um banco de dados no Postgres chamado `jpa_hibernate_projeto`.
2. O projeto utiliza o perfil `dev` para o PostgreSQL. Certifique-se de que no `application.properties` o perfil ativo seja:
   ```properties
   spring.profiles.active=dev

### 3. Variaveis do ambiente
Configure as seguintes variáveis na sua IDE ou no seu sistema operacional:
* DB_USER: Seu usuário do PostgreSQL (ex: postgres)
* DB_PASSWORD: Sua senha do PostgreSQL.

### 4. Execução
Clone o repositório e execute a classe principal ProjetoSbApplication.java ou utilize o terminal:
```
mvn spring-boot:run

