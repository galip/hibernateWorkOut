# hibernateWorkOut
I did this project only to show how hibernate works with it's basics.

When I run the application, we can see the result below.

log4j:WARN No appenders could be found for logger (org.jboss.logging).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
Hibernate: insert into writer (deleted, last_updated, name) values (?, ?, ?)
Hibernate: select writer0_.id as id0_, writer0_.deleted as deleted0_, writer0_.last_updated as last3_0_, writer0_.name as name0_ from writer writer0_ where writer0_.deleted='FALSE'
Dostoyevski
Hibernate: insert into type (deleted, last_updated, name) values (?, ?, ?)
Hibernate: select type0_.id as id1_, type0_.deleted as deleted1_, type0_.last_updated as last3_1_, type0_.name as name1_ from type type0_ where type0_.deleted='FALSE'
Psychology
Hibernate: insert into book (deleted, last_updated, name, type_id, writer_id) values (?, ?, ?, ?, ?)
Hibernate: select book0_.id as id2_, book0_.deleted as deleted2_, book0_.last_updated as last3_2_, book0_.name as name2_, book0_.type_id as type5_2_, book0_.writer_id as writer6_2_ from book book0_ where book0_.deleted='FALSE'
Crime And Punishment
Hibernate: update Book set deleted = 'TRUE' WHERE id = 1
