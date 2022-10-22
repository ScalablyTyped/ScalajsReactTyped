package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsFormattableMetricAggregation
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var format: js.UndefOr[String] = js.undefined
}
object AggregationsFormattableMetricAggregation {
  
  inline def apply(): AggregationsFormattableMetricAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsFormattableMetricAggregation]
  }
  
  extension [Self <: AggregationsFormattableMetricAggregation](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
