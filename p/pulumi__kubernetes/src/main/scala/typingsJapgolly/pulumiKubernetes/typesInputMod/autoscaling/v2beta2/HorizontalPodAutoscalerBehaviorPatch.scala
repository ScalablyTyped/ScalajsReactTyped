package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var scaleDown: js.UndefOr[Input[HPAScalingRulesPatch]] = js.undefined
  
  /**
    * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
    *   * increase no more than 4 pods per 60 seconds
    *   * double the number of pods per 60 seconds
    * No stabilization is used.
    */
  var scaleUp: js.UndefOr[Input[HPAScalingRulesPatch]] = js.undefined
}
object HorizontalPodAutoscalerBehaviorPatch {
  
  inline def apply(): HorizontalPodAutoscalerBehaviorPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalPodAutoscalerBehaviorPatch]
  }
  
  extension [Self <: HorizontalPodAutoscalerBehaviorPatch](x: Self) {
    
    inline def setScaleDown(value: Input[HPAScalingRulesPatch]): Self = StObject.set(x, "scaleDown", value.asInstanceOf[js.Any])
    
    inline def setScaleDownUndefined: Self = StObject.set(x, "scaleDown", js.undefined)
    
    inline def setScaleUp(value: Input[HPAScalingRulesPatch]): Self = StObject.set(x, "scaleUp", value.asInstanceOf[js.Any])
    
    inline def setScaleUpUndefined: Self = StObject.set(x, "scaleUp", js.undefined)
  }
}
