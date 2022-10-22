package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricTarget defines the target value, average value, or average utilization of a specific metric
  */
trait MetricTargetPatch extends StObject {
  
  /**
    * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * type represents whether the metric type is Utilization, Value, or AverageValue
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * value is the target value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}
object MetricTargetPatch {
  
  inline def apply(): MetricTargetPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTargetPatch]
  }
  
  extension [Self <: MetricTargetPatch](x: Self) {
    
    inline def setAverageUtilization(value: Input[Double]): Self = StObject.set(x, "averageUtilization", value.asInstanceOf[js.Any])
    
    inline def setAverageUtilizationUndefined: Self = StObject.set(x, "averageUtilization", js.undefined)
    
    inline def setAverageValue(value: Input[String]): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    inline def setAverageValueUndefined: Self = StObject.set(x, "averageValue", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
