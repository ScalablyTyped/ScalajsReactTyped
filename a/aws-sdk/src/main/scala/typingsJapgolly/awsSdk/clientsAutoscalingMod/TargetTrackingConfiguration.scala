package typingsJapgolly.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTrackingConfiguration extends StObject {
  
  /**
    * A customized metric. You must specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingMod.CustomizedMetricSpecification] = js.undefined
  
  /**
    * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances from the Auto Scaling group. The default is false.
    */
  var DisableScaleIn: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingMod.DisableScaleIn] = js.undefined
  
  /**
    * A predefined metric. You must specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingMod.PredefinedMetricSpecification] = js.undefined
  
  /**
    * The target value for the metric.  Some metrics are based on a count instead of a percentage, such as the request count for an Application Load Balancer or the number of messages in an SQS queue. If the scaling policy specifies one of these metrics, specify the target utilization as the optimal average request or message count per instance during any one-minute interval.  
    */
  var TargetValue: MetricScale
}
object TargetTrackingConfiguration {
  
  inline def apply(TargetValue: MetricScale): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
  
  extension [Self <: TargetTrackingConfiguration](x: Self) {
    
    inline def setCustomizedMetricSpecification(value: CustomizedMetricSpecification): Self = StObject.set(x, "CustomizedMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomizedMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedMetricSpecification", js.undefined)
    
    inline def setDisableScaleIn(value: DisableScaleIn): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
    
    inline def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
    
    inline def setPredefinedMetricSpecification(value: PredefinedMetricSpecification): Self = StObject.set(x, "PredefinedMetricSpecification", value.asInstanceOf[js.Any])
    
    inline def setPredefinedMetricSpecificationUndefined: Self = StObject.set(x, "PredefinedMetricSpecification", js.undefined)
    
    inline def setTargetValue(value: MetricScale): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
