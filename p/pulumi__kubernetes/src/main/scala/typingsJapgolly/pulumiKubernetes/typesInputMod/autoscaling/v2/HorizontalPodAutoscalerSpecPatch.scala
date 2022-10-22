package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
  */
trait HorizontalPodAutoscalerSpecPatch extends StObject {
  
  /**
    * behavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively). If not set, the default HPAScalingRules for scale up and scale down are used.
    */
  var behavior: js.UndefOr[Input[HorizontalPodAutoscalerBehaviorPatch]] = js.undefined
  
  /**
    * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
    */
  var maxReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
    */
  var metrics: js.UndefOr[Input[js.Array[Input[MetricSpecPatch]]]] = js.undefined
  
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
    */
  var minReplicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
    */
  var scaleTargetRef: js.UndefOr[Input[CrossVersionObjectReferencePatch]] = js.undefined
}
object HorizontalPodAutoscalerSpecPatch {
  
  inline def apply(): HorizontalPodAutoscalerSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalPodAutoscalerSpecPatch]
  }
  
  extension [Self <: HorizontalPodAutoscalerSpecPatch](x: Self) {
    
    inline def setBehavior(value: Input[HorizontalPodAutoscalerBehaviorPatch]): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setMaxReplicas(value: Input[Double]): Self = StObject.set(x, "maxReplicas", value.asInstanceOf[js.Any])
    
    inline def setMaxReplicasUndefined: Self = StObject.set(x, "maxReplicas", js.undefined)
    
    inline def setMetrics(value: Input[js.Array[Input[MetricSpecPatch]]]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Input[MetricSpecPatch]*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setMinReplicas(value: Input[Double]): Self = StObject.set(x, "minReplicas", value.asInstanceOf[js.Any])
    
    inline def setMinReplicasUndefined: Self = StObject.set(x, "minReplicas", js.undefined)
    
    inline def setScaleTargetRef(value: Input[CrossVersionObjectReferencePatch]): Self = StObject.set(x, "scaleTargetRef", value.asInstanceOf[js.Any])
    
    inline def setScaleTargetRefUndefined: Self = StObject.set(x, "scaleTargetRef", js.undefined)
  }
}
