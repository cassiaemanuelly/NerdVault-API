# 🎬 NerdVault - Gerenciador de Filmes Geek

O **NerdVault** é uma API REST desenvolvida para centralizar e organizar o catálogo de filmes das suas franquias favoritas. 

Este repositório faz parte da atividade prática de versionamento profissional da disciplina de **Dev. [cite_start]Software Enge**[cite: 1, 2].

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
