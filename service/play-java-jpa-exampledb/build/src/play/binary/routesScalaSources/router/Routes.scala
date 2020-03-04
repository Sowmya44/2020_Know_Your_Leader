// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Documents/2020_Know_Your_Leader/service/play-java-jpa-exampledb/conf/routes
// @DATE:Tue Mar 03 15:12:27 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  PersonController_1: controllers.PersonController,
  // @LINE:15
  ActionController_2: controllers.ActionController,
  // @LINE:30
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    PersonController_1: controllers.PersonController,
    // @LINE:15
    ActionController_2: controllers.ActionController,
    // @LINE:30
    Assets_0: controllers.Assets
  ) = this(errorHandler, PersonController_1, ActionController_2, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_1, ActionController_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.PersonController.addPerson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persons""", """controllers.PersonController.getPersons()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.PersonController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.PersonController.updatePerson()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delperson""", """controllers.PersonController.deletePerson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action""", """controllers.ActionController.addAction()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actioni""", """controllers.ActionController.addActionImage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ratingchange""", """controllers.ActionController.ratingChange()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actionprofile/""" + "$" + """email<[^/]+>""", """controllers.ActionController.getUserAction(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actions""", """controllers.ActionController.getActions()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actionsf/""" + "$" + """filter<[^/]+>""", """controllers.ActionController.getActionsFilter(filter:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delaction""", """controllers.ActionController.deleteAction()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_PersonController_addPerson0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_PersonController_addPerson0_invoker = createInvoker(
    PersonController_1.addPerson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addPerson",
      Nil,
      "POST",
      this.prefix + """person""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PersonController_getPersons1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persons")))
  )
  private[this] lazy val controllers_PersonController_getPersons1_invoker = createInvoker(
    PersonController_1.getPersons(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getPersons",
      Nil,
      "GET",
      this.prefix + """persons""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PersonController_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_PersonController_login2_invoker = createInvoker(
    PersonController_1.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PersonController_updatePerson3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_PersonController_updatePerson3_invoker = createInvoker(
    PersonController_1.updatePerson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "updatePerson",
      Nil,
      "POST",
      this.prefix + """update""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PersonController_deletePerson4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delperson")))
  )
  private[this] lazy val controllers_PersonController_deletePerson4_invoker = createInvoker(
    PersonController_1.deletePerson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "deletePerson",
      Nil,
      "DELETE",
      this.prefix + """delperson""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ActionController_addAction5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action")))
  )
  private[this] lazy val controllers_ActionController_addAction5_invoker = createInvoker(
    ActionController_2.addAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "addAction",
      Nil,
      "POST",
      this.prefix + """action""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ActionController_addActionImage6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actioni")))
  )
  private[this] lazy val controllers_ActionController_addActionImage6_invoker = createInvoker(
    ActionController_2.addActionImage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "addActionImage",
      Nil,
      "POST",
      this.prefix + """actioni""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ActionController_ratingChange7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ratingchange")))
  )
  private[this] lazy val controllers_ActionController_ratingChange7_invoker = createInvoker(
    ActionController_2.ratingChange(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "ratingChange",
      Nil,
      "POST",
      this.prefix + """ratingchange""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ActionController_getUserAction8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actionprofile/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActionController_getUserAction8_invoker = createInvoker(
    ActionController_2.getUserAction(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "getUserAction",
      Seq(classOf[String]),
      "GET",
      this.prefix + """actionprofile/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ActionController_getActions9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actions")))
  )
  private[this] lazy val controllers_ActionController_getActions9_invoker = createInvoker(
    ActionController_2.getActions(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "getActions",
      Nil,
      "GET",
      this.prefix + """actions""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ActionController_getActionsFilter10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actionsf/"), DynamicPart("filter", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActionController_getActionsFilter10_invoker = createInvoker(
    ActionController_2.getActionsFilter(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "getActionsFilter",
      Seq(classOf[String]),
      "GET",
      this.prefix + """actionsf/""" + "$" + """filter<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ActionController_deleteAction11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delaction")))
  )
  private[this] lazy val controllers_ActionController_deleteAction11_invoker = createInvoker(
    ActionController_2.deleteAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActionController",
      "deleteAction",
      Nil,
      "DELETE",
      this.prefix + """delaction""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_PersonController_addPerson0_route(params@_) =>
      call { 
        controllers_PersonController_addPerson0_invoker.call(PersonController_1.addPerson())
      }
  
    // @LINE:9
    case controllers_PersonController_getPersons1_route(params@_) =>
      call { 
        controllers_PersonController_getPersons1_invoker.call(PersonController_1.getPersons())
      }
  
    // @LINE:10
    case controllers_PersonController_login2_route(params@_) =>
      call { 
        controllers_PersonController_login2_invoker.call(PersonController_1.login())
      }
  
    // @LINE:11
    case controllers_PersonController_updatePerson3_route(params@_) =>
      call { 
        controllers_PersonController_updatePerson3_invoker.call(PersonController_1.updatePerson())
      }
  
    // @LINE:12
    case controllers_PersonController_deletePerson4_route(params@_) =>
      call { 
        controllers_PersonController_deletePerson4_invoker.call(PersonController_1.deletePerson())
      }
  
    // @LINE:15
    case controllers_ActionController_addAction5_route(params@_) =>
      call { 
        controllers_ActionController_addAction5_invoker.call(ActionController_2.addAction())
      }
  
    // @LINE:16
    case controllers_ActionController_addActionImage6_route(params@_) =>
      call { 
        controllers_ActionController_addActionImage6_invoker.call(ActionController_2.addActionImage())
      }
  
    // @LINE:18
    case controllers_ActionController_ratingChange7_route(params@_) =>
      call { 
        controllers_ActionController_ratingChange7_invoker.call(ActionController_2.ratingChange())
      }
  
    // @LINE:19
    case controllers_ActionController_getUserAction8_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ActionController_getUserAction8_invoker.call(ActionController_2.getUserAction(email))
      }
  
    // @LINE:20
    case controllers_ActionController_getActions9_route(params@_) =>
      call { 
        controllers_ActionController_getActions9_invoker.call(ActionController_2.getActions())
      }
  
    // @LINE:21
    case controllers_ActionController_getActionsFilter10_route(params@_) =>
      call(params.fromPath[String]("filter", None)) { (filter) =>
        controllers_ActionController_getActionsFilter10_invoker.call(ActionController_2.getActionsFilter(filter))
      }
  
    // @LINE:22
    case controllers_ActionController_deleteAction11_route(params@_) =>
      call { 
        controllers_ActionController_deleteAction11_invoker.call(ActionController_2.deleteAction())
      }
  
    // @LINE:30
    case controllers_Assets_at12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_0.at(path, file))
      }
  }
}
