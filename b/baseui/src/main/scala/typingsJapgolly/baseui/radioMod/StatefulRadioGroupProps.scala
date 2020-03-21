package typingsJapgolly.baseui.radioMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.react.mod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulRadioGroupProps extends js.Object {
  var align: js.UndefOr[horizontal | vertical] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
}

object StatefulRadioGroupProps {
  @scala.inline
  def apply(
    align: horizontal | vertical = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    initialState: State = null,
    name: String = null,
    onChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    overrides: RadioOverrides with RadioGroupOverrides = null
  ): StatefulRadioGroupProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulRadioGroupProps]
  }
}

