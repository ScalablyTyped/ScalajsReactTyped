package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
  */
trait HPAScalingPolicyPatch extends StObject {
  
  /**
    * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
    */
  var periodSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Type is used to specify the scaling policy.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Value contains the amount of change which is permitted by the policy. It must be greater than zero
    */
  var value: js.UndefOr[Input[Double]] = js.undefined
}
object HPAScalingPolicyPatch {
  
  inline def apply(): HPAScalingPolicyPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPAScalingPolicyPatch]
  }
  
  extension [Self <: HPAScalingPolicyPatch](x: Self) {
    
    inline def setPeriodSeconds(value: Input[Double]): Self = StObject.set(x, "periodSeconds", value.asInstanceOf[js.Any])
    
    inline def setPeriodSecondsUndefined: Self = StObject.set(x, "periodSeconds", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
