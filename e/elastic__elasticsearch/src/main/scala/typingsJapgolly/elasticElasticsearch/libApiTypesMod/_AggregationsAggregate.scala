package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AggregationsAggregate extends StObject
object _AggregationsAggregate {
  
  inline def AggregationsAutoDateHistogramAggregate(buckets: AggregationsBuckets[AggregationsDateHistogramBucket], interval: DurationLarge): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsAutoDateHistogramAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsAutoDateHistogramAggregate]
  }
  
  inline def AggregationsBoxPlotAggregate(lower: double, max: double, min: double, q1: double, q2: double, q3: double, upper: double): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsBoxPlotAggregate = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q2 = q2.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsBoxPlotAggregate]
  }
  
  inline def AggregationsBucketMetricValueAggregate(keys: js.Array[String]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsBucketMetricValueAggregate = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsBucketMetricValueAggregate]
  }
  
  inline def AggregationsCardinalityAggregate(value: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsCardinalityAggregate]
  }
  
  inline def AggregationsChildrenAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsChildrenAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsChildrenAggregate]
  }
  
  inline def AggregationsCompositeAggregate(buckets: AggregationsBuckets[AggregationsCompositeBucket]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsCompositeAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsCompositeAggregate]
  }
  
  inline def AggregationsCumulativeCardinalityAggregate(value: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsCumulativeCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsCumulativeCardinalityAggregate]
  }
  
  inline def AggregationsDerivativeAggregate(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsDerivativeAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsDerivativeAggregate]
  }
  
  inline def AggregationsExtendedStatsAggregate(count: long, sum: double): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsExtendedStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null, std_deviation = null, sum_of_squares = null, variance = null, variance_population = null, variance_sampling = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsExtendedStatsAggregate]
  }
  
  inline def AggregationsFilterAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsFilterAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsFilterAggregate]
  }
  
  inline def AggregationsGeoBoundsAggregate(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsGeoBoundsAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsGeoBoundsAggregate]
  }
  
  inline def AggregationsGeoCentroidAggregate(count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsGeoCentroidAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsGeoCentroidAggregate]
  }
  
  inline def AggregationsGeoLineAggregate(geometry: GeoLine, `type`: String): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsGeoLineAggregate = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsGeoLineAggregate]
  }
  
  inline def AggregationsGlobalAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsGlobalAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsGlobalAggregate]
  }
  
  inline def AggregationsInferenceAggregate(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsInferenceAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsInferenceAggregate]
  }
  
  inline def AggregationsMatrixStatsAggregate(doc_count: long, fields: js.Array[AggregationsMatrixStatsFields]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsMatrixStatsAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsMatrixStatsAggregate]
  }
  
  inline def AggregationsMissingAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsMissingAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsMissingAggregate]
  }
  
  inline def AggregationsNestedAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsNestedAggregate]
  }
  
  inline def AggregationsParentAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsParentAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsParentAggregate]
  }
  
  inline def AggregationsRateAggregate(value: double): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsRateAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsRateAggregate]
  }
  
  inline def AggregationsReverseNestedAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsReverseNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsReverseNestedAggregate]
  }
  
  inline def AggregationsSamplerAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsSamplerAggregate]
  }
  
  inline def AggregationsScriptedMetricAggregate(value: Any): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsScriptedMetricAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsScriptedMetricAggregate]
  }
  
  inline def AggregationsStatsAggregate(count: long, sum: double): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsStatsAggregate]
  }
  
  inline def AggregationsStringStatsAggregate(count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsStringStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], avg_length = null, entropy = null, max_length = null, min_length = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsStringStatsAggregate]
  }
  
  inline def AggregationsTTestAggregate(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsTTestAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsTTestAggregate]
  }
  
  inline def AggregationsTopHitsAggregate(hits: SearchHitsMetadata[Any]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsTopHitsAggregate = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsTopHitsAggregate]
  }
  
  inline def AggregationsTopMetricsAggregate(top: js.Array[AggregationsTopMetrics]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsTopMetricsAggregate = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsTopMetricsAggregate]
  }
  
  inline def AggregationsUnmappedSamplerAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsUnmappedSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.AggregationsUnmappedSamplerAggregate]
  }
}
