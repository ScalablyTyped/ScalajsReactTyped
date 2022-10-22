package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsExtendedStatsBucketAggregation
  extends StObject
     with AggregationsPipelineAggregationBase {
  
  var sigma: js.UndefOr[double] = js.undefined
}
object AggregationsExtendedStatsBucketAggregation {
  
  inline def apply(): AggregationsExtendedStatsBucketAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsExtendedStatsBucketAggregation]
  }
  
  extension [Self <: AggregationsExtendedStatsBucketAggregation](x: Self) {
    
    inline def setSigma(value: double): Self = StObject.set(x, "sigma", value.asInstanceOf[js.Any])
    
    inline def setSigmaUndefined: Self = StObject.set(x, "sigma", js.undefined)
  }
}
