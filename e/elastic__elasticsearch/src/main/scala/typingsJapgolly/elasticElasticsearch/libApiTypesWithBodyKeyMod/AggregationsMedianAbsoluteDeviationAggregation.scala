package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMedianAbsoluteDeviationAggregation
  extends StObject
     with AggregationsFormatMetricAggregationBase {
  
  var compression: js.UndefOr[double] = js.undefined
}
object AggregationsMedianAbsoluteDeviationAggregation {
  
  inline def apply(): AggregationsMedianAbsoluteDeviationAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMedianAbsoluteDeviationAggregation]
  }
  
  extension [Self <: AggregationsMedianAbsoluteDeviationAggregation](x: Self) {
    
    inline def setCompression(value: double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
  }
}
