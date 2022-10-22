package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneComputed extends StObject {
  
  def maxSizeNumber(): Double
  
  def minSizeNumber(): Double
  
  def sizeNumber(): Double | Null
}
object PaneComputed {
  
  inline def apply(
    maxSizeNumber: CallbackTo[Double],
    minSizeNumber: CallbackTo[Double],
    sizeNumber: CallbackTo[Double | Null]
  ): PaneComputed = {
    val __obj = js.Dynamic.literal(maxSizeNumber = maxSizeNumber.toJsFn, minSizeNumber = minSizeNumber.toJsFn, sizeNumber = sizeNumber.toJsFn)
    __obj.asInstanceOf[PaneComputed]
  }
  
  extension [Self <: PaneComputed](x: Self) {
    
    inline def setMaxSizeNumber(value: CallbackTo[Double]): Self = StObject.set(x, "maxSizeNumber", value.toJsFn)
    
    inline def setMinSizeNumber(value: CallbackTo[Double]): Self = StObject.set(x, "minSizeNumber", value.toJsFn)
    
    inline def setSizeNumber(value: CallbackTo[Double | Null]): Self = StObject.set(x, "sizeNumber", value.toJsFn)
  }
}
