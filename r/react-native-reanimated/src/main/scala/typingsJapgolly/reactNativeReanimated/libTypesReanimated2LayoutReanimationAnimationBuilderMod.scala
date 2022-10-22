package typingsJapgolly.reactNativeReanimated

import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.StyleProps
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2EasingMod.EasingFn
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.EntryExitAnimationFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.KeyframeProps
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.LayoutAnimationFunction
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2LayoutReanimationAnimationBuilderMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "BaseAnimationBuilder")
  @js.native
  open class BaseAnimationBuilder ()
    extends typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder
  /* static members */
  object BaseAnimationBuilder {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "BaseAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(): EntryExitAnimationFunction | LayoutAnimationFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[EntryExitAnimationFunction | LayoutAnimationFunction]
    
    inline def createInstance(): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def delay(delayMs: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayMs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def duration(durationMs: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(durationMs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def getDuration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")().asInstanceOf[Double]
    
    inline def randomDelay(): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("randomDelay")().asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
    
    inline def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "ComplexAnimationBuilder")
  @js.native
  open class ComplexAnimationBuilder ()
    extends typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder
  /* static members */
  object ComplexAnimationBuilder {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "ComplexAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def damping(damping: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("damping")(damping.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def easing(easingFunction: EasingFn): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("easing")(easingFunction.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def mass(mass: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("mass")(mass.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def overshootClamping(overshootClamping: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("overshootClamping")(overshootClamping.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def restDisplacementThreshold(restDisplacementThreshold: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restDisplacementThreshold")(restDisplacementThreshold.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def restSpeedThreshold(restSpeedThreshold: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("restSpeedThreshold")(restSpeedThreshold.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def rotate(degree: String): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(degree.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def springify(): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("springify")().asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def stiffness(stiffness: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("stiffness")(stiffness.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderComplexAnimationBuilderMod.ComplexAnimationBuilder]
    
    inline def withInitialValues(values: StyleProps): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withInitialValues")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/animationBuilder", "Keyframe")
  @js.native
  open class Keyframe protected ()
    extends typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderKeyframeMod.Keyframe {
    def this(definitions: Record[String, KeyframeProps]) = this()
  }
}
