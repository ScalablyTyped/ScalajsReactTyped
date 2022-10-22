package typingsJapgolly.reactShare.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  def count(index: Double, count: Double): Unit
}
object Count {
  
  inline def apply(count: (Double, Double) => Callback): Count = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction2((t0: Double, t1: Double) => (count(t0, t1)).runNow()))
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: (Double, Double) => Callback): Self = StObject.set(x, "count", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
