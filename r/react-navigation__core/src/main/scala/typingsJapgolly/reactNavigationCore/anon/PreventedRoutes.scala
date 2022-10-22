package typingsJapgolly.reactNavigationCore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventedRoutes extends StObject {
  
  var preventedRoutes: typingsJapgolly.reactNavigationCore.libTypescriptSrcPreventRemoveContextMod.PreventedRoutes
  
  def setPreventRemove(id: String, routeKey: String, preventRemove: Boolean): Unit
}
object PreventedRoutes {
  
  inline def apply(
    preventedRoutes: typingsJapgolly.reactNavigationCore.libTypescriptSrcPreventRemoveContextMod.PreventedRoutes,
    setPreventRemove: (String, String, Boolean) => Callback
  ): PreventedRoutes = {
    val __obj = js.Dynamic.literal(preventedRoutes = preventedRoutes.asInstanceOf[js.Any], setPreventRemove = js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (setPreventRemove(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[PreventedRoutes]
  }
  
  extension [Self <: PreventedRoutes](x: Self) {
    
    inline def setPreventedRoutes(value: typingsJapgolly.reactNavigationCore.libTypescriptSrcPreventRemoveContextMod.PreventedRoutes): Self = StObject.set(x, "preventedRoutes", value.asInstanceOf[js.Any])
    
    inline def setSetPreventRemove(value: (String, String, Boolean) => Callback): Self = StObject.set(x, "setPreventRemove", js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
