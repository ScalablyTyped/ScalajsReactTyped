package typingsJapgolly.expoLinearGradient.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoLinearGradient.nativeLinearGradientAndroidMod.Point
import typingsJapgolly.expoLinearGradient.nativeLinearGradientAndroidMod.Props
import typingsJapgolly.expoLinearGradient.nativeLinearGradientAndroidMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeLinearGradientDotandroid {
  def apply(
    colors: js.Array[Double],
    endPoint: Point = null,
    locations: js.Array[Double] = null,
    startPoint: Point = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
  
      if (endPoint != null) __obj.updateDynamic("endPoint")(endPoint.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (startPoint != null) __obj.updateDynamic("startPoint")(startPoint.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expoLinearGradient.nativeLinearGradientAndroidMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expoLinearGradient.nativeLinearGradientAndroidMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expoLinearGradient.nativeLinearGradientAndroidMod.Props])(children: _*)
  }
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.android", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

