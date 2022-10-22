package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nest extends StObject {
  
  def Burn(menu: Any, `type`: Any): Unit
  
  def Feather(menu: Any, `type`: Any): Unit
}
object Nest {
  
  inline def apply(Burn: (Any, Any) => Callback, Feather: (Any, Any) => Callback): Nest = {
    val __obj = js.Dynamic.literal(Burn = js.Any.fromFunction2((t0: Any, t1: Any) => (Burn(t0, t1)).runNow()), Feather = js.Any.fromFunction2((t0: Any, t1: Any) => (Feather(t0, t1)).runNow()))
    __obj.asInstanceOf[Nest]
  }
  
  extension [Self <: Nest](x: Self) {
    
    inline def setBurn(value: (Any, Any) => Callback): Self = StObject.set(x, "Burn", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setFeather(value: (Any, Any) => Callback): Self = StObject.set(x, "Feather", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
  }
}
