<%-- 
    Document   : test
    Created on : 26/10/2018, 17:12:52
    Author     : a
--%>

<%@page import="br.com.fatecpg.quiz.Db"%>
<%@page import="br.com.fatecpg.quiz.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste | QuizWebApp</title>
    </head>
    <body>
        <h4><a href="home.jsp">Voltar</a></h4>
        <%-- 
for(int i = 0; i < Quiz.getTest().size(); i++)
        {
            Question q = Quiz.getTest().get(i);
            String p = request.getParameter(q.getQuestion());
            if(q.getAswer().equals(p))
            {
                count++;
            }
--%>
        <h1>Quiz WebApp</h1>
        <%if(request.getParameter("enviar_test")!=null){
            int sum=0;
            
            for(int i = 0; i < sum; i++)
            for(Question q: Db.getTest()){
                String userAnswer = request.getParameter(q.getQuestion());
                if(userAnswer.equals(q.getAnswer()))
                {
                    sum++;
                }
            }%>
            
            <hr/><hr/>
            <h1 style="color: blue;">
                Nota: <u><%=100*((double)(sum)/3.0)%>%</u>
            </h1>
            <hr/><hr/>
        <%}%>
        
        <h2>Test</h2>
        <form>
            <fieldset>
            <%for(Question q: Db.getTest()){%>
            <h3>Questão: <%=q.getQuestion()%></h3>
                <%for(int i=0; i<q.getAlternatives().length; i++){%>
                <input 
                    type="radio" 
                    name="<%=q.getQuestion()%>" value="<%=q.getAlternatives()[i]%>"
                    /><%=q.getAlternatives()[i]%></br>
                
                <%}%>
                <hr>
            <%}%>
            <input type="submit" name="enviar_test" value="Enviar"/>
            </fieldset>
        </form>
            
    </body>
</html>