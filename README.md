# 2400033275_FSAD_INSEM_EXAM_1

Spring Boot JPA application for the FSAD lab exam task.

## Package structure

- `com.klef.fsad.exam`
- `com.klef.fsad.exam.model`
- `com.klef.fsad.exam.repository`
- `com.klef.fsad.exam.service`
- `com.klef.fsad.exam.controller`
- `com.klef.fsad.exam.exception`

## Implemented operations

1. `POST /api/supplierorders` to add a `SupplierOrder`
2. `GET /api/supplierorders` to retrieve all `SupplierOrder` records
3. `GET /api/supplierorders/{supplierOrderId}` to retrieve a single record by ID

## Sample POST request body

```json
{
  "supplierOrderId": 101,
  "supplierName": "ABC Traders",
  "productName": "Laptop",
  "orderDate": "2026-03-11",
  "status": "PLACED",
  "quantity": 5,
  "totalAmount": 250000,
  "remarks": "Urgent delivery"
}
```

## Notes

- `supplierOrderId` is provided manually and is not auto-generated.
- Database name is `fsadexam`.
- Update `spring.datasource.password` in `application.properties` if your local MySQL password is different.
