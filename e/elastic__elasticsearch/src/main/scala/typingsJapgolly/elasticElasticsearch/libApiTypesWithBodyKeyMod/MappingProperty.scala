package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingBinaryProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingBooleanProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDynamicProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingJoinProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingKeywordProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingMatchOnlyTextProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingPercolatorProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRankFeatureProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRankFeaturesProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingSearchAsYouTypeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTextProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingVersionProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingWildcardProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateNanosProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingAggregateMetricDoubleProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDenseVectorProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFlattenedProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingNestedProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingObjectProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingCompletionProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingConstantKeywordProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFieldAliasProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingHistogramProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIpProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingMurmur3HashProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTokenCountProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingGeoPointProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingGeoShapeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingPointProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingShapeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingByteNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDoubleNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFloatNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingHalfFloatNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIntegerNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingLongNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingScaledFloatNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingShortNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingUnsignedLongNumberProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDoubleRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFloatRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIntegerRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIpRangeProperty
  - typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingLongRangeProperty
*/
trait MappingProperty extends StObject
object MappingProperty {
  
  inline def MappingAggregateMetricDoubleProperty(default_metric: String, metrics: js.Array[String]): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingAggregateMetricDoubleProperty = {
    val __obj = js.Dynamic.literal(default_metric = default_metric.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aggregate_metric_double")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingAggregateMetricDoubleProperty]
  }
  
  inline def MappingBinaryProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingBinaryProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingBinaryProperty]
  }
  
  inline def MappingBooleanProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingBooleanProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingBooleanProperty]
  }
  
  inline def MappingByteNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingByteNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingByteNumberProperty]
  }
  
  inline def MappingCompletionProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingCompletionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("completion")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingCompletionProperty]
  }
  
  inline def MappingConstantKeywordProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingConstantKeywordProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("constant_keyword")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingConstantKeywordProperty]
  }
  
  inline def MappingDateNanosProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateNanosProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date_nanos")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateNanosProperty]
  }
  
  inline def MappingDateProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateProperty]
  }
  
  inline def MappingDateRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDateRangeProperty]
  }
  
  inline def MappingDenseVectorProperty(dims: integer): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDenseVectorProperty = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dense_vector")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDenseVectorProperty]
  }
  
  inline def MappingDoubleNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDoubleNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDoubleNumberProperty]
  }
  
  inline def MappingDoubleRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDoubleRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDoubleRangeProperty]
  }
  
  inline def MappingDynamicProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDynamicProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("{dynamic_property}")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDynamicProperty]
  }
  
  inline def MappingFieldAliasProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFieldAliasProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("alias")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFieldAliasProperty]
  }
  
  inline def MappingFlattenedProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFlattenedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("flattened")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFlattenedProperty]
  }
  
  inline def MappingFloatNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFloatNumberProperty]
  }
  
  inline def MappingFloatRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFloatRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFloatRangeProperty]
  }
  
  inline def MappingGeoPointProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingGeoPointProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geo_point")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingGeoPointProperty]
  }
  
  inline def MappingGeoShapeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingGeoShapeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geo_shape")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingGeoShapeProperty]
  }
  
  inline def MappingHalfFloatNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingHalfFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("half_float")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingHalfFloatNumberProperty]
  }
  
  inline def MappingHistogramProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingHistogramProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("histogram")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingHistogramProperty]
  }
  
  inline def MappingIntegerNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIntegerNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIntegerNumberProperty]
  }
  
  inline def MappingIntegerRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIntegerRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIntegerRangeProperty]
  }
  
  inline def MappingIpProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIpProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ip")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIpProperty]
  }
  
  inline def MappingIpRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIpRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ip_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingIpRangeProperty]
  }
  
  inline def MappingJoinProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingJoinProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("join")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingJoinProperty]
  }
  
  inline def MappingKeywordProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingKeywordProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingKeywordProperty]
  }
  
  inline def MappingLongNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingLongNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingLongNumberProperty]
  }
  
  inline def MappingLongRangeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingLongRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long_range")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingLongRangeProperty]
  }
  
  inline def MappingMatchOnlyTextProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingMatchOnlyTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("match_only_text")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingMatchOnlyTextProperty]
  }
  
  inline def MappingMurmur3HashProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingMurmur3HashProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("murmur3")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingMurmur3HashProperty]
  }
  
  inline def MappingNestedProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingNestedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nested")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingNestedProperty]
  }
  
  inline def MappingObjectProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingObjectProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingObjectProperty]
  }
  
  inline def MappingPercolatorProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingPercolatorProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("percolator")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingPercolatorProperty]
  }
  
  inline def MappingPointProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingPointProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingPointProperty]
  }
  
  inline def MappingRankFeatureProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRankFeatureProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rank_feature")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRankFeatureProperty]
  }
  
  inline def MappingRankFeaturesProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRankFeaturesProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rank_features")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRankFeaturesProperty]
  }
  
  inline def MappingScaledFloatNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingScaledFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("scaled_float")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingScaledFloatNumberProperty]
  }
  
  inline def MappingSearchAsYouTypeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingSearchAsYouTypeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("search_as_you_type")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingSearchAsYouTypeProperty]
  }
  
  inline def MappingShapeProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingShapeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("shape")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingShapeProperty]
  }
  
  inline def MappingShortNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingShortNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingShortNumberProperty]
  }
  
  inline def MappingTextProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTextProperty]
  }
  
  inline def MappingTokenCountProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTokenCountProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("token_count")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTokenCountProperty]
  }
  
  inline def MappingUnsignedLongNumberProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingUnsignedLongNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unsigned_long")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingUnsignedLongNumberProperty]
  }
  
  inline def MappingVersionProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingVersionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("version")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingVersionProperty]
  }
  
  inline def MappingWildcardProperty(): typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingWildcardProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wildcard")
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingWildcardProperty]
  }
}
