package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitMatrix extends StObject {
  
  def release(): Unit
  
  def setValueAt(x: Double, y: Double, value: Boolean): Unit
  
  def valueAt(x: Double, y: Double): Boolean
}
object IBitMatrix {
  
  inline def apply(
    release: Callback,
    setValueAt: (Double, Double, Boolean) => Callback,
    valueAt: (Double, Double) => Boolean
  ): IBitMatrix = {
    val __obj = js.Dynamic.literal(release = release.toJsFn, setValueAt = js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (setValueAt(t0, t1, t2)).runNow()), valueAt = js.Any.fromFunction2(valueAt))
    __obj.asInstanceOf[IBitMatrix]
  }
  
  extension [Self <: IBitMatrix](x: Self) {
    
    inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
    
    inline def setSetValueAt(value: (Double, Double, Boolean) => Callback): Self = StObject.set(x, "setValueAt", js.Any.fromFunction3((t0: Double, t1: Double, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setValueAt(value: (Double, Double) => Boolean): Self = StObject.set(x, "valueAt", js.Any.fromFunction2(value))
  }
}
