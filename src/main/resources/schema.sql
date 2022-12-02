create table book(
  id int auto_increment,
  title nvarchar(255) NOT NULL,
  pages int NOT NULL,
  author nvarchar(255) NOT NULL

);

--INSERT INTO book(title,pages, author) VALUES ( 'Ilia','Marinov' 3, 'Student' );