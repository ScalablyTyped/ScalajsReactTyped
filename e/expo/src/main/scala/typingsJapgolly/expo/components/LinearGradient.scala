package typingsJapgolly.expo.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoLinearGradient.linearGradientMod.Point
import typingsJapgolly.expoLinearGradient.linearGradientMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinearGradient {
  def apply(
    colors: js.Array[String],
    end: Point = null,
    locations: js.Array[Double] = null,
    start: Point = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, typingsJapgolly.expo.globalsWebMod.LinearGradient, Unit, Props] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
  
      if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.expoLinearGradient.linearGradientMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.expo.globalsWebMod.LinearGradient](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.expoLinearGradient.linearGradientMod.Props])(children: _*)
  }
  @JSImport("expo/build/globals.web", "LinearGradient")
  @js.native
  object componentImport extends js.Object
  
}

