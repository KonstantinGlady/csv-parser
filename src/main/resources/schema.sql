create table if not exists Parking_Violations (
    id  identity,
    summonsNumber bigint not null,
    plateId varchar(10) not null,
    registrationState varchar(4),
    issueDate timestamp,
    violationCode varchar(10),
    vechicleBodyType varchar(10),
    vechicleMake varchar(10)
);