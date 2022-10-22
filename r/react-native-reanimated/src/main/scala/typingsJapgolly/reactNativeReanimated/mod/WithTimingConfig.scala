package typingsJapgolly.reactNativeReanimated.mod

import typingsJapgolly.reactNative.mod.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithTimingConfig extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[EasingFunction | EasingFunctionFactory] = js.undefined
}
object WithTimingConfig {
  
  inline def apply(): WithTimingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithTimingConfig]
  }
  
  extension [Self <: WithTimingConfig](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: EasingFunction | EasingFunctionFactory): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction1(value: /* value */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
