# MySmartKitchen 🍳

## 📖 Sobre o projeto
O **MySmartKitchen** é uma API desenvolvida em **Java Spring Boot** para gerenciar pedidos e produtos em um ambiente de cozinha inteligente.  
O sistema permite que clientes façam pedidos via tablet, que são enviados para a cozinha, enquanto administradores podem gerenciar o cardápio e acompanhar os pedidos.

---

## 🛠️ Tecnologias utilizadas
- **Java 17** + **Spring Boot**
- **Spring Security** (autenticação e autorização com JWT)
- **JPA/Hibernate** (persistência)
- **Flyway** (migração de banco de dados)
- **Docker** (containerização)
- **PostgreSQL** (banco de dados relacional)

---

## ⚙️ Funcionalidades principais
- CRUD de **Clientes**, **Produtos** e **Pedidos**
- Relacionamentos 1:N e N:M (Pedido ↔ Produto via Pedido_Item)
- Autenticação e autorização com **Spring Security**
- Migração de banco com **Flyway**
- Deploy e execução em containers via **Docker**

---

## 📦 Estrutura de entidades

### Cliente
- id (PK)
- nome
- telefone/email (opcional)

### Pedido
- id (PK)
- cliente_id (FK)
- status (PREPARANDO, PRONTO, ENTREGUE)
- data_criacao

### Pedido_Item
- id (PK)
- pedido_id (FK)
- produto_id (FK)
- quantidade

### Produto
- id (PK)
- nome
- descricao
- preco
- categoria
- disponivel (boolean)
- imagem_url (string)

### Administrador
- id (PK)
- username
- senha (hash)
- role (ex.: ADMIN)

---

## 🔑 Autenticação
- Implementada com **Spring Security** e **JWT**
- Administradores possuem permissões especiais (role: ADMIN)
- Fluxo:
  1. Login com usuário e senha
  2. Geração de token JWT
  3. Token enviado em cada requisição protegida

---

## 🗂️ Migração com Flyway
Scripts SQL versionados em `src/main/resources/db/migration`:
- `V1__create_tables.sql` → criação das entidades
- `V2__insert_initial_data.sql` → dados iniciais de produtos e administrador

---

## 🚀 Como rodar o projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/seuusuario/MySmartKitchen.git
cd MySmartKitchen

**# Configuração de ambientes
**## Crie um arquivo .env baseado no .env.example e configure suas credenciais:

DB_URL=jdbc:postgresql://localhost:5432/mysmartkitchen
DB_USER=seuUsuario
DB_PASSWORD=suaSenha
JWT_SECRET=seuSegredoAqui

