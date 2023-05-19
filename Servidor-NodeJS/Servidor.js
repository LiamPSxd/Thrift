const thrift = require("thrift");

const Pagos = require("./Pagos"),
    ttypes = require("./pagos_types");

const pagos = [];

const server = thrift.createServer(Pagos, {
    get: (id) => {
        let result = "\"status\": \"Fallido\"";

        pagos.forEach(p => {
            if(p.id == id){
                const data = `\"data\": {\"id\": \"${p.id}\", \"folio\": \"${p.folio}\", \"titular\": \"${p.titular}'\", \"concepto\": \"${p.concepto}'\", \"cantidad\": \"${p.cantidad}\", \"estado\": \"${p.estado}\"}`;
                console.log(`{\"operacion\": \"get\", ${data}}`);
                result = `{\"status\": \"Exitoso\", ${data}}`;
            }
        });

        return result;
    },
    add: (pago) => {
        pagos.push(pago);

        if(pagos.includes(pago)){
            const data = `\"data\": {\"id\": \"${pago.id}\", \"folio\": \"${pago.folio}\", \"titular\": \"${pago.titular}'\", \"concepto\": \"${pago.concepto}'\", \"cantidad\": \"${pago.cantidad}\", \"estado\": \"${pago.estado}\"}`;
            console.log(`{\"operacion\": \"add\", ${data}}`);
            return `{\"status\": \"Exitoso\", ${data}}`;
        }else return "{\"status\": \"Fallido\"}";
    },
    update: (pago) => {
        let result = "{\"status\": \"Fallido\"}";

        if(pagos.indexOf(pago.id)){
            pagos.forEach(p => {
                if(p.id == pago.id){
                    pagos[p.id] = pago;

                    const data = `\"data\": {\"id\": \"${pagos[p.id].id}\", \"folio\": \"${pagos[p.id].folio}\", \"titular\": \"${pagos[p.id].titular}'\", \"concepto\": \"${pagos[p.id].concepto}'\", \"cantidad\": \"${pagos[p.id].cantidad}\", \"estado\": \"${pagos[p.id].estado}\"}`;
                    console.log(`{\"operacion\": \"update\", ${data}}`);
                    result = `{\"status\": \"Exitoso\", ${data}}`;
                }
            });
        }
        
        return result;
    },
    delete: (id) => {
        let result = "{\"status\": \"Exitoso\"}";

        pagos.forEach(p => {
            if(p.id == id){
                const data = `\"data\": {\"id\": \"${p.id}\", \"folio\": \"${p.folio}\", \"titular\": \"${p.titular}'\", \"concepto\": \"${p.concepto}'\", \"cantidad\": \"${p.cantidad}\", \"estado\": \"${p.estado}\"}`;
                console.log(`{\"operacion\": \"delete\", ${data}}`);

                delete pagos[id];
            }
        });

        pagos.forEach(p => {
            if(p.id == id) result = "{\"status\": \"Fallido\"}";
        });

        return result;
    },
});

server.listen(9090);