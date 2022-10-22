package typingsJapgolly.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegimeAcknowledge
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var metric_names: js.Array[String]
  
  var order_index: Double
  
  var page_url: String
}
object RegimeAcknowledge {
  
  inline def apply(metric_names: js.Array[String], order_index: Double, page_url: String): RegimeAcknowledge = {
    val __obj = js.Dynamic.literal(metric_names = metric_names.asInstanceOf[js.Any], order_index = order_index.asInstanceOf[js.Any], page_url = page_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegimeAcknowledge]
  }
  
  extension [Self <: RegimeAcknowledge](x: Self) {
    
    inline def setMetric_names(value: js.Array[String]): Self = StObject.set(x, "metric_names", value.asInstanceOf[js.Any])
    
    inline def setMetric_namesVarargs(value: String*): Self = StObject.set(x, "metric_names", js.Array(value*))
    
    inline def setOrder_index(value: Double): Self = StObject.set(x, "order_index", value.asInstanceOf[js.Any])
    
    inline def setPage_url(value: String): Self = StObject.set(x, "page_url", value.asInstanceOf[js.Any])
  }
}
