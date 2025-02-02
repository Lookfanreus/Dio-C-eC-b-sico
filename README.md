# Sistema Bancário

Este projeto é um sistema bancário simples desenvolvido em Java, utilizando o paradigma de Programação Orientada a Objetos e AspectJ para implementar funcionalidades básicas de contas bancárias.

## Estrutura do Projeto

O projeto é organizado da seguinte forma:

```
sistema-bancario
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── bancario
│   │   │   │       ├── App.java
│   │   │   │       ├── aspect
│   │   │   │       │   └── SaldoAspect.java
│   │   │   │       ├── model
│   │   │   │       │   ├── Conta.java
│   │   │   │       │   └── Cliente.java
│   │   │   │       ├── service
│   │   │   │       │   ├── ContaService.java
│   │   │   │       │   └── ClienteService.java
│   │   │   │       └── util
│   │   │   │           └── Utils.java
│   │   └── resources
│   │       └── META-INF
│   │           └── aop.xml
│   └── test
│       └── java
│           └── com
│               └── bancario
│                   ├── AppTest.java
│                   ├── aspect
│                   │   └── SaldoAspectTest.java
│                   ├── model
│                   │   ├── ContaTest.java
│                   │   └── ClienteTest.java
│                   └── service
│                       ├── ContaServiceTest.java
│                       └── ClienteServiceTest.java
├── pom.xml
└── README.md
```

## Funcionalidades

- **Gerenciamento de Contas**: Criação, depósito e saque em contas bancárias.
- **Gerenciamento de Clientes**: Adição e gerenciamento de informações dos clientes.
- **Verificação de Saldo**: Uso de AspectJ para interceptar operações de saque e verificar se o saldo é suficiente.

## Como Executar

1. Clone o repositório.
2. Navegue até o diretório do projeto.
3. Compile o projeto utilizando Maven:
   ```
   mvn clean install
   ```
4. Execute a aplicação:
   ```
   mvn exec:java -Dexec.mainClass="com.bancario.App"
   ```

## Testes

Os testes unitários estão implementados para garantir a funcionalidade correta das classes e serviços. Para executar os testes, utilize o comando:
```
mvn test
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.