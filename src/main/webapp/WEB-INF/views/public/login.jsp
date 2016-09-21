<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- MENU SECTION END-->
<section class="top-inner">
    <div class="content-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h4 class="page-head-line">Please Login To Enter </h4>

                </div>

            </div>
            <div class="row">
                <div class="col-md-6">
                    <c:url var="loginUrl" value="/login" />
					<form action="${loginUrl}" method="post" class="form-horizontal">
						<c:if test="${param.error != null}">
								<div class="alert alert-danger">
									<p>Invalid username and password.</p>
								</div>
							</c:if>
							<c:if test="${param.logout != null}">
								<div class="alert alert-success">
									<p>You have been logged out successfully.</p>
								</div>
							</c:if>
					
	                    <hr />
	                     <h4> Login with <strong>website name Account  :</strong></h4>
	                    <br />
	                     <label>Username : </label>
	                        <input type="text" class="form-control" id="username" name="username" />
	                        <label>Enter Password :  </label>
	                        <input type="password" class="form-control" id="password" name="password"/>
	                        <hr />
	                        <input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
	                        
	                        <input type="submit"  class="btn btn-info"  value="Log Me In">
                    </form>
                </div>
                
                
                <div class="col-md-6">
                    <div class="alert alert-info">
                      
                          <strong> Instructions To Use:</strong>
                        <ul>
                            <li>
                               username:user / password: user 
                            </li>
                            <li>
                                  username:admin / password: admin
                            </li>
                           
                        </ul>
                       
                    </div>
                    <div class="alert alert-success">
                         <strong> Instructions To Use:</strong>
                        <ul>
                            <li>
                               Lorem ipsum dolor sit amet ipsum dolor sit ame
                            </li>
                            <li>
                                 Aamet ipsum dolor sit ame
                            </li>
                            <li>
                               Lorem ipsum dolor sit amet ipsum dolor
                            </li>
                            <li>
                                 Cpsum dolor sit ame
                            </li>
                        </ul>
                       
                    </div>
                </div>

            </div>
        </div>
    </div>
    </section>