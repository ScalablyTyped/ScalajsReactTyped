package typingsJapgolly.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  var metrics: js.Array[Id]
}
object Metrics {
  
  inline def apply(metrics: js.Array[Id]): Metrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  
  extension [Self <: Metrics](x: Self) {
    
    inline def setMetrics(value: js.Array[Id]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsVarargs(value: Id*): Self = StObject.set(x, "metrics", js.Array(value*))
  }
}
