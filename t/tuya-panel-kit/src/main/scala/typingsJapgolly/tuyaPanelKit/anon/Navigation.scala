package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.RouteProp
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigation[ParamList /* <: ParamListBase */] extends StObject {
  
  var navigation: Any
  
  var route: RouteProp[ParamList, /* keyof ParamList */ String]
}
object Navigation {
  
  inline def apply[ParamList /* <: ParamListBase */](navigation: Any, route: RouteProp[ParamList, /* keyof ParamList */ String]): Navigation[ParamList] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation[ParamList]]
  }
  
  extension [Self <: Navigation[?], ParamList /* <: ParamListBase */](x: Self & Navigation[ParamList]) {
    
    inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamList, /* keyof ParamList */ String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
