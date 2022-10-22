package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
  */
trait HorizontalPodAutoscalerStatus extends StObject {
  
  /**
    * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
    */
  var conditions: js.Array[HorizontalPodAutoscalerCondition]
  
  /**
    * currentMetrics is the last read state of the metrics used by this autoscaler.
    */
  var currentMetrics: js.Array[MetricStatus]
  
  /**
    * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
    */
  var currentReplicas: Double
  
  /**
    * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
    */
  var desiredReplicas: Double
  
  /**
    * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
    */
  var lastScaleTime: String
  
  /**
    * observedGeneration is the most recent generation observed by this autoscaler.
    */
  var observedGeneration: Double
}
object HorizontalPodAutoscalerStatus {
  
  inline def apply(
    conditions: js.Array[HorizontalPodAutoscalerCondition],
    currentMetrics: js.Array[MetricStatus],
    currentReplicas: Double,
    desiredReplicas: Double,
    lastScaleTime: String,
    observedGeneration: Double
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], currentMetrics = currentMetrics.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any], lastScaleTime = lastScaleTime.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
  
  extension [Self <: HorizontalPodAutoscalerStatus](x: Self) {
    
    inline def setConditions(value: js.Array[HorizontalPodAutoscalerCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: HorizontalPodAutoscalerCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setCurrentMetrics(value: js.Array[MetricStatus]): Self = StObject.set(x, "currentMetrics", value.asInstanceOf[js.Any])
    
    inline def setCurrentMetricsVarargs(value: MetricStatus*): Self = StObject.set(x, "currentMetrics", js.Array(value*))
    
    inline def setCurrentReplicas(value: Double): Self = StObject.set(x, "currentReplicas", value.asInstanceOf[js.Any])
    
    inline def setDesiredReplicas(value: Double): Self = StObject.set(x, "desiredReplicas", value.asInstanceOf[js.Any])
    
    inline def setLastScaleTime(value: String): Self = StObject.set(x, "lastScaleTime", value.asInstanceOf[js.Any])
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
  }
}
