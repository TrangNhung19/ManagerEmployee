drop database swing_demo;
create database swing_demo;
use swing_demo;
-- CREATE TABLE student
-- ( id int NOT NULL,
--   `name` varchar(250) NOT NULL,
--   `password` varchar(250)
-- );
-- INSERT INTO student (id, name, password)
-- VALUES (1, 'Ramesh', 'Ramesh@123');
-- select*from student;

CREATE TABLE account
( first_name varchar(250) NOT NULL,
  last_name varchar(250) NOT NULL,
  user_name varchar(250) NOT NULL,
  password varchar(250),
  email_id varchar(250) NOT NULL,
  mobile_number varchar(250) NOT NULL
);
CREATE TABLE nhanvien
( STT int primary key not null,
Hoten varchar(50) ,
Manv varchar(10), 
Chucvu varchar(50),
Gioitinh varchar(50), 
Namsinh varchar(5),
SDT varchar(10),
Email varchar(50),
Luong int 
);
INSERT INTO nhanvien (STT,Hoten,Manv,Chucvu,Gioitinh,Namsinh,SDT,Email,Luong)
VALUES (1, 'Ramesh', 'NV1','Giảng viên', 'Nam','1986','0123456789', 'Ramesh@123', 35);

INSERT INTO nhanvien (STT,Hoten,Manv,Chucvu,Gioitinh,Namsinh,SDT,Email,Luong)
VALUES (2, 'Nhung', 'NV2','Giảng viên', 'Nu','1995','0123456789', 'Nhung@123', 29);
select*from nhanvien;
