package typingsJapgolly.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  var route: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
}
object Route {
  
  inline def apply(
    route: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
  ): Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setRoute(
      value: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
    ): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
