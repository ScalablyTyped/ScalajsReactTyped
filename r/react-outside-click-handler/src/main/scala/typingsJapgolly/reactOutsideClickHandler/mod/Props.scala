package typingsJapgolly.reactOutsideClickHandler.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-outside-click-handler.react-outside-click-handler.DefaultProps> */
trait Props extends js.Object {
  var children: Node
  var disabled: js.UndefOr[Boolean] = js.undefined
  var display: js.UndefOr[block | flex | `inline` | `inline-block` | contents] = js.undefined
  var useCapture: js.UndefOr[Boolean] = js.undefined
  def onOutsideClick(e: ReactMouseEventFrom[HTMLElement]): Unit
}

object Props {
  @scala.inline
  def apply(
    onOutsideClick: ReactMouseEventFrom[HTMLElement] => Callback,
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: block | flex | `inline` | `inline-block` | contents = null,
    useCapture: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onOutsideClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onOutsideClick(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

