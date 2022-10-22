package typingsJapgolly.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-native.react-native.Animated.SpringAnimationConfig & react-native.react-native.Animated.TimingAnimationConfig, 'toValue'> */
trait OmitSpringAnimationConfig extends StObject {
  
  var bounciness: js.UndefOr[Double] = js.undefined
  
  var damping: js.UndefOr[Double] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  
  var friction: js.UndefOr[Double] = js.undefined
  
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var overshootClamping: js.UndefOr[Boolean] = js.undefined
  
  var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
  
  var restSpeedThreshold: js.UndefOr[Double] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
  
  var tension: js.UndefOr[Double] = js.undefined
  
  var useNativeDriver: Boolean
  
  var velocity: js.UndefOr[Double | typingsJapgolly.reactNative.anon.X] = js.undefined
}
object OmitSpringAnimationConfig {
  
  inline def apply(useNativeDriver: Boolean): OmitSpringAnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSpringAnimationConfig]
  }
  
  extension [Self <: OmitSpringAnimationConfig](x: Self) {
    
    inline def setBounciness(value: Double): Self = StObject.set(x, "bounciness", value.asInstanceOf[js.Any])
    
    inline def setBouncinessUndefined: Self = StObject.set(x, "bounciness", js.undefined)
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: /* value */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
    
    inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setOvershootClamping(value: Boolean): Self = StObject.set(x, "overshootClamping", value.asInstanceOf[js.Any])
    
    inline def setOvershootClampingUndefined: Self = StObject.set(x, "overshootClamping", js.undefined)
    
    inline def setRestDisplacementThreshold(value: Double): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestDisplacementThresholdUndefined: Self = StObject.set(x, "restDisplacementThreshold", js.undefined)
    
    inline def setRestSpeedThreshold(value: Double): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestSpeedThresholdUndefined: Self = StObject.set(x, "restSpeedThreshold", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double | typingsJapgolly.reactNative.anon.X): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
