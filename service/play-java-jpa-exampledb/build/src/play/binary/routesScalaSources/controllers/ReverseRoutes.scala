// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Documents/2020_Know_Your_Leader/service/play-java-jpa-exampledb/conf/routes
// @DATE:Tue Mar 03 15:12:27 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:15
  class ReverseActionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def getUserAction(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actionprofile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
    // @LINE:21
    def getActionsFilter(filter:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actionsf/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("filter", filter)))
    }
  
    // @LINE:15
    def addAction(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "action")
    }
  
    // @LINE:16
    def addActionImage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "actioni")
    }
  
    // @LINE:18
    def ratingChange(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "ratingchange")
    }
  
    // @LINE:22
    def deleteAction(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "delaction")
    }
  
    // @LINE:20
    def getActions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actions")
    }
  
  }

  // @LINE:8
  class ReversePersonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def updatePerson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:8
    def addPerson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "person")
    }
  
    // @LINE:12
    def deletePerson(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "delperson")
    }
  
    // @LINE:9
    def getPersons(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "persons")
    }
  
    // @LINE:10
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:30
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
