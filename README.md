# 🎬 NerdVault - Gerenciador de Filmes Geek

O **NerdVault** é uma API REST desenvolvida para centralizar e organizar o catálogo de filmes das suas franquias favoritas. Este projeto foi construído utilizando **Java 17** e **Spring Boot 3**, focando em uma arquitetura limpa e funcional.

Este repositório faz parte da atividade prática de versionamento profissional da disciplina de **Dev. Software Enge**.

---

## 🚀 Funcionalidades da Aplicação

A API permite gerenciar o ciclo de vida completo de um acervo de filmes (CRUD):

* **Cadastro Inteligente**: Salva títulos informando franquia e ano de lançamento.
* **Listagem Completa**: Visualização de todo o acervo cadastrado.
* **Busca por Franquia**: Filtro avançado com suporte a *Case Insensitive* (ignora maiúsculas/minúsculas).
* **Manutenção de Dados**: Atualização de informações e remoção de títulos do catálogo.

---

## 🛠️ Tecnologias

* **Linguagem**: Java 17
* **Framework**: Spring Boot 3.x
* **Banco de Dados**: H2 (Banco em memória para execução imediata)
* **Persistência**: Spring Data JPA com Hibernate
* **Utilitários**: Lombok

---

## 🧬 Documentação de Desenvolvimento (Fluxo Git)

Para fins de avaliação, este projeto seguiu rigorosamente o fluxo de versionamento solicitado:

### **Etapa 1: Projeto Inicial**
* Inicialização do Git e primeiro commit estrutural realizado diretamente na branch `main`.

### **Etapa 2: Primeira Solicitação**
* **Branch**: `feature/cadastro-filmes`
* **Melhoria**: Implementação da entidade `Filme`, `FilmeRepository` e endpoints de cadastro e listagem.
* **Ação**: Pull Request aberto e merge realizado na `main`.

### **Etapa 3: Segunda Solicitação**
* **Branch**: `feature/busca-e-manutencao`
* **Melhoria**: Adição de busca por franquia, edição (`PUT`) e exclusão (`DELETE`).
* **Ação**: Segundo Pull Request finalizado com merge na branch principal.

---

## 📡 Guia de Utilização (Endpoints)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **POST** | `/filmes` | Cadastra um novo filme no acervo. |
| **GET** | `/filmes` | Lista todos os filmes cadastrados. |
| **GET** | `/filmes/busca` | Busca filmes por franquia (ex: `?franquia=Marvel`). |
| **PUT** | `/filmes/{id}` | Atualiza os dados de um filme existente. |
| **DELETE** | `/filmes/{id}` | Remove um filme do catálogo pelo ID. |

---

## ⚙️ Como Executar

1. Clone o repositório: `git clone https://github.com/SEU_USUARIO/NerdVault.git`
2. Certifique-se de ter o **Maven** e o **Java 17** instalados.
3. Execute a aplicação via terminal: `./mvnw spring-boot:run`.
4. Acesse o Console do H2 para validar os dados: `http://localhost:8080/h2-console`.

---

### 🎓 Desenvolvido por:
**Cássia Emanuelly**
Estudante de SI - FIAP.
