package typingsJapgolly.reactColor.blockMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.reactColorStrings.hide
import typingsJapgolly.reactColor.reactColorStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPickerProps extends ColorPickerProps[BlockPicker] {
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  var triangle: js.UndefOr[hide | top] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object BlockPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    colors: js.Array[String] = null,
    key: Key = null,
    onChange: /* color */ ColorResult => Callback = null,
    onChangeComplete: /* color */ ColorResult => Callback = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Callback = null,
    ref: LegacyRef[BlockPicker] = null,
    triangle: hide | top = null,
    width: String = null
  ): BlockPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChange(t0).runNow()))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChangeComplete(t0).runNow()))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult, t1: /* event */ org.scalajs.dom.raw.MouseEvent) => onSwatchHover(t0, t1).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPickerProps]
  }
}

