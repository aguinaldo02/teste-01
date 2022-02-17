# SRE-BECA-LAB-MICROSERVICES

## Desafio

Construir um sistema utilizando Microserviçoes via Spring Boot e Spring Cloud.

## Arquitetura

A seguinte imagem ilustra a arquittura a ser seguida:

![Arquitetura Microserviços Desafio](/Ms_Architecture_Desafio_1.png "Arquitetura Microserviços Desafio 1")

## Requisitos

* O sistema deve possuir dois Microserviços;
* O Microserviço 1 deve possuir uma camada de persistência utilizando um banco em memória;
* O Microserviço 2 deve requisitar as informações no Microserviço 1 para a relização de alguma lógica com estas informações e disponibilização das mesmas;
* Os Microserviços deve ser registrados em um Service Discovery;
* O sistema deve ser exposto via API Gateway, e todas as requisições entre os Microserviços devem ser feitos via o mesmo;
* Ambos os Microserviços e o ApiGateway devem possuir portas aleatórias:
    * Microserviço 1 - 8100-8199
    * Microserviço 2 - 8200-8299
    * Api Gateway - 8700-8799
