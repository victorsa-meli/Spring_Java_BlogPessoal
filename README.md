PROJETO BLOG PESSOAL - SWAGGER

<h1>DOC</h1>


<h2>Blogpessoal</h2>
API and SDK Documentation Version: 1.0
Blogpessoal - Victor Mercado Livre
PostagemController delete1
Usage and SDK Samples ócio
    DELETE
 /postagens/{id}
Curl Java
Parameters
Path parameters
Name
id*
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
getAll2
Android Obj-C JavaScript
Description
Long (int64) Required
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
C# PHP Perl
Python
 curl -X DELETE\ "http://localhost:8080/postagens/{id}"
               GET
 /postagens
Usage and SDK Samples
  Curl Java Android Obj-C JavaScript
Parameters
Responses
Status: 200 - Sucesso!
Status: 201 - Objeto Persistido! Status: 204 - Objeto Excluido ! Status: 400 - Erro na Requisição! Status: 401 - Acesso nao autorizado! Status: 404 - Objeto nao encontrado! Status: 500 - Erro na aplicação!
C# PHP Perl
Python
  curl -X GET\ "http://localhost:8080/postagens"
         getById2
GET
Usage and SDK Samples
 /postagens/{id}
  Curl Java
Parameters
Path parameters
Name
id*
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
Android
Obj-C JavaScript
C# PHP Perl
Python
  curl -X GET\ "http://localhost:8080/postagens/{id}"
  Description
Long (int64) Required
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
           
  getByTitulo
GET
Usage and SDK Samples
 /postagens/titulo/{titulo}
  Curl Java
Parameters
Path parameters
Name
titulo*
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
post1
POST
Usage and SDK Samples
Curl Java Android Obj-C JavaScript
Parameters
Body parameters
Android
Obj-C JavaScript
C# PHP Perl
Python
  curl -X GET\ "http://localhost:8080/postagens/titulo/{titulo}"
  Description
String Required
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
              /postagens
  C# PHP Perl
Python
  curl -X POST\
-H "Content-Type: application/json"\ "http://localhost:8080/postagens"
  
  Name
Description
   body *
   ▼ {[]
Required: texto,titulo
id: titulo: texto: data:
integer (int64)
string minLength:5 maxLength:100 string minLength:10 maxLength:1000 string (date-time)
tema: ▼{[]
Required: descricao
id: integer
descricao: string }
usuario: ▼ { []
Required: nome,senha,usuario
▼
} }
id: nome: usuario:
senha: foto: postagem:
integer string
string
example: example@email.com
string string
[] []
 Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
put1
PUT
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
          /postagens
Usage and SDK Samples
Curl Java Android Obj-C JavaScript
Parameters
Body parameters
C# PHP Perl
Python
    curl -X PUT\
-H "Content-Type: application/json"\ "http://localhost:8080/postagens"
  
  Name
Description
   body *
   ▼ {[]
Required: texto,titulo
id: titulo: texto: data:
integer (int64)
string minLength:5 maxLength:100 string minLength:10 maxLength:1000 string (date-time)
tema: ▼{[]
Required: descricao
id: integer
descricao: string }
usuario: ▼ { []
Required: nome,senha,usuario
▼
} }
id: nome: usuario:
senha: foto: postagem:
integer string
string
example: example@email.com
string string
[] []
 Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
          TemaController delete
Usage and SDK Samples
 DELETE
 /temas/{id}
  Curl Java Android Obj-C JavaScript
C# PHP Perl
Python
 
 curl -X DELETE\ "http://localhost:8080/temas/{id}"
Parameters
Path parameters
Name
id*
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
getAll1
GET
Usage and SDK Samples
Curl Java Android Obj-C JavaScript
Parameters
Responses
Status: 200 - Sucesso!
Status: 201 - Objeto Persistido! Status: 204 - Objeto Excluido ! Status: 400 - Erro na Requisição! Status: 401 - Acesso nao autorizado! Status: 404 - Objeto nao encontrado! Status: 500 - Erro na aplicação!
  Description
