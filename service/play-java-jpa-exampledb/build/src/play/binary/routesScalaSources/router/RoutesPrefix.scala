// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Documents/major_project/2020_Know_Your_Leader/service/play-java-jpa-exampledb/conf/routes
// @DATE:Tue Mar 10 14:43:53 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
