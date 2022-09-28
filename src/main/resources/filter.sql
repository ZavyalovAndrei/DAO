select product_name
from ORDERS
         left join CUSTOMERS C on C.id = ORDERS.customer_id
where C.name = :name;