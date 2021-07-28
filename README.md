## Poc: API To-do List

## Para subir imagem do Postgres no Docker
```sh
docker run --name my-postgres -e POSTGRES_PASSWORD=secret -e POSTGRES_DB=db-test -p 5432:5432 -d postgres:12.4
```

- usuário: postgres
- senha: secret
- porta: 5432
- database: db-test

![alt text](src/main/resources/docs/config-db-local-postgres.png)

## Acesse o git abaixo para montar o ambiente kafka 
- [Acesse aqui](https://github.com/lensesio/fast-data-dev)
- Basta clonar o projeto e no terminal executar:
* Obs: essa imagem pede pelo menos 4Gb de ram :(
```sh
docker run --rm --net=host lensesio/fast-data-dev
```

- Caso sua máquina não aguente como a minha, use o docker-compose que está no projeto:
```sh
cd src/main/resources/kafka

docker-compose up
```

- Com a imagem de pé, acesse para validar: [kafka-lenses](http://127.0.0.1:3030/)





















## Micronaut 2.5.11 Documentation

- [User Guide](https://docs.micronaut.io/2.5.11/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.5.11/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.5.11/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)

## Feature lombok documentation

- [Micronaut Project Lombok documentation](https://docs.micronaut.io/latest/guide/index.html#lombok)

- [https://projectlombok.org/features/all](https://projectlombok.org/features/all)

