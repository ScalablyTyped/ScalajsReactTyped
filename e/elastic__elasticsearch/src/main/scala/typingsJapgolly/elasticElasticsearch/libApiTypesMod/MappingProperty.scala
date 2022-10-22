package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingBinaryProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingBooleanProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDynamicProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingJoinProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingKeywordProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingMatchOnlyTextProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingPercolatorProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingRankFeatureProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingRankFeaturesProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingSearchAsYouTypeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingTextProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingVersionProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingWildcardProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateNanosProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingAggregateMetricDoubleProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDenseVectorProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFlattenedProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingNestedProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingObjectProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingCompletionProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingConstantKeywordProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFieldAliasProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingHistogramProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIpProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingMurmur3HashProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingTokenCountProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingGeoPointProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingGeoShapeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingPointProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingShapeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingByteNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDoubleNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFloatNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingHalfFloatNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIntegerNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingLongNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingScaledFloatNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingShortNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingUnsignedLongNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDoubleRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFloatRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIntegerRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIpRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingLongRangeProperty
*/
trait MappingProperty extends StObject
object MappingProperty {
  
  inline def MappingAggregateMetricDoubleProperty(default_metric: String, metrics: js.Array[String]): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingAggregateMetricDoubleProperty = {
    val __obj = js.Dynamic.literal(default_metric = default_metric.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aggregate_metric_double")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingAggregateMetricDoubleProperty]
  }
  
  inline def MappingBinaryProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingBinaryProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingBinaryProperty]
  }
  
  inline def MappingBooleanProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingBooleanProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingBooleanProperty]
  }
  
  inline def MappingByteNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingByteNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingByteNumberProperty]
  }
  
  inline def MappingCompletionProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingCompletionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("completion")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingCompletionProperty]
  }
  
  inline def MappingConstantKeywordProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingConstantKeywordProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("constant_keyword")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingConstantKeywordProperty]
  }
  
  inline def MappingDateNanosProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateNanosProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date_nanos")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateNanosProperty]
  }
  
  inline def MappingDateProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateProperty]
  }
  
  inline def MappingDateRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDateRangeProperty]
  }
  
  inline def MappingDenseVectorProperty(dims: integer): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDenseVectorProperty = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dense_vector")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDenseVectorProperty]
  }
  
  inline def MappingDoubleNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDoubleNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDoubleNumberProperty]
  }
  
  inline def MappingDoubleRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDoubleRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDoubleRangeProperty]
  }
  
  inline def MappingDynamicProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDynamicProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("{dynamic_property}")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingDynamicProperty]
  }
  
  inline def MappingFieldAliasProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFieldAliasProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("alias")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFieldAliasProperty]
  }
  
  inline def MappingFlattenedProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFlattenedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("flattened")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFlattenedProperty]
  }
  
  inline def MappingFloatNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFloatNumberProperty]
  }
  
  inline def MappingFloatRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFloatRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingFloatRangeProperty]
  }
  
  inline def MappingGeoPointProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingGeoPointProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geo_point")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingGeoPointProperty]
  }
  
  inline def MappingGeoShapeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingGeoShapeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geo_shape")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingGeoShapeProperty]
  }
  
  inline def MappingHalfFloatNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingHalfFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("half_float")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingHalfFloatNumberProperty]
  }
  
  inline def MappingHistogramProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingHistogramProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("histogram")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingHistogramProperty]
  }
  
  inline def MappingIntegerNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIntegerNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIntegerNumberProperty]
  }
  
  inline def MappingIntegerRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIntegerRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIntegerRangeProperty]
  }
  
  inline def MappingIpProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIpProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ip")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIpProperty]
  }
  
  inline def MappingIpRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIpRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ip_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingIpRangeProperty]
  }
  
  inline def MappingJoinProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingJoinProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("join")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingJoinProperty]
  }
  
  inline def MappingKeywordProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingKeywordProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingKeywordProperty]
  }
  
  inline def MappingLongNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingLongNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingLongNumberProperty]
  }
  
  inline def MappingLongRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingLongRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingLongRangeProperty]
  }
  
  inline def MappingMatchOnlyTextProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingMatchOnlyTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("match_only_text")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingMatchOnlyTextProperty]
  }
  
  inline def MappingMurmur3HashProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingMurmur3HashProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("murmur3")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingMurmur3HashProperty]
  }
  
  inline def MappingNestedProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingNestedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nested")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingNestedProperty]
  }
  
  inline def MappingObjectProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingObjectProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingObjectProperty]
  }
  
  inline def MappingPercolatorProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingPercolatorProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("percolator")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingPercolatorProperty]
  }
  
  inline def MappingPointProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingPointProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingPointProperty]
  }
  
  inline def MappingRankFeatureProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingRankFeatureProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rank_feature")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingRankFeatureProperty]
  }
  
  inline def MappingRankFeaturesProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingRankFeaturesProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rank_features")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingRankFeaturesProperty]
  }
  
  inline def MappingScaledFloatNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingScaledFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("scaled_float")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingScaledFloatNumberProperty]
  }
  
  inline def MappingSearchAsYouTypeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingSearchAsYouTypeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("search_as_you_type")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingSearchAsYouTypeProperty]
  }
  
  inline def MappingShapeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingShapeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("shape")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingShapeProperty]
  }
  
  inline def MappingShortNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingShortNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingShortNumberProperty]
  }
  
  inline def MappingTextProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingTextProperty]
  }
  
  inline def MappingTokenCountProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingTokenCountProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("token_count")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingTokenCountProperty]
  }
  
  inline def MappingUnsignedLongNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingUnsignedLongNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unsigned_long")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingUnsignedLongNumberProperty]
  }
  
  inline def MappingVersionProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingVersionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("version")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingVersionProperty]
  }
  
  inline def MappingWildcardProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingWildcardProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wildcard")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.MappingWildcardProperty]
  }
}
