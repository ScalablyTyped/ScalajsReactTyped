package typingsJapgolly.minappEnv.wx

import typingsJapgolly.minappEnv.minappEnvStrings.`ease-in-out`
import typingsJapgolly.minappEnv.minappEnvStrings.`ease-in`
import typingsJapgolly.minappEnv.minappEnvStrings.`ease-out`
import typingsJapgolly.minappEnv.minappEnvStrings.`step-end`
import typingsJapgolly.minappEnv.minappEnvStrings.`step-start`
import typingsJapgolly.minappEnv.minappEnvStrings.ease
import typingsJapgolly.minappEnv.minappEnvStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOption extends StObject {
  
  /** 动画延迟时间，单位 ms */
  var delay: js.UndefOr[Double] = js.undefined
  
  /** 动画持续时间，单位 ms */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 动画的效果
    *
    * 可选值：
    * - 'linear': 动画从头到尾的速度是相同的;
    * - 'ease': 动画以低速开始，然后加快，在结束前变慢;
    * - 'ease-in': 动画以低速开始;
    * - 'ease-in-out': 动画以低速开始和结束;
    * - 'ease-out': 动画以低速结束;
    * - 'step-start': 动画第一帧就跳至结束状态直到结束;
    * - 'step-end': 动画一直保持开始状态，最后一帧跳到结束状态; */
  var timingFunction: js.UndefOr[
    linear | ease | `ease-in` | `ease-in-out` | `ease-out` | `step-start` | `step-end`
  ] = js.undefined
  
  var transformOrigin: js.UndefOr[String] = js.undefined
}
object StepOption {
  
  inline def apply(): StepOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOption]
  }
  
  extension [Self <: StepOption](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimingFunction(value: linear | ease | `ease-in` | `ease-in-out` | `ease-out` | `step-start` | `step-end`): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    
    inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
  }
}
