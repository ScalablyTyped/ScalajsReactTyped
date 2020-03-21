package typingsJapgolly.reactColor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPickerProps[A] extends ClassAttributes[A] {
  var color: js.UndefOr[Color] = js.undefined
  var onChange: ColorChangeHandler
  var pointer: js.UndefOr[Node] = js.undefined
}

object CustomPickerProps {
  @scala.inline
  def apply[A](
    onChange: /* color */ ColorResult => Callback,
    color: Color = null,
    key: Key = null,
    pointer: VdomNode = null,
    ref: LegacyRef[A] = null
  ): CustomPickerProps[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* color */ typingsJapgolly.reactColor.mod.ColorResult) => onChange(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.rawNode.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPickerProps[A]]
  }
}

