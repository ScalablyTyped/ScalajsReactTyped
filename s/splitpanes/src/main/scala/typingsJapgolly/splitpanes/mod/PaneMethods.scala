package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneMethods extends StObject {
  
  def update(style: Any): Unit
}
object PaneMethods {
  
  inline def apply(update: Any => Callback): PaneMethods = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1((t0: Any) => update(t0).runNow()))
    __obj.asInstanceOf[PaneMethods]
  }
  
  extension [Self <: PaneMethods](x: Self) {
    
    inline def setUpdate(value: Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
