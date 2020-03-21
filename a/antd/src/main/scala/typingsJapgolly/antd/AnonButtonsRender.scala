package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.antdStrings.bottomCenter
import typingsJapgolly.antd.antdStrings.bottomLeft
import typingsJapgolly.antd.antdStrings.bottomRight
import typingsJapgolly.antd.antdStrings.topCenter
import typingsJapgolly.antd.antdStrings.topLeft
import typingsJapgolly.antd.antdStrings.topRight
import typingsJapgolly.antd.dropdownButtonMod.DropdownButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonsRender extends js.Object {
  var placement: js.UndefOr[bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter] = js.undefined
  var `type`: DropdownButtonType
  def buttonsRender(buttons: js.Array[Node]): js.Array[Node]
}

object AnonButtonsRender {
  @scala.inline
  def apply(
    buttonsRender: js.Array[Node] => CallbackTo[js.Array[Node]],
    `type`: DropdownButtonType,
    placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = null
  ): AnonButtonsRender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonsRender")(js.Any.fromFunction1((t0: js.Array[japgolly.scalajs.react.raw.React.Node]) => buttonsRender(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonsRender]
  }
}

