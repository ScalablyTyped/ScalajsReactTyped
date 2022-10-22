package typingsJapgolly.reactNavigationCore.anon

import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteRouteProp extends StObject {
  
  var navigation: Any
  
  var route: RouteProp[ParamListBase, String]
}
object RouteRouteProp {
  
  inline def apply(navigation: Any, route: RouteProp[ParamListBase, String]): RouteRouteProp = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRouteProp]
  }
  
  extension [Self <: RouteRouteProp](x: Self) {
    
    inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamListBase, String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
