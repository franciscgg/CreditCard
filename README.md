## 📝 Sobre
Este é um sistema de cartão de crédito desenvolvido em Java. Aqui estão as principais partes do código:

### Classe `CreditCard`:
- Representa um cartão de crédito.
- Possui atributos como `limitCard` para o limite de crédito, `saldo` para o saldo disponível e `compras` para armazenar as compras realizadas.
- O construtor `CreditCard(double limitCard)` inicializa o cartão com o limite especificado.
- O método `lancaCompra(Compra compra)` registra uma nova compra no cartão, atualizando o saldo e adicionando a compra à lista de compras.
- Os métodos `getLimitCard()`, `getSaldo()` e `getCompras()` fornecem acesso aos atributos do cartão.

### Classe `Compra`:
- Representa uma transação de compra.
- Possui atributos `descricao` para a descrição da compra e `valor` para o valor da compra.
- O construtor `Compra(String descricao, double valor)` inicializa uma compra com a descrição e valor especificados.
- Os métodos `getDescricao()` e `getValor()` fornecem acesso aos atributos da compra.
- O método `toString()` retorna uma representação em string da compra.
- A implementação da interface `Comparable<Compra>` permite a comparação de compras com base em seus valores.

### Classe `Main`:
- Contém o método `main()` para iniciar o programa.
- Solicita ao usuário o limite do cartão.
- Solicita descrição e valor das compras até que o usuário decida sair.
- Após as compras, exibe as compras realizadas e o saldo do cartão.

## 🚀 Tecnologias
<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" title="Java" width="40" height="40"/>
</div>

## 💼 Linkedin
### link: [Francisco Hélio](https://www.linkedin.com/in/francisco-helio/)
