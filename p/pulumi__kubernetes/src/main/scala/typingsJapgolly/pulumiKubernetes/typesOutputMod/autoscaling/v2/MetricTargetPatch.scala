package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2

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
  var averageUtilization: Double
  
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: String
  
  /**
    * type represents whether the metric type is Utilization, Value, or AverageValue
    */
  var `type`: String
  
  /**
    * value is the target value of the metric (as a quantity).
    */
  var value: String
}
object MetricTargetPatch {
  
  inline def apply(averageUtilization: Double, averageValue: String, `type`: String, value: String): MetricTargetPatch = {
    val __obj = js.Dynamic.literal(averageUtilization = averageUtilization.asInstanceOf[js.Any], averageValue = averageValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTargetPatch]
  }
  
  extension [Self <: MetricTargetPatch](x: Self) {
    
    inline def setAverageUtilization(value: Double): Self = StObject.set(x, "averageUtilization", value.asInstanceOf[js.Any])
    
    inline def setAverageValue(value: String): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
