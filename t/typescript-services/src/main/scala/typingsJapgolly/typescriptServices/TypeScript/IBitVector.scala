package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitVector extends StObject {
  
  def release(): Unit
  
  def setValueAt(index: Double, value: Boolean): Unit
  
  def valueAt(index: Double): Boolean
}
object IBitVector {
  
  inline def apply(release: Callback, setValueAt: (Double, Boolean) => Callback, valueAt: Double => Boolean): IBitVector = {
    val __obj = js.Dynamic.literal(release = release.toJsFn, setValueAt = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setValueAt(t0, t1)).runNow()), valueAt = js.Any.fromFunction1(valueAt))
    __obj.asInstanceOf[IBitVector]
  }
  
  extension [Self <: IBitVector](x: Self) {
    
    inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
    
    inline def setSetValueAt(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setValueAt", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setValueAt(value: Double => Boolean): Self = StObject.set(x, "valueAt", js.Any.fromFunction1(value))
  }
}
