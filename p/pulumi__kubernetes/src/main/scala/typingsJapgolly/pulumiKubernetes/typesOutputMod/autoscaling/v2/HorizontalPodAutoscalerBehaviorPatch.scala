package typingsJapgolly.pulumiKubernetes.typesOutputMod.autoscaling.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
  */
trait HorizontalPodAutoscalerBehaviorPatch extends StObject {
  
  /**
    * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
    */
  var scaleDown: HPAScalingRulesPatch
  
  /**
    * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
    *   * increase no more than 4 pods per 60 seconds
    *   * double the number of pods per 60 seconds
    * No stabilization is used.
    */
  var scaleUp: HPAScalingRulesPatch
}
object HorizontalPodAutoscalerBehaviorPatch {
  
  inline def apply(scaleDown: HPAScalingRulesPatch, scaleUp: HPAScalingRulesPatch): HorizontalPodAutoscalerBehaviorPatch = {
    val __obj = js.Dynamic.literal(scaleDown = scaleDown.asInstanceOf[js.Any], scaleUp = scaleUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerBehaviorPatch]
  }
  
  extension [Self <: HorizontalPodAutoscalerBehaviorPatch](x: Self) {
    
    inline def setScaleDown(value: HPAScalingRulesPatch): Self = StObject.set(x, "scaleDown", value.asInstanceOf[js.Any])
    
    inline def setScaleUp(value: HPAScalingRulesPatch): Self = StObject.set(x, "scaleUp", value.asInstanceOf[js.Any])
  }
}
