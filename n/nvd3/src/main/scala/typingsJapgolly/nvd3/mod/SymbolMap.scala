package typingsJapgolly.nvd3.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolMap extends StObject {
  
  def set(name: String, func: js.Function1[/* size */ Any, Unit]): Unit
}
object SymbolMap {
  
  inline def apply(set: (String, js.Function1[/* size */ Any, Unit]) => Callback): SymbolMap = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2((t0: String, t1: js.Function1[/* size */ Any, Unit]) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[SymbolMap]
  }
  
  extension [Self <: SymbolMap](x: Self) {
    
    inline def setSet(value: (String, js.Function1[/* size */ Any, Unit]) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: js.Function1[/* size */ Any, Unit]) => (value(t0, t1)).runNow()))
  }
}
