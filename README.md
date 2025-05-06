# Santander Dev Week 2023

Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class User {
        -Long id
        -String name
        -Account account
        -Card card
        -Feature[] features
        -News[] news
    }

    class Account {
        -Long id
        -String number
        -String agency
        -Number balance
        -Number limit
    }

    class Feature {
        -Long id
        -String icon
        -String description
    }

    class Card {
        -Long id
        -String number
        -Number limit
    }

    class News {
        -Long id
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
