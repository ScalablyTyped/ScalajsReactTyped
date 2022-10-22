package typingsJapgolly.cytoscape.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Degree extends StObject {
  
  def degree(): Double
}
object Degree {
  
  inline def apply(degree: CallbackTo[Double]): Degree = {
    val __obj = js.Dynamic.literal(degree = degree.toJsFn)
    __obj.asInstanceOf[Degree]
  }
  
  extension [Self <: Degree](x: Self) {
    
    inline def setDegree(value: CallbackTo[Double]): Self = StObject.set(x, "degree", value.toJsFn)
  }
}
