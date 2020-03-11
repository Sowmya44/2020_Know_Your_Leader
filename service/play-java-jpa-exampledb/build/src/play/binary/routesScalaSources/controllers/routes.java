// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Documents/major_project/2020_Know_Your_Leader/service/play-java-jpa-exampledb/conf/routes
// @DATE:Tue Mar 10 14:43:53 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRatingController RatingController = new controllers.ReverseRatingController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseActionController ActionController = new controllers.ReverseActionController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRatingController RatingController = new controllers.javascript.ReverseRatingController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseActionController ActionController = new controllers.javascript.ReverseActionController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
