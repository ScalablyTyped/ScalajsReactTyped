package typingsJapgolly.materialDashUi.__MaterialUI.List

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableProps extends js.Object {
  var onChange: js.UndefOr[
    js.Function2[/* e */ ReactEventFrom[js.Object with Element], /* value */ js.Any, Unit]
  ] = js.undefined
  var selectedItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SelectableProps {
  @scala.inline
  def apply(
    onChange: (/* e */ ReactEventFrom[js.Object with Element], /* value */ js.Any) => Callback = null,
    selectedItemStyle: CSSProperties = null,
    value: js.Any = null
  ): SelectableProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* value */ js.Any) => onChange(t0, t1).runNow()))
    if (selectedItemStyle != null) __obj.updateDynamic("selectedItemStyle")(selectedItemStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectableProps]
  }
}

