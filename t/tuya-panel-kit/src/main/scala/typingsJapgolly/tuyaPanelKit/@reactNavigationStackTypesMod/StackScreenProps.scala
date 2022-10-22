package typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`

import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.RouteProp
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackScreenProps[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  var navigation: StackNavigationProp[ParamList, RouteName]
  
  var route: RouteProp[ParamList, RouteName]
}
object StackScreenProps {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](navigation: StackNavigationProp[ParamList, RouteName], route: RouteProp[ParamList, RouteName]): StackScreenProps[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackScreenProps[ParamList, RouteName]]
  }
  
  extension [Self <: StackScreenProps[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (StackScreenProps[ParamList, RouteName])) {
    
    inline def setNavigation(value: StackNavigationProp[ParamList, RouteName]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamList, RouteName]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
