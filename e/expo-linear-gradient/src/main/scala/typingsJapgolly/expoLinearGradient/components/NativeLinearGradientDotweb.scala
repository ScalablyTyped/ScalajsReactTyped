package typingsJapgolly.expoLinearGradient.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoLinearGradient.nativeLinearGradientWebMod.Point
import typingsJapgolly.expoLinearGradient.nativeLinearGradientWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeLinearGradientDotweb {
  def apply(
    colors: js.Array[Double],
    endPoint: Point = null,
    locations: js.Array[Double] = null,
    onLayout: js.Function = null,
    startPoint: Point = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[Props, MountedWithRawType[Props, js.Object, RawMounted[Props, js.Object]]] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
  
      if (endPoint != null) __obj.updateDynamic("endPoint")(endPoint.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (startPoint != null) __obj.updateDynamic("startPoint")(startPoint.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.expoLinearGradient.nativeLinearGradientWebMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expoLinearGradient.nativeLinearGradientWebMod.Props])(children: _*)
  }
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.web", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

