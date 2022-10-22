package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsUnmappedSamplerAggregate
  extends StObject
     with AggregationsSingleBucketAggregateBase
     with /* property */ StringDictionary[AggregationsAggregate | long | Metadata]
     with _AggregationsAggregate
object AggregationsUnmappedSamplerAggregate {
  
  inline def apply(doc_count: long): AggregationsUnmappedSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsUnmappedSamplerAggregate]
  }
}
