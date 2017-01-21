##### 2- Suponiendo que la tabla Pedidos tiene muchos registros, que consideraciones se deberían tener en cuenta para realizar consultas a la base de datos de manera eficiente?




Since **BumexMemcached** was given, I would use the cache and create a caching strategy to improve database queries. If no cache is given, I would index the database so querying is done via binary search ( O(log(n)) ); much better than by linear search ( O(n) ).