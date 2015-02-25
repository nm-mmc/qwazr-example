//providers.cassandra.select("select * from repos", 1);
response.variable("message", "Hello world!");
response.view("index.ftl");