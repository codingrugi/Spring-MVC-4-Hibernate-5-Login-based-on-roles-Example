<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header id="header">
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
       
         
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                
                       <li><a href="${pageContext.request.contextPath}/home">Home</a></li>
                       <li><a href="#about">About</a></li>
                       <li><a href="#contact">Contact</a></li>
                    
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
	                    <li>
	                        <a href="${pageContext.request.contextPath}/home-admin">Content Management</a>
	                    </li>
                     </sec:authorize>
                    <sec:authorize access="hasRole('ROLE_USER')">
	                    <li>
	                        <a href="${pageContext.request.contextPath}/home-user">Dashboard</a>
	                    </li>
	                     
                     </sec:authorize>
                     <sec:authorize access="!isAuthenticated()">
		                    <li>
		                        <a href="${pageContext.request.contextPath}/login">Login</a>
		                    </li>  
		                    <li>
		                        <a href="#">Signup</a>
		                    </li>  
                     </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
	                    <li>
	                      <c:url value="${request.contextPath}/logout" var="logoutUrl" />
                        <a href="${logoutUrl}">Logout</a>
	                    </li>
                    </sec:authorize>
                           
                </ul>
            </div>
        
        
      </div>
    </nav>
</header>