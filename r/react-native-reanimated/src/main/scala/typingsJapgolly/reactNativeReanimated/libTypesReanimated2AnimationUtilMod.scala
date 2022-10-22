package typingsJapgolly.reactNativeReanimated

import typingsJapgolly.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.NextAnimation
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.StyleLayoutAnimation
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2AnimationUtilMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/animation/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancelAnimation[T](sharedValue: SharedValue[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimation")(sharedValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def defineAnimation[T /* <: AnimationObject | StyleLayoutAnimation */](starting: AnimationToDecoration[T], factory: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAnimation")(starting.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def initialUpdaterRun[T](updater: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("initialUpdaterRun")(updater.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def withStartValue(startValue: AnimatableValue, animation: NextAnimation[AnimationObject]): Animation[AnimationObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStartValue")(startValue.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Animation[AnimationObject]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.StyleLayoutAnimation ? std.Record<string, unknown> : T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.DelayAnimation ? react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.NextAnimation<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.DelayAnimation> : T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.RepeatAnimation ? react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.NextAnimation<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.RepeatAnimation> : T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.SequenceAnimation ? react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.NextAnimation<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/animation/commonTypes.SequenceAnimation> : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue | T
    }}}
    */
  @js.native
  trait AnimationToDecoration[T /* <: AnimationObject | StyleLayoutAnimation */] extends StObject
  
  type UserUpdater = js.Function0[AnimatedStyle]
}
