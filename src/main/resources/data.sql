delete model;
delete modeltype;
delete manufacturer;

--Manufacture
insert into manufacturer (id, name, founded_date)
values (1, 'Specialized', '1974-01-01');

insert into manufacturer (id, name, founded_date)
values (2, 'YT', '2007-01-01');

insert into manufacturer (id, name, founded_date)
values (3, 'Trek', '1975-01-01');

insert into manufacturer (id, name, founded_date)
values (4, 'Evil', '2008-01-01');

--Model Type
insert into modeltype (id, name)
values (1, 'Full Supension');

insert into modeltype (id, name)
values (2, 'Hard Tail');

--Model
--Full Suspension 

--Specialized
insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (1, 'Epic XTR Di2', 1, 1, 10000, 'RockShox', 110, 1, 'RockShox', 120, 29, 'Carbon');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (2, 'Enduro', 1, 1, 8500, 'Ohlins RXF', 160, 1, 'Ohlins STX', 160, 27.5, 'Carbon');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (3, 'Stumpjumper', 1, 1, 2800, 'RockShox', 150, 1, 'RockShox', 150, 29, 'Alloy');

--YT
insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (4, 'Jeffsy', 2, 1, 4999, 'Fox', 140, 1, 'Fox', 140, 29, 'Carbon');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (5, 'Capra', 2, 1, 2999, 'RockShox', 160, 1, 'RockShox', 160, 29, 'Alloy');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (6, 'Tues', 2, 1, 4999, 'Fox', 203, 1, 'Fox', 208, 27.5, 'Carbon');

--Trek
insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (7, 'Fuel 9.9', 3, 1, 8500, 'Fox', 100, 1, 'Fox', 120, 29, 'Carbon');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (8, 'Slash 9.8', 3, 1, 5499, 'Fox', 160, 1, 'RockShox', 150, 29, 'Carbon');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (9, 'Session 9.9', 3, 1, 7999, 'Fox', 203, 1, 'Fox', 210, 27.5, 'Carbon');

--EVIL
insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (10, 'The Calling', 4, 1, 5300, 'Fox', 140, 1, 'Fox', 150, 27.5, 'Alloy');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (11, 'The Wreckoning', 4, 1, 5500, 'RockShox', 160, 1, 'RockShox', 160, 29, 'Carbon');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (12, 'The Insurgent', 4, 1, 6500, 'Fox', 150, 1, 'Fox', 150, 27.5, 'Carbon');

--Hard Tail

--Specialized
insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (13, 'Fuse', 1, 2, 6500, 'Ohlins RXF', 120, 0, NULL, 0, 27.5, 'Alloy');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (14, 'Rockhopper', 1, 2, 500, 'Manitou', 100, 0, NULL, 0, 29, 'Alloy');

--YT
insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (15, 'Dirt Love', 2, 2, 1299, 'RockShox', 100, 0, NULL, 0, 26, 'Steel');

--Trek
insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (16, 'Procaliber 9.8', 3, 2, 4999, 'RockShox', 100, 0, NULL, 0, 29, 'Carbon');

insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (17, 'Stache 9.7', 3, 2, 3499, 'RockShox', 120, 0, NULL, 0, 29, 'Carbon');

--EVIL
insert into model (id, name, manufacturer_id, modeltype_id, price, fork_brand, fork_travel, has_rear_shock, rear_shock_brand, rear_shock_travel, tire_size, frame_material)
values (18, 'Chamois Davis Jr', 4, 2, 999, 'RockShox', 80, 0, NULL, 0, 650, 'Alloy');
