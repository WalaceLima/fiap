<h2>Api de gestão de pessoas</h2>

Endpoint’s: /pessoa
Método HTTP:Post
Descrição: Este endpoint cria um novo cadastro de pessoa com base nos parâmetros fornecidos.
Neste exemplo, o endpoint é do tipo POST e os parâmetros de solicitação são enviados no corpo da solicitação em formato JSON. Os parâmetros incluem nome, dataNascimento, sexo e grauParentesco, que são utilizados para criar um novo cadastro de pessoa
Parâmetros no corpo da solicitação (JSON):

![Picture1](https://github.com/Eliscarla/fiap/assets/91165738/0baf98c2-043d-4700-bd4a-16f0bbed6b1b)

Exemplo de solicitação:
POST /pessoa
Content-Type: application/json 
Formato de resposta:
Cabeçalho HTTP:

![Picture2](https://github.com/Eliscarla/fiap/assets/91165738/b5e21d4f-4b3e-4000-8451-ec101abf462c)

Corpo da resposta (JSON):

![Picture3](https://github.com/Eliscarla/fiap/assets/91165738/71392cb3-064e-4289-8f1b-09e2e192b87d)

Lidando com Erros
A API possui um mecanismo robusto para lidar com erros e fornece respostas adequadas para diferentes cenários. A seguir estão os possíveis códigos de status que podem ser retornados em diferentes situações.

Corpo da solicitação.

![Picture4](https://github.com/Eliscarla/fiap/assets/91165738/69c796da-39fe-4f76-a065-a3519584dd16)

Resposta 201 Created: Este código de status é retornado quando uma solicitação de criação de recurso é bem-sucedida.
Corpo da solicitação inválida:

![Picture5](https://github.com/Eliscarla/fiap/assets/91165738/56b94853-7854-4fde-8897-72728ff8c405)

![Picture6](https://github.com/Eliscarla/fiap/assets/91165738/3c22176d-0208-4129-8ea6-6b78fb9abc43)

400 Bad Request: Este código de status é retornado quando ocorre um erro no lado do cliente, como uma solicitação inválida ou parâmetros ausentes ou inválidos.

Ação recomendada: Os usuários devem verificar a validade dos parâmetros fornecidos e corrigir quaisquer erros antes de tentar novamente.


