package typingsJapgolly.reactNativeReanimated.libTypesIndexDotwebMod

import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.EntryExitAnimationFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.LayoutAnimationFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated/lib/types/index.web", "BaseAnimationBuilder")
@js.native
open class BaseAnimationBuilder ()
  extends typingsJapgolly.reactNativeReanimated.libTypesReanimated2Mod.BaseAnimationBuilder
/* static members */
object BaseAnimationBuilder {
  
  @JSImport("react-native-reanimated/lib/types/index.web", "BaseAnimationBuilder")
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
