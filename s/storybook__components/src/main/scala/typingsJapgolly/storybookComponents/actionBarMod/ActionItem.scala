package typingsJapgolly.storybookComponents.actionBarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionItem extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var title: String | Element = js.native
  def onClick(e: ReactMouseEventFrom[HTMLButtonElement]): Unit = js.native
}

object ActionItem {
  @scala.inline
  def apply(
    onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback,
    title: String | Element,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): ActionItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClick(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionItem]
  }
}

