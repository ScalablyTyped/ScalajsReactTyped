package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
  */
trait ExternalMetricStatus extends StObject {
  
  /**
    * currentAverageValue is the current value of metric averaged over autoscaled pods.
    */
  var currentAverageValue: String
  
  /**
    * currentValue is the current value of the metric (as a quantity)
    */
  var currentValue: String
  
  /**
    * metricName is the name of a metric used for autoscaling in metric system.
    */
  var metricName: String
  
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: LabelSelector
}
object ExternalMetricStatus {
  
  inline def apply(
    currentAverageValue: String,
    currentValue: String,
    metricName: String,
    metricSelector: LabelSelector
  ): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], metricSelector = metricSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatus]
  }
  
  extension [Self <: ExternalMetricStatus](x: Self) {
    
    inline def setCurrentAverageValue(value: String): Self = StObject.set(x, "currentAverageValue", value.asInstanceOf[js.Any])
    
    inline def setCurrentValue(value: String): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricSelector(value: LabelSelector): Self = StObject.set(x, "metricSelector", value.asInstanceOf[js.Any])
  }
}
