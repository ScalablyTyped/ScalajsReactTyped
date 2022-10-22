package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  route :react-native-paper.react-native-paper/lib/typescript/components/BottomNavigation/BottomNavigation.Route} & react-native-paper.react-native-paper/lib/typescript/components/BottomNavigation/BottomNavigation.TabPressEvent */
trait routeRouteTabPressEvent extends StObject {
  
  var defaultPrevented: Boolean
  
  def preventDefault(): Unit
  
  var route: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
}
object routeRouteTabPressEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    preventDefault: Callback,
    route: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
  ): routeRouteTabPressEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[routeRouteTabPressEvent]
  }
  
  extension [Self <: routeRouteTabPressEvent](x: Self) {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setRoute(
      value: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
    ): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
