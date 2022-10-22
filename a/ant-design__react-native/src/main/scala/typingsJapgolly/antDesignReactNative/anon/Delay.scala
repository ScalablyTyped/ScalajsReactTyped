package typingsJapgolly.antDesignReactNative.anon

import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.Animated.AnimatedValue
import typingsJapgolly.reactNative.mod.Animated.AnimatedValueXY
import typingsJapgolly.reactNative.mod.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[EasingFunction] = js.undefined
  
  var toValue: js.UndefOr[
    Double | AnimatedValue | X | AnimatedValueXY | (AnimatedInterpolation[Double | String])
  ] = js.undefined
  
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}
object Delay {
  
  inline def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  extension [Self <: Delay](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: /* value */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setToValue(value: Double | AnimatedValue | X | AnimatedValueXY | (AnimatedInterpolation[Double | String])): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
  }
}
