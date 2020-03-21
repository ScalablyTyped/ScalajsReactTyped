package typingsJapgolly.expoLinearGradient.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoLinearGradient.nativeLinearGradientIosMod.Point
import typingsJapgolly.expoLinearGradient.nativeLinearGradientIosMod.Props
import typingsJapgolly.expoLinearGradient.nativeLinearGradientIosMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeLinearGradientDotios {
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
  typingsJapgolly.expoLinearGradient.nativeLinearGradientIosMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expoLinearGradient.nativeLinearGradientIosMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expoLinearGradient.nativeLinearGradientIosMod.Props])(children: _*)
  }
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

