create table mg_inbound_message (
  id number identity ,
  payload varchar2(1000) not null,
  message_type varchar2(100) not null,
  transaction_reference varchar(100) ,
  status varchar2(36) not null,
  error varchar2(512) ,
  input_time datetime not null,
  processed_time datetime null,
  constraint PK_MG_INBOUND_MESSAGE primary key (ID)
)