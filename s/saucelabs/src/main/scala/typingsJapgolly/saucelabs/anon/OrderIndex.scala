package typingsJapgolly.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderIndex extends StObject {
  
  var metricNames: js.Array[String]
  
  var orderIndex: Double
  
  var regimeEnd: js.UndefOr[Double] = js.undefined
  
  var regimeStart: js.UndefOr[Double] = js.undefined
}
object OrderIndex {
  
  inline def apply(metricNames: js.Array[String], orderIndex: Double): OrderIndex = {
    val __obj = js.Dynamic.literal(metricNames = metricNames.asInstanceOf[js.Any], orderIndex = orderIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderIndex]
  }
  
  extension [Self <: OrderIndex](x: Self) {
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setOrderIndex(value: Double): Self = StObject.set(x, "orderIndex", value.asInstanceOf[js.Any])
    
    inline def setRegimeEnd(value: Double): Self = StObject.set(x, "regimeEnd", value.asInstanceOf[js.Any])
    
    inline def setRegimeEndUndefined: Self = StObject.set(x, "regimeEnd", js.undefined)
    
    inline def setRegimeStart(value: Double): Self = StObject.set(x, "regimeStart", value.asInstanceOf[js.Any])
    
    inline def setRegimeStartUndefined: Self = StObject.set(x, "regimeStart", js.undefined)
  }
}
