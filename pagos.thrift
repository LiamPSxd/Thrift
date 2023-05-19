namespace js pagos
namespace java pagos

struct Pago{
    1: i16 id,
    2: i32 folio,
    3: string titular,
    4: string concepto,
    5: double cantidad,
    6: bool estado
}

service Pagos{
    string get(1:i16 id)
    string add(1:Pago pago),
    string update(1:Pago pago),
    string delete(1:i16 id)
}