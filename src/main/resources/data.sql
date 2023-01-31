create procedure usp_initialize_tiles()
BEGIN

    Declare xCount int;
    declare yCount int;

    set xCount=0;
    set yCount=0;

    WHILE (xCount < 100) do
        WHILE (yCount < 100) do
            insert into `tiles`(x, y, colour_id, client_id)
            values(xCount, yCount, 1 , 1);

            Set yCount = yCount+1;
end while;
        set yCount = 0;
        Set xCount = xCount+1;
end while;
END ^

insert into user_roles
values (1, 'ADMIN'),
       (2, 'CLIENT') ^

insert into users
values (1, 'Endeville', '12345', 'vic@gmail.com', 1) ^


insert into colours
values (1, 'WHITE'),
       (2, 'LIGHT_GREY'),
       (3, 'GREY'),
       (4, 'BLACK'),
       (5, 'PINK'),
       (6, 'RED'),
       (7, 'ORANGE'),
       (8, 'BROWN'),
       (9, 'YELLOW'),
       (10, 'LIGHT_GREEN'),
       (11, 'GREEN'),
       (12, 'CYAN'),
       (13, 'LIGHT_BLUE'),
       (14, 'BLUE'),
       (15, 'LIGHT_PURPLE'),
       (16, 'PURPLE') ^



call usp_initialize_tiles ^




