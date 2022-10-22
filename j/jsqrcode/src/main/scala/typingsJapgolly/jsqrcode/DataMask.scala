package typingsJapgolly.jsqrcode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMask extends StObject {
  
  def isMasked(i: Double, j: Double): Boolean
  
  def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit
}
object DataMask {
  
  inline def apply(isMasked: (Double, Double) => Boolean, unmaskBitMatrix: (js.Array[Double], Double) => Callback): DataMask = {
    val __obj = js.Dynamic.literal(isMasked = js.Any.fromFunction2(isMasked), unmaskBitMatrix = js.Any.fromFunction2((t0: js.Array[Double], t1: Double) => (unmaskBitMatrix(t0, t1)).runNow()))
    __obj.asInstanceOf[DataMask]
  }
  
  extension [Self <: DataMask](x: Self) {
    
    inline def setIsMasked(value: (Double, Double) => Boolean): Self = StObject.set(x, "isMasked", js.Any.fromFunction2(value))
    
    inline def setUnmaskBitMatrix(value: (js.Array[Double], Double) => Callback): Self = StObject.set(x, "unmaskBitMatrix", js.Any.fromFunction2((t0: js.Array[Double], t1: Double) => (value(t0, t1)).runNow()))
  }
}
