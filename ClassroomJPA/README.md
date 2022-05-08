#Projeto 1 de TJW
-Este projeto tem como objetivo replicar o Classroom utilizando JPA 

-Para isso, o projeto foi dividido da seguinte forma:
  -Acesso as classes --> src/main/java/br/edu/ifce
    -Para acessar as classes responsáveis pelo CRUD --> code
      -Classe para criação de novos alunos,professores e turmas --> JPAClass.java
      -Classe para excluir alunos,professores e turmas --> JPADelete.java
      -Classe para verificação de alunos,professores e turmas --> JPARead.java
      -Classe de update de novos alunos,professores e turmas --> JPAUpdate.java
    -Para acessar as classes modelo --> model
      - Aluno.java
      - Professor.java
      - Turma.java
    -Para acessar a classe para conexão com o banco  --> utils
      - JPAUtils.java
 
  -Acesso as informações do banco de dados --> src/main/resources/META-INF/persistence.xml
  
  -Para verificar quais foram as dependências utilizadas no projeto --> ClassroomJPA/pom.xml
