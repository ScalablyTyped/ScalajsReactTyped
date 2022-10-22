package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.aggregate_metric_double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingAggregateMetricDoubleProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var default_metric: String
  
  var metrics: js.Array[String]
  
  var `type`: aggregate_metric_double
}
object MappingAggregateMetricDoubleProperty {
  
  inline def apply(default_metric: String, metrics: js.Array[String]): MappingAggregateMetricDoubleProperty = {
    val __obj = js.Dynamic.literal(default_metric = default_metric.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aggregate_metric_double")
    __obj.asInstanceOf[MappingAggregateMetricDoubleProperty]
  }
  
  extension [Self <: MappingAggregateMetricDoubleProperty](x: Self) {
    
    inline def setDefault_metric(value: String): Self = StObject.set(x, "default_metric", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setType(value: aggregate_metric_double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
