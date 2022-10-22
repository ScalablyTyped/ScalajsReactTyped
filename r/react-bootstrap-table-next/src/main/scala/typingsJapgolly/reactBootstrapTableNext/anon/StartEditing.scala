package typingsJapgolly.reactBootstrapTableNext.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEditing extends StObject {
  
  def startEditing(rowIndex: Double, columnIndex: Double): Unit
}
object StartEditing {
  
  inline def apply(startEditing: (Double, Double) => Callback): StartEditing = {
    val __obj = js.Dynamic.literal(startEditing = js.Any.fromFunction2((t0: Double, t1: Double) => (startEditing(t0, t1)).runNow()))
    __obj.asInstanceOf[StartEditing]
  }
  
  extension [Self <: StartEditing](x: Self) {
    
    inline def setStartEditing(value: (Double, Double) => Callback): Self = StObject.set(x, "startEditing", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
