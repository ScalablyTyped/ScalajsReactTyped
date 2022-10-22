package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationCallback
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationSpringMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/spring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withSpring(toValue: AnimatableValue): Animation[SpringAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any]).asInstanceOf[Animation[SpringAnimation]]
  inline def withSpring(toValue: AnimatableValue, userConfig: Unit, callback: AnimationCallback): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]
  inline def withSpring(toValue: AnimatableValue, userConfig: SpringConfig): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]
  inline def withSpring(toValue: AnimatableValue, userConfig: SpringConfig, callback: AnimationCallback): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]
  
  /* Inlined parent std.Omit<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/spring.SpringAnimation, 'toValue' | 'current'> */
  trait InnerSpringAnimation extends StObject {
    
    var __prefix: js.UndefOr[String] = js.undefined
    
    var __suffix: js.UndefOr[String] = js.undefined
    
    var callback: AnimationCallback
    
    var cancelled: js.UndefOr[Boolean] = js.undefined
    
    var current: Double
    
    var finished: js.UndefOr[Boolean] = js.undefined
    
    var lastTimestamp: Timestamp
    
    var onFrame: js.Function2[/* animation */ SpringAnimation, /* timestamp */ Timestamp, Boolean]
    
    var onStart: js.Function4[
        /* nextAnimation */ SpringAnimation, 
        /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/spring.SpringAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, 
        /* timestamp */ Timestamp, 
        /* previousAnimation */ SpringAnimation, 
        Unit
      ]
    
    var startValue: js.UndefOr[AnimatableValue] = js.undefined
    
    var strippedCurrent: js.UndefOr[Double] = js.undefined
    
    var toValue: Double
    
    var velocity: Double
  }
  object InnerSpringAnimation {
    
    inline def apply(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Callback,
      current: Double,
      lastTimestamp: Timestamp,
      onFrame: (/* animation */ SpringAnimation, /* timestamp */ Timestamp) => Boolean,
      onStart: (/* nextAnimation */ SpringAnimation, /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/spring.SpringAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, /* timestamp */ Timestamp, /* previousAnimation */ SpringAnimation) => Callback,
      toValue: Double,
      velocity: Double
    ): InnerSpringAnimation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: /* finished */ js.UndefOr[Boolean], t1: /* current */ js.UndefOr[AnimatableValue]) => (callback(t0, t1)).runNow()), current = current.asInstanceOf[js.Any], lastTimestamp = lastTimestamp.asInstanceOf[js.Any], onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4((t0: /* nextAnimation */ SpringAnimation, t1: /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/spring.SpringAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, t2: /* timestamp */ Timestamp, t3: /* previousAnimation */ SpringAnimation) => (onStart(t0, t1, t2, t3)).runNow()), toValue = toValue.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerSpringAnimation]
    }
    
    extension [Self <: InnerSpringAnimation](x: Self) {
      
      inline def setCallback(value: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* finished */ js.UndefOr[Boolean], t1: /* current */ js.UndefOr[AnimatableValue]) => (value(t0, t1)).runNow()))
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
      
      inline def setLastTimestamp(value: Timestamp): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
      
      inline def setOnFrame(value: (/* animation */ SpringAnimation, /* timestamp */ Timestamp) => Boolean): Self = StObject.set(x, "onFrame", js.Any.fromFunction2(value))
      
      inline def setOnStart(
        value: (/* nextAnimation */ SpringAnimation, /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/spring.SpringAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, /* timestamp */ Timestamp, /* previousAnimation */ SpringAnimation) => Callback
      ): Self = StObject.set(x, "onStart", js.Any.fromFunction4((t0: /* nextAnimation */ SpringAnimation, t1: /* import warning: importer.ImportType#apply Failed type conversion: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/spring.SpringAnimation extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ /* current */ js.Any, t2: /* timestamp */ Timestamp, t3: /* previousAnimation */ SpringAnimation) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setStartValue(value: AnimatableValue): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      inline def setStartValueVarargs(value: Double*): Self = StObject.set(x, "startValue", js.Array(value*))
      
      inline def setStrippedCurrent(value: Double): Self = StObject.set(x, "strippedCurrent", value.asInstanceOf[js.Any])
      
      inline def setStrippedCurrentUndefined: Self = StObject.set(x, "strippedCurrent", js.undefined)
      
      inline def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def set__prefix(value: String): Self = StObject.set(x, "__prefix", value.asInstanceOf[js.Any])
      
      inline def set__prefixUndefined: Self = StObject.set(x, "__prefix", js.undefined)
      
      inline def set__suffix(value: String): Self = StObject.set(x, "__suffix", value.asInstanceOf[js.Any])
      
      inline def set__suffixUndefined: Self = StObject.set(x, "__suffix", js.undefined)
    }
  }
  
  trait SpringAnimation
    extends StObject
       with Animation[SpringAnimation] {
    
    @JSName("current")
    var current_SpringAnimation: AnimatableValue
    
    var lastTimestamp: Timestamp
    
    @JSName("toValue")
    var toValue_SpringAnimation: AnimatableValue
    
    var velocity: Double
  }
  object SpringAnimation {
    
    inline def apply(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Callback,
      current: AnimatableValue,
      lastTimestamp: Timestamp,
      onFrame: (Any, Timestamp) => Boolean,
      onStart: (SpringAnimation, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, SpringAnimation) => Callback,
      toValue: AnimatableValue,
      velocity: Double
    ): SpringAnimation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: /* finished */ js.UndefOr[Boolean], t1: /* current */ js.UndefOr[AnimatableValue]) => (callback(t0, t1)).runNow()), current = current.asInstanceOf[js.Any], lastTimestamp = lastTimestamp.asInstanceOf[js.Any], onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4((t0: SpringAnimation, t1: /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, t2: Timestamp, t3: SpringAnimation) => (onStart(t0, t1, t2, t3)).runNow()), toValue = toValue.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpringAnimation]
    }
    
    extension [Self <: SpringAnimation](x: Self) {
      
      inline def setCurrent(value: AnimatableValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentVarargs(value: Double*): Self = StObject.set(x, "current", js.Array(value*))
      
      inline def setLastTimestamp(value: Timestamp): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
      
      inline def setToValue(value: AnimatableValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setToValueVarargs(value: Double*): Self = StObject.set(x, "toValue", js.Array(value*))
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpringConfig extends StObject {
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var mass: js.UndefOr[Double] = js.undefined
    
    var overshootClamping: js.UndefOr[Boolean] = js.undefined
    
    var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
    
    var restSpeedThreshold: js.UndefOr[Double] = js.undefined
    
    var stiffness: js.UndefOr[Double] = js.undefined
    
    var velocity: js.UndefOr[Double] = js.undefined
  }
  object SpringConfig {
    
    inline def apply(): SpringConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringConfig]
    }
    
    extension [Self <: SpringConfig](x: Self) {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      inline def setOvershootClamping(value: Boolean): Self = StObject.set(x, "overshootClamping", value.asInstanceOf[js.Any])
      
      inline def setOvershootClampingUndefined: Self = StObject.set(x, "overshootClamping", js.undefined)
      
      inline def setRestDisplacementThreshold(value: Double): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
      
      inline def setRestDisplacementThresholdUndefined: Self = StObject.set(x, "restDisplacementThreshold", js.undefined)
      
      inline def setRestSpeedThreshold(value: Double): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
      
      inline def setRestSpeedThresholdUndefined: Self = StObject.set(x, "restSpeedThreshold", js.undefined)
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
}
