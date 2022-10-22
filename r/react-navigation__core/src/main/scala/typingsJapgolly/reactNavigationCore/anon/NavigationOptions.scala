package typingsJapgolly.reactNavigationCore.anon

import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions[ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */] extends StObject {
  
  var navigation: Any
  
  var options: ScreenOptions
  
  var route: RouteProp[ParamList, Keyof[ParamList]]
}
object NavigationOptions {
  
  inline def apply[ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */](navigation: Any, options: ScreenOptions, route: RouteProp[ParamList, Keyof[ParamList]]): NavigationOptions[ParamList, ScreenOptions] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions[ParamList, ScreenOptions]]
  }
  
  extension [Self <: NavigationOptions[?, ?], ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */](x: Self & (NavigationOptions[ParamList, ScreenOptions])) {
    
    inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ScreenOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteProp[ParamList, Keyof[ParamList]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
