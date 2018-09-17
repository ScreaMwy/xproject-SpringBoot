create table x_area (
	area_id int(2) not null auto_increment comment '区域id',
	area_name varchar(200) not null comment '区域名',
	priority int(2) not null default '0' comment '',
	create_time datetime default null comment '生成时间',
	last_edit_time datetime default null comment '最后修改时间',
	
	primary key(area_id),
	unique key UK_AREA(area_name)
) engine=InnoDB auto_increment=1 default charset=utf8 comment='区域表';