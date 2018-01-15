<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<style>
#wrap {
    width: 900px;
    margin: 0 auto;
    padding-top: 50px;
}
.container .row .col-md-12, .col-md-2, .col-md-3, .col-md-8, .col-md-9 {
    border: 1px solid #000000;
    border-collapse: collapse;
}
#wrap .container {
    width: 100%;
}
</style>
</head>
 
<body>
    <div id="wrap">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <tiles:insertAttribute name="header" />
                </div>
            </div>
            <div class="row">
                <div class="col-md-9">
                    <tiles:insertAttribute name="banner" />
                </div>
                <div class="col-md-3">
                    <tiles:insertAttribute name="login" />
                </div>
            </div>
            <div class="row">
                <div class="col-md-2">
                    <tiles:insertAttribute name="left" />
                </div>
                <div class="col-md-8">
                    <tiles:insertAttribute name="main" />
                </div>
                <div class="col-md-2">
                    <tiles:insertAttribute name="right" />
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <tiles:insertAttribute name="footer" />
                </div>
            </div>
        </div>
    </div>
</body>
</html>
