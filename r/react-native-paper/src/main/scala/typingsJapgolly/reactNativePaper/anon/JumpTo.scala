package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpTo extends StObject {
  
  def jumpTo(key: String): Unit
  
  var route: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
}
object JumpTo {
  
  inline def apply(
    jumpTo: String => Callback,
    route: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
  ): JumpTo = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1((t0: String) => jumpTo(t0).runNow()), route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpTo]
  }
  
  extension [Self <: JumpTo](x: Self) {
    
    inline def setJumpTo(value: String => Callback): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRoute(
      value: typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
    ): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
