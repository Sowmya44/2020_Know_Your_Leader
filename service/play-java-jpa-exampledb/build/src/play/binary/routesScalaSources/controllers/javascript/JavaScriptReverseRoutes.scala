// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Documents/2020_Know_Your_Leader/service/play-java-jpa-exampledb/conf/routes
// @DATE:Tue Mar 03 15:12:27 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {

  // @LINE:15
  class ReverseActionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def getUserAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActionController.getUserAction",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "actionprofile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0))})
        }
      """
    )
  
    // @LINE:21
    def getActionsFilter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActionController.getActionsFilter",
      """
        function(filter0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "actionsf/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("filter", filter0))})
        }
      """
    )
  
    // @LINE:15
    def addAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActionController.addAction",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "action"})
        }
      """
    )
  
    // @LINE:16
    def addActionImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActionController.addActionImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "actioni"})
        }
      """
    )
  
    // @LINE:18
    def ratingChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActionController.ratingChange",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ratingchange"})
        }
      """
    )
  
    // @LINE:22
    def deleteAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActionController.deleteAction",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delaction"})
        }
      """
    )
  
    // @LINE:20
    def getActions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActionController.getActions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "actions"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def updatePerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.updatePerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:8
    def addPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
        }
      """
    )
  
    // @LINE:12
    def deletePerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.deletePerson",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delperson"})
        }
      """
    )
  
    // @LINE:9
    def getPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.getPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons"})
        }
      """
    )
  
    // @LINE:10
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
