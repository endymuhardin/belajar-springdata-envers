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

## Lihat History Perubahan Produk ##

`GET` ke `http://localhost:8080/api/history/product/e4b24905-a1d2-42f0-80ad-5e0a4b020b7e`

Outputnya seperti ini

```json
{
  "content": [
    {
      "metadata": {
        "delegate": {
          "id": 1,
          "timestamp": 1581780033266,
          "revisionDate": "2020-02-15T15:20:33.266+0000"
        },
        "revisionNumber": 1,
        "revisionDate": "2020-02-15T22:20:33.266",
        "revisionInstant": "2020-02-15T15:20:33.266Z",
        "requiredRevisionNumber": 1,
        "requiredRevisionInstant": "2020-02-15T15:20:33.266Z",
        "revisionType": "UNKNOWN"
      },
      "entity": {
        "id": "338fa78f-7562-41e4-8b3c-b5d487e6c3aa",
        "code": "P-001",
        "name": "Product 001",
        "price": 100000.00,
        "createdBy": {
          "username": "user001",
          "hibernateLazyInitializer": {}
        },
        "lastUpdatedBy": {
          "username": "user001",
          "hibernateLazyInitializer": {}
        },
        "createdTime": "2020-02-15T22:20:33",
        "lastUpdatedTime": "2020-02-15T22:20:33"
      },
      "revisionNumber": 1,
      "requiredRevisionNumber": 1,
      "revisionInstant": "2020-02-15T15:20:33.266Z",
      "requiredRevisionInstant": "2020-02-15T15:20:33.266Z"
    },
    {
      "metadata": {
        "delegate": {
          "id": 2,
          "timestamp": 1581780044828,
          "revisionDate": "2020-02-15T15:20:44.828+0000"
        },
        "revisionNumber": 2,
        "revisionDate": "2020-02-15T22:20:44.828",
        "revisionInstant": "2020-02-15T15:20:44.828Z",
        "requiredRevisionNumber": 2,
        "requiredRevisionInstant": "2020-02-15T15:20:44.828Z",
        "revisionType": "UNKNOWN"
      },
      "entity": {
        "id": "338fa78f-7562-41e4-8b3c-b5d487e6c3aa",
        "code": "P-001x",
        "name": "Product 001x",
        "price": 100001.00,
        "createdBy": {
          "username": "user001",
          "hibernateLazyInitializer": {}
        },
        "lastUpdatedBy": {
          "username": "user001",
          "hibernateLazyInitializer": {}
        },
        "createdTime": "2020-02-15T22:20:33",
        "lastUpdatedTime": "2020-02-15T22:20:44"
      },
      "revisionNumber": 2,
      "requiredRevisionNumber": 2,
      "revisionInstant": "2020-02-15T15:20:44.828Z",
      "requiredRevisionInstant": "2020-02-15T15:20:44.828Z"
    }
  ],
  "latestRevision": {
    "metadata": {
      "delegate": {
        "id": 2,
        "timestamp": 1581780044828,
        "revisionDate": "2020-02-15T15:20:44.828+0000"
      },
      "revisionNumber": 2,
      "revisionDate": "2020-02-15T22:20:44.828",
      "revisionInstant": "2020-02-15T15:20:44.828Z",
      "requiredRevisionNumber": 2,
      "requiredRevisionInstant": "2020-02-15T15:20:44.828Z",
      "revisionType": "UNKNOWN"
    },
    "entity": {
      "id": "338fa78f-7562-41e4-8b3c-b5d487e6c3aa",
      "code": "P-001x",
      "name": "Product 001x",
      "price": 100001.00,
      "createdBy": {
        "username": "user001",
        "hibernateLazyInitializer": {}
      },
      "lastUpdatedBy": {
        "username": "user001",
        "hibernateLazyInitializer": {}
      },
      "createdTime": "2020-02-15T22:20:33",
      "lastUpdatedTime": "2020-02-15T22:20:44"
    },
    "revisionNumber": 2,
    "requiredRevisionNumber": 2,
    "revisionInstant": "2020-02-15T15:20:44.828Z",
    "requiredRevisionInstant": "2020-02-15T15:20:44.828Z"
  },
  "empty": false
}
```