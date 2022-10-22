package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
  */
trait PodsMetricStatus extends StObject {
  
  /**
    * currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var currentAverageValue: Input[String]
  
  /**
    * metricName is the name of the metric in question
    */
  var metricName: Input[String]
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
}
object PodsMetricStatus {
  
  inline def apply(currentAverageValue: Input[String], metricName: Input[String]): PodsMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricStatus]
  }
  
  extension [Self <: PodsMetricStatus](x: Self) {
    
    inline def setCurrentAverageValue(value: Input[String]): Self = StObject.set(x, "currentAverageValue", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