Long (int64) Required
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
              /temas
  C# PHP Perl
Python
  curl -X GET\ "http://localhost:8080/temas"
         
getById1
GET
Usage and SDK Samples
 /temas/{id}
  Curl Java
Parameters
Path parameters
Name
id*
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
Android
Obj-C JavaScript
C# PHP Perl
Python
  curl -X GET\ "http://localhost:8080/temas/{id}"
  Description
Long (int64) Required
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
             getByTitle
GET
Usage and SDK Samples
 /temas/descricao/{descricao}
  Curl Java
Parameters
Path parameters
Name
descricao*
Android
Obj-C JavaScript
C# PHP Perl
Python
  curl -X GET\ "http://localhost:8080/temas/descricao/{descricao}"
  Description
String Required
    
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
post
POST
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
          /temas
Usage and SDK Samples
Curl Java Android Obj-C JavaScript
C# PHP Perl
Python
    curl -X POST\
-H "Content-Type: application/json"\ "http://localhost:8080/temas"
Parameters
Body parameters
Name
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
  Description
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
   body *
   ▼ {[]
Required: descricao
id: integer (int64)
descricao: string }
          put

PUT
 /temas
Usage and SDK Samples
Curl Java Android Obj-C JavaScript
C# PHP Perl
Python
    curl -X PUT\
-H "Content-Type: application/json"\ "http://localhost:8080/temas"
Parameters
Body parameters
Name
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
  Description
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
   body *
   ▼ {[]
Required: descricao
id: integer (int64)
descricao: string }
           UsuarioController getAll
GET
Usage and SDK Samples
Curl Java Android Obj-C JavaScript
C# PHP Perl
Python
 /usuario/all
    curl -X GET\ "http://localhost:8080/usuario/all"

Parameters
Responses
Status: 200 - Sucesso!
Status: 201 - Objeto Persistido! Status: 204 - Objeto Excluido ! Status: 400 - Erro na Requisição! Status: 401 - Acesso nao autorizado! Status: 404 - Objeto nao encontrado! Status: 500 - Erro na aplicação!
         getById
GET
Usage and SDK Samples
 /usuario/{id}
  Curl Java
Parameters
Path parameters
Name
id*
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
login
Android
Obj-C JavaScript
C# PHP Perl
Python
  curl -X GET\ "http://localhost:8080/usuario/{id}"
  Description
Long (int64) Required
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
             POST
 
 /usuario/logar
Usage and SDK Samples
  Curl Java Android Obj-C JavaScript
C# PHP Perl
Python
  curl -X POST\
-H "Content-Type: application/json"\ "http://localhost:8080/usuario/logar"
Parameters
Body parameters
Name
Description
   body
  }
▼ {[] id:
nome: usuario: senha: foto: token:
integer (int64) string
string
string
string string
 Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
         postUsuario
POST
Usage and SDK Samples
Curl Java Android
Parameters
Body parameters
Obj-C JavaScript
C# PHP Perl
Python
 /usuario/cadastrar
    curl -X POST\
-H "Content-Type: application/json"\ "http://localhost:8080/usuario/cadastrar"
  Name Description
body *
    
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
         putUsuario
PUT
Usage and SDK Samples
 /usuario/atualizar
  Curl Java
Parameters
Body parameters
Name
body *
Responses Status: 200 -
Status: 201 - Status: 204 - Status: 400 - Status: 401 - Status: 404 - Status: 500 -
Android
Obj-C JavaScript
C# PHP Perl
Python
  curl -X PUT\
-H "Content-Type: application/json"\ "http://localhost:8080/usuario/atualizar"
  Description
Sucesso!
Objeto Persistido! Objeto Excluido !
Erro na Requisição! Acesso nao autorizado! Objeto nao encontrado! Erro na aplicação!
             Suggestions, contact, support and error reporting;
Information URL: https://github.com/victorsa-mel (https://github.com/victorsa-mel) Contact Info: victor-meli@victorsa-meli.com (victor-meli@victorsa-meli.com)
Mercado Livre

https://github.com/victorsa-meli