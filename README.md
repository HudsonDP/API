# API
 
#docker-compose up -> para subir servico do rabbitMQ
URL rabbit:  localhost:http://localhost:15672/
usuario: guest
senha: guest

URL da api: http://localhost:8080/api/pedido

#json modelo post
{
        "id_cliente":55,
        "id_produto":"0015, 547, 21548, 00125",
        "total_pedido": 855.00,
        "end_entrega": "Avenida Brasil, 855"
}

#URL do BANCO
http://localhost:8080/h2
