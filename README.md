# 🎬 NerdVault - Gerenciador de Filmes Nerd

Projeto desenvolvido para a disciplina de **Dev. [cite_start]Software Enge** da **FIAP**, com o objetivo de praticar o fluxo de versionamento profissional utilizando Git e GitHub[cite: 2, 4].

## 🚀 O Projeto
O **NerdVault** é uma API REST para gerenciamento de um catálogo de filmes voltado ao público nerd, permitindo organizar títulos por franquias e anos de lançamento.

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (Banco em memória)
- **Lombok**

## 📂 Fluxo de Desenvolvimento (GitFlow)
[cite_start]Seguindo os requisitos da atividade[cite: 8], o projeto foi estruturado em etapas:

1. [cite_start]**Etapa 1**: Setup inicial e primeiro commit na branch `main`[cite: 9, 15].
2. [cite_start]**Etapa 2**: Criação da branch `feature/cadastro-filmes` para implementação da entidade, repositório e endpoints básicos de cadastro e listagem[cite: 16, 17].
3. [cite_start]**Etapa 3**: Criação da branch `feature/busca-e-manutencao` para implementar busca por franquia, atualização e exclusão[cite: 25, 26].

## 📡 Endpoints da API
- `GET /filmes`: Lista todos os filmes.
- `GET /filmes/busca?franquia=Nome`: Busca filmes por franquia.
- `POST /filmes`: Cadastra um novo filme.
- `PUT /filmes/{id}`: Atualiza os dados de um filme.
- `DELETE /filmes/{id}`: Remove um filme do catálogo.

## ⚙️ Como Executar
1. Clone o repositório.
2. Certifique-se de ter o Maven instalado.
3. Execute o comando: `./mvnw spring-boot:run`.
4. O sistema estará disponível em `http://localhost:8080`.
