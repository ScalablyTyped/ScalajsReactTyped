package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneComputed extends StObject {
  
  def indexedPanes(): SplitpaneIndexedType | Null
  
  def panesCount(): Double
}
object SplitpaneComputed {
  
  inline def apply(indexedPanes: CallbackTo[SplitpaneIndexedType | Null], panesCount: CallbackTo[Double]): SplitpaneComputed = {
    val __obj = js.Dynamic.literal(indexedPanes = indexedPanes.toJsFn, panesCount = panesCount.toJsFn)
    __obj.asInstanceOf[SplitpaneComputed]
  }
  
  extension [Self <: SplitpaneComputed](x: Self) {
    
    inline def setIndexedPanes(value: CallbackTo[SplitpaneIndexedType | Null]): Self = StObject.set(x, "indexedPanes", value.toJsFn)
    
    inline def setPanesCount(value: CallbackTo[Double]): Self = StObject.set(x, "panesCount", value.toJsFn)
  }
}
