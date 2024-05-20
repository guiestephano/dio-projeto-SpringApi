# dio-projeto-SpringApi
```Mermaid

classDiagram
    class Recibo
    Recibo : -Double valorHora
    Recibo : -Double valorTotal
    Recibo : -LocalDateTime entrada
    Recibo : -Local saida
    Recibo : -StatusPagamento statusPagamento
    Recibo : +Void total()

    class Carro
    Carro : -String placa
    Carro : -String modelo
    Carro : -Cor cor

    class Cliente
    Cliente : -String cpf
    Cliente : -String nome
    Cliente : -String telefone

    Recibo "1" *--Carro : carro
    Carro "1" o-- Cliente : cliente

    class StatusPagamento{
        <<enum>>
        +PAGO
        +PENDENTE
    }

    class Cor{
        <<enum>>
        +VERMELHO
        +PRETO
        +BRANCO
        +PRATA
    }
        

```