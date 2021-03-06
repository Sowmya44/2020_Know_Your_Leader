// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Documents/major_project/2020_Know_Your_Leader/service/play-java-jpa-exampledb/conf/routes
// @DATE:Wed Mar 11 10:59:56 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:23
  class ReverseRatingController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def addComment(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "comment")
    }
  
    // @LINE:23
    def addRating(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rating")
    }
  
  }

  // @LINE:15
  class ReverseActionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def getUserAction(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actionprofile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
    // @LINE:20
    def getActionsFilter(email:String, filter:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actionsf/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("filter", filter)))
    }
  
    // @LINE:15
    def addAction(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "action")
    }
  
    // @LINE:16
    def addActionImage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "actioni")
    }
  
    // @LINE:17
    def ratingChange(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "ratingchange")
    }
  
    // @LINE:21
    def deleteAction(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "delaction")
    }
  
    // @LINE:19
    def getActions(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "actions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
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

  // @LINE:31
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
