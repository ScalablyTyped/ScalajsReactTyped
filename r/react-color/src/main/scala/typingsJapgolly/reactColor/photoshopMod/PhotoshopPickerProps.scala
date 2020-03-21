package typingsJapgolly.reactColor.photoshopMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorChangeHandler
import typingsJapgolly.reactColor.mod.ColorPickerProps
import typingsJapgolly.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoshopPickerProps extends ColorPickerProps[PhotoshopPicker] {
  var header: js.UndefOr[String] = js.undefined
  var onAccept: js.UndefOr[ColorChangeHandler] = js.undefined
  var onCancel: js.UndefOr[ColorChangeHandler] = js.undefined
}

object PhotoshopPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    header: String = null,
    key: Key = null,
    onAccept: /* color */ ColorResult => Callback = null,
    onCancel: /* color */ ColorResult => Callback = null,
    onChange: /* color */ ColorResult => Callback = null,
    onChangeComplete: /* color */ ColorResult => Callback = null,
    ref: LegacyRef[PhotoshopPicker] = null
  ): PhotoshopPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onAccept(t0).runNow()))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onCancel(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChange(t0).runNow()))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChangeComplete(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopPickerProps]
  }
}

