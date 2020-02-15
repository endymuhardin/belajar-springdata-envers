# Belajar Spring Data Envers #


## Menyiapkan Database ##

1. Setup user database

    ```
    grant all on belajarspringdataenvers.* to belajar@localhost identified by 'envers';
    ```

2. Create database

    ```
    create database belajarspringdataenvers;
    ```

## Insert Product ##

`POST` ke `http://localhost:8080/api/product` dengan body sebagai berikut:

```json
{
  "code": "P-001",
  "name": "Product 001",
  "price" : "100000"
}
```

## View Product ##

`GET` ke `http://localhost/api/product`. Hasilnya seperti ini:

```json
{
  "content": [
    {
      "id": "e4b24905-a1d2-42f0-80ad-5e0a4b020b7e",
      "code": "P-001",
      "name": "Product 001",
      "price": 100000.00
    }
  ],
  "pageable": {
    "sort": {
      "sorted": false,
      "unsorted": true,
      "empty": true
    },
    "offset": 0,
    "pageNumber": 0,
    "pageSize": 20,
    "unpaged": false,
    "paged": true
  },
  "last": true,
  "totalPages": 1,
  "totalElements": 1,
  "size": 20,
  "number": 0,
  "numberOfElements": 1,
  "first": true,
  "sort": {
    "sorted": false,
    "unsorted": true,
    "empty": true
  },
  "empty": false
}
```

## Update Product ##

`PUT` ke `http://localhost:8080/api/product/e4b24905-a1d2-42f0-80ad-5e0a4b020b7e` dengan body sebagai berikut:

```json
{
  "code": "P-001x",
  "name": "Product 001x",
  "price" : "100001"
}
```