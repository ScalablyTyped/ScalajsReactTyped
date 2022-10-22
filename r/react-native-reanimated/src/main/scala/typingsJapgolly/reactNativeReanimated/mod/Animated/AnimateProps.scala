package typingsJapgolly.reactNativeReanimated.mod.Animated

import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNativeReanimated.anon.TypeofBaseAnimationBuildeDelay
import typingsJapgolly.reactNativeReanimated.mod.BaseAnimationBuilder
import typingsJapgolly.reactNativeReanimated.mod.EntryExitAnimationFunction
import typingsJapgolly.reactNativeReanimated.mod.Keyframe
import typingsJapgolly.reactNativeReanimated.mod.LayoutAnimationFunction
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateProps[P /* <: js.Object */] extends StObject {
  
  var animatedProps: js.UndefOr[Partial[AnimateProps[P]]] = js.native
  
  var entering: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.native
  
  var exiting: js.UndefOr[
    BaseAnimationBuilder | TypeofBaseAnimationBuildeDelay | EntryExitAnimationFunction | Keyframe
  ] = js.native
  
  var layout: js.UndefOr[BaseAnimationBuilder | LayoutAnimationFunction | TypeofBaseAnimationBuildeDelay] = js.native
  
  var style: js.UndefOr[StyleProp[AnimateStyle[StylesOrDefault[P]]]] = js.native
}
