package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.reactColorStrings.`top-left`
import typingsJapgolly.reactColor.reactColorStrings.`top-right`
import typingsJapgolly.reactColor.reactColorStrings.hide
import typingsJapgolly.reactColor.twitterMod.TwitterPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TwitterPickerProps_338032902[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    color: Color = null,
    colors: js.Array[String] = null,
    onChange: /* color */ ColorResult => Callback = null,
    onChangeComplete: /* color */ ColorResult => Callback = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Callback = null,
    triangle: hide | `top-left` | `top-right` = null,
    width: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TwitterPickerProps, ComponentRef, Unit, TwitterPickerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChange(t0).runNow()))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChangeComplete(t0).runNow()))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult, t1: /* event */ org.scalajs.dom.raw.MouseEvent) => onSwatchHover(t0, t1).runNow()))
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactColor.twitterMod.TwitterPickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactColor.twitterMod.TwitterPickerProps])(children: _*)
  }
}

