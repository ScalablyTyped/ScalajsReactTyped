package typingsJapgolly.cytoscape.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxDegree extends StObject {
  
  def maxDegree(): Double
}
object MaxDegree {
  
  inline def apply(maxDegree: CallbackTo[Double]): MaxDegree = {
    val __obj = js.Dynamic.literal(maxDegree = maxDegree.toJsFn)
    __obj.asInstanceOf[MaxDegree]
  }
  
  extension [Self <: MaxDegree](x: Self) {
    
    inline def setMaxDegree(value: CallbackTo[Double]): Self = StObject.set(x, "maxDegree", value.toJsFn)
  }
}
