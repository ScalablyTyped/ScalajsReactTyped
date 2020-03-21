package typingsJapgolly.reactColor.colorWrapMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorChangeHandler
import typingsJapgolly.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportedColorProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
  var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.undefined
}

object ExportedColorProps {
  @scala.inline
  def apply(
    color: Color = null,
    onChange: /* color */ ColorResult => Callback = null,
    onChangeComplete: /* color */ ColorResult => Callback = null
  ): ExportedColorProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChange(t0).runNow()))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChangeComplete(t0).runNow()))
    __obj.asInstanceOf[ExportedColorProps]
  }
}

