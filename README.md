<h1>Api Pessoas</h1>
API de gestão de pessoas pretende permitir o cadastro e gerenciamento de informações sobre as pessoas relacionadas aos usuários cadastrados em nosso sistema.
Recebe as informações das pessoas com os campos de nome, data de nascimento, sexo, parentesco com o usuário e outros dados relevantes.
Recebe as solicitações em formato HTTP POST.
As informações devem são validadas para garantir que elas estão no formato correto e que são válidas.
Caso haja algum erro, a API retorna uma mensagem de erro indicando o problema encontrado.
Uma vez validadas as informações, a API informa que está tudo ok e dar um retorno positivo ao usuário.

<h3>Endpoint:</h3>
  /pessoas
<h3>Método HTTP:</h3>
- Post
- Get
- Update
- Delete
<h3>Descrição:</h3>
Este endpoint cria um novo cadastro de pessoa com base nos parâmetros fornecidos.
Neste exemplo, o endpoint é do tipo POST e os parâmetros de solicitação são enviados no corpo da solicitação em formato JSON. Os parâmetros incluem nome, dataNascimento, sexo e grauParentesco, que são utilizados para criar um novo cadastro de pessoa

<h3>Parâmetros no corpo da solicitação (JSON):</h3>

![Picture1](https://github.com/Eliscarla/fiap/assets/91165738/0baf98c2-043d-4700-bd4a-16f0bbed6b1b)

<h3>Exemplo de solicitação:</h3>
  POST /pessoa
Content-Type: application/json 

</h3>Formato de resposta:</h3>
Cabeçalho HTTP:

![Picture2](https://github.com/Eliscarla/fiap/assets/91165738/b5e21d4f-4b3e-4000-8451-ec101abf462c)

<h3>Corpo da resposta (JSON):</h3>

![Picture3](https://github.com/Eliscarla/fiap/assets/91165738/71392cb3-064e-4289-8f1b-09e2e192b87d)

<h2>Lidando com Erros</h2>
A API possui um mecanismo robusto para lidar com erros e fornece respostas adequadas para diferentes cenários. A seguir estão os possíveis códigos de status que podem ser retornados em diferentes situações.

<h3>Corpo da solicitação.</h3>

![Picture4](https://github.com/Eliscarla/fiap/assets/91165738/69c796da-39fe-4f76-a065-a3519584dd16)

Resposta 201 Created: Este código de status é retornado quando uma solicitação de criação de recurso é bem-sucedida.
<h3>Corpo da solicitação inválida:</h3>

![Picture5](https://github.com/Eliscarla/fiap/assets/91165738/56b94853-7854-4fde-8897-72728ff8c405)

![Picture6](https://github.com/Eliscarla/fiap/assets/91165738/3c22176d-0208-4129-8ea6-6b78fb9abc43)

400 Bad Request: Este código de status é retornado quando ocorre um erro no lado do cliente, como uma solicitação inválida ou parâmetros ausentes ou inválidos.

Ação recomendada: Os usuários devem verificar a validade dos parâmetros fornecidos e corrigir quaisquer erros antes de tentar novamente.
### Repositório API:
- [API de Gestão de Pessoas](https://github.com/Eliscarla/fiap/tree/main/api).


