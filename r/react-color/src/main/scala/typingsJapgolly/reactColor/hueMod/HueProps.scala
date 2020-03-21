package typingsJapgolly.reactColor.hueMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactColor.mod.Color
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.mod.CustomPickerProps
import typingsJapgolly.reactColor.reactColorStrings.horizontal
import typingsJapgolly.reactColor.reactColorStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HueProps extends CustomPickerProps[Hue] {
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
}

object HueProps {
  @scala.inline
  def apply(
    onChange: /* color */ ColorResult => Callback,
    color: Color = null,
    direction: horizontal | vertical = null,
    key: Key = null,
    pointer: VdomNode = null,
    ref: LegacyRef[Hue] = null
  ): HueProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChange(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.rawNode.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HueProps]
  }
}

