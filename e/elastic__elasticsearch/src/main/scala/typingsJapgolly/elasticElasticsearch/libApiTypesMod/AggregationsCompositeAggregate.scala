package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsCompositeAggregate
  extends StObject
     with AggregationsMultiBucketAggregateBase[AggregationsCompositeBucket]
     with _AggregationsAggregate {
  
  var after_key: js.UndefOr[Record[String, Any]] = js.undefined
}
object AggregationsCompositeAggregate {
  
  inline def apply(buckets: AggregationsBuckets[AggregationsCompositeBucket]): AggregationsCompositeAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsCompositeAggregate]
  }
  
  extension [Self <: AggregationsCompositeAggregate](x: Self) {
    
    inline def setAfter_key(value: Record[String, Any]): Self = StObject.set(x, "after_key", value.asInstanceOf[js.Any])
    
    inline def setAfter_keyUndefined: Self = StObject.set(x, "after_key", js.undefined)
  }
}
