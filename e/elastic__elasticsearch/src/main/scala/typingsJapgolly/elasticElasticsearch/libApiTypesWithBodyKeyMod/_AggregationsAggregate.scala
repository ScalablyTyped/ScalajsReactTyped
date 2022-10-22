package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AggregationsAggregate extends StObject
object _AggregationsAggregate {
  
  inline def AggregationsAutoDateHistogramAggregate(buckets: AggregationsBuckets[AggregationsDateHistogramBucket], interval: DurationLarge): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAutoDateHistogramAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAutoDateHistogramAggregate]
  }
  
  inline def AggregationsBoxPlotAggregate(lower: double, max: double, min: double, q1: double, q2: double, q3: double, upper: double): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBoxPlotAggregate = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q2 = q2.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBoxPlotAggregate]
  }
  
  inline def AggregationsBucketMetricValueAggregate(keys: js.Array[String]): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBucketMetricValueAggregate = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsBucketMetricValueAggregate]
  }
  
  inline def AggregationsCardinalityAggregate(value: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCardinalityAggregate]
  }
  
  inline def AggregationsChildrenAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsChildrenAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsChildrenAggregate]
  }
  
  inline def AggregationsCompositeAggregate(buckets: AggregationsBuckets[AggregationsCompositeBucket]): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCompositeAggregate = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCompositeAggregate]
  }
  
  inline def AggregationsCumulativeCardinalityAggregate(value: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCumulativeCardinalityAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsCumulativeCardinalityAggregate]
  }
  
  inline def AggregationsDerivativeAggregate(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsDerivativeAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsDerivativeAggregate]
  }
  
  inline def AggregationsExtendedStatsAggregate(count: long, sum: double): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsExtendedStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null, std_deviation = null, sum_of_squares = null, variance = null, variance_population = null, variance_sampling = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsExtendedStatsAggregate]
  }
  
  inline def AggregationsFilterAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsFilterAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsFilterAggregate]
  }
  
  inline def AggregationsGeoBoundsAggregate(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoBoundsAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoBoundsAggregate]
  }
  
  inline def AggregationsGeoCentroidAggregate(count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoCentroidAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoCentroidAggregate]
  }
  
  inline def AggregationsGeoLineAggregate(geometry: GeoLine, `type`: String): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoLineAggregate = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGeoLineAggregate]
  }
  
  inline def AggregationsGlobalAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGlobalAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsGlobalAggregate]
  }
  
  inline def AggregationsInferenceAggregate(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsInferenceAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsInferenceAggregate]
  }
  
  inline def AggregationsMatrixStatsAggregate(doc_count: long, fields: js.Array[AggregationsMatrixStatsFields]): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMatrixStatsAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMatrixStatsAggregate]
  }
  
  inline def AggregationsMissingAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMissingAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsMissingAggregate]
  }
  
  inline def AggregationsNestedAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsNestedAggregate]
  }
  
  inline def AggregationsParentAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsParentAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsParentAggregate]
  }
  
  inline def AggregationsRateAggregate(value: double): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsRateAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsRateAggregate]
  }
  
  inline def AggregationsReverseNestedAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsReverseNestedAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsReverseNestedAggregate]
  }
  
  inline def AggregationsSamplerAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsSamplerAggregate]
  }
  
  inline def AggregationsScriptedMetricAggregate(value: Any): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsScriptedMetricAggregate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsScriptedMetricAggregate]
  }
  
  inline def AggregationsStatsAggregate(count: long, sum: double): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], avg = null, max = null, min = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStatsAggregate]
  }
  
  inline def AggregationsStringStatsAggregate(count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStringStatsAggregate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], avg_length = null, entropy = null, max_length = null, min_length = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsStringStatsAggregate]
  }
  
  inline def AggregationsTTestAggregate(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTTestAggregate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTTestAggregate]
  }
  
  inline def AggregationsTopHitsAggregate(hits: SearchHitsMetadata[Any]): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopHitsAggregate = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopHitsAggregate]
  }
  
  inline def AggregationsTopMetricsAggregate(top: js.Array[AggregationsTopMetrics]): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopMetricsAggregate = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsTopMetricsAggregate]
  }
  
  inline def AggregationsUnmappedSamplerAggregate(doc_count: long): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsUnmappedSamplerAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsUnmappedSamplerAggregate]
  }
}
