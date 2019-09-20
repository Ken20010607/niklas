const { createServer } = require("http");
const { createReadStream } = require("fs");
const { decode } = require("querystring");

const sendFile = (response, status, type, filePath) => {
    response.writeHead(status, { "Content-Type": type});
    createReadStream(filePath).pipe(response);
};

createServer((request, result) => {
    if (request.method === "POST"){
        let body = "";
        request.on("data", data =>{
        body += data;           
        });
        request.on("end", () => {
            const { name, email, message} = decode(body);
            console.log(`${name} (${email}): ${message}`);
        }); 
        
    }  
        
    switch (request.url) {
        case "/":
            return sendFile(result, 200, "text/html", "./home-page.html");
            case "/challenger.jpg":
                return sendFile(result, 200, "image/jpg", "./challenger.jpg");
            case "/styles.css":
                return sendFile(result, 200, "text/css", "./styles.css");
            case "/contact":
                return sendFile(result, 200, "text/html", "./contact.html");
            default:
                return sendFile(result, 200, "text/html", "./404.html");
    }
}).listen(3000);

console.log("Kens personal website running on port 3000");
