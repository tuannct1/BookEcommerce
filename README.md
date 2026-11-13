# BookEcommerce

## Chạy với MySQL

Yêu cầu MySQL đang chạy và JDK 17 trở lên. Ứng dụng kết nối mặc định tới
`localhost:3306` bằng user `root` và database `bookecommerce`.
Database sẽ được tạo tự động nếu chưa tồn tại; Hibernate cập nhật schema theo entity.
Đặt `DB_PASSWORD` trước khi chạy ứng dụng.

Cấu hình có thể thay đổi bằng các biến môi trường:

| Biến | Mặc định |
| --- | --- |
| `DB_HOST` | `localhost` |
| `DB_PORT` | `3306` |
| `DB_USERNAME` | `root` |
| `DB_PASSWORD` | *(bắt buộc, không lưu trong source code)* |

Ví dụ trong PowerShell:

```powershell
$env:DB_USERNAME = "root"
$env:DB_PASSWORD = "your-mysql-password"
.\mvnw.cmd spring-boot:run
```
