package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsFormatMetricAggregationBase
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var format: js.UndefOr[String] = js.undefined
}
object AggregationsFormatMetricAggregationBase {
  
  inline def apply(): AggregationsFormatMetricAggregationBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsFormatMetricAggregationBase]
  }
  
  extension [Self <: AggregationsFormatMetricAggregationBase](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
