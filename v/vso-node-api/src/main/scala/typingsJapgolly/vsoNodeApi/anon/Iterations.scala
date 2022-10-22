package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iterations extends StObject {
  
  var iterations: scala.Double
  
  var none: scala.Double
  
  var workItems: scala.Double
}
object Iterations {
  
  inline def apply(iterations: scala.Double, none: scala.Double, workItems: scala.Double): Iterations = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterations]
  }
  
  extension [Self <: Iterations](x: Self) {
    
    inline def setIterations(value: scala.Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setWorkItems(value: scala.Double): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
  }
}
