
insert IGNORE into admin (id, email,first_name,last_name,password ) values (1, 'admin@simplilearn.com', 'Simpli', 'Learn','admin');

insert IGNORE into category (id, type, description) values (1, 'MenShoes', 	 'All Men Shoes');
insert IGNORE into category (id, type, description) values (2, 'WomenShoes', 'All Women Shoes');
insert IGNORE into category (id, type, description) values (3, 'KidShoes', 	 'All Kids Shoes');
insert IGNORE into category (id, type, description) values (4, 'Basketball', 'All Baseketball Shoes');
insert IGNORE into category (id, type, description) values (5, 'RunningShoes', 'All Running Shoes');


insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10000,'MenShoes','Red','2025-03-15','2021-04-21','All New Mens Shoes','Nike',300,'Men Shoes',8,1);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10001,'MenShoes','Blue','2025-03-15','2021-04-21','All New Mens Shoes','Nike',250,'Men Shoes',7.5,1);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10002,'MenShoes','White','2025-03-15','2021-04-21','All New Mens Shoes','Nike',350,'Men Shoes',9,1);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10003,'WomenShoes','Blue','2025-03-15','2021-04-21','All New Womens Shoes','Addidas',250,'Womens Shoes',6.5,2);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10004,'WomenShoes','Red','2025-03-15','2021-04-21','All New Womens Shoes','Addidas',320,'Womens Shoes',7,2);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10005,'WomenShoes','White','2025-03-15','2021-04-21','All New Womens Shoes','Addidas',310,'Womens Shoes',8,2);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10006,'WomenShoes','Yellow','2025-03-15','2021-04-21','All New Womens Shoes','Addidas',315,'Womens Shoes',8,2);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10007,'KidShoes','Blue','2025-03-15','2021-04-21','All New Kids Shoes','Puma',150,'Kids Shoes',6,3);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10008,'Basketball','Red','2025-03-15','2021-04-21','All Basketball Shoes','Puma',650,'Basketball Shoes',8,4);
insert IGNORE into product (id,cat_type, color,date_of_expiry,dateof_manufature,description,manufactured_by,price,short_name,size,category_id) values (10010,'RunningShoes','Blue','2025-03-15','2021-04-21','All Running Shoes','Puma',450,'RunningShoes Shoes',8,5);
	
