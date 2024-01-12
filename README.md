
# JAVA: Spring-BOOT-REST-AUTHENTICATION

Purpose: Authentication with Java spring boot



## API Reference

#### Get all contact

```http
  GET /contacts
```


#### Get contact by id

```http
  GET /contact/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### Post contact

```http
  POST /contact
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`        | `string` | **Required**. String name not blank |
| `phoneNumber`      | `string` | **Required**. String phoneNumber not blank |


#### Delete contact by id

```http
  DELETE /contact/${id}
```
