insert into USUARIOS (id, username, password, role) values (100, 'ana@email.com', '$2a$12$dqvxVayfQdcQnveZ2UbCUeNeyBl87S3cBOich8gDIqL6plJ1f6pMi', 'ROLE_ADMIN');
insert into USUARIOS (id, username, password, role) values (101, 'bia@email.com', '$2a$12$dqvxVayfQdcQnveZ2UbCUeNeyBl87S3cBOich8gDIqL6plJ1f6pMi', 'ROLE_CLIENTE');
insert into USUARIOS (id, username, password, role) values (102, 'bob@email.com', '$2a$12$dqvxVayfQdcQnveZ2UbCUeNeyBl87S3cBOich8gDIqL6plJ1f6pMi', 'ROLE_CLIENTE');
insert into USUARIOS (id, username, password, role) values (103, 'toby@email.com', '$2a$12$dqvxVayfQdcQnveZ2UbCUeNeyBl87S3cBOich8gDIqL6plJ1f6pMi', 'ROLE_CLIENTE');

insert into CLIENTES (id, nome, cpf, id_usuario) values (10, 'Bianca Silva', '41884251056', 101);
insert into CLIENTES (id, nome, cpf, id_usuario) values (20, 'Roberto Gomes', '38441487014', 102);