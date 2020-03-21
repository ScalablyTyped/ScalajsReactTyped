package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGoButton extends js.Object {
  var goButton: js.UndefOr[Node] = js.undefined
}

object AnonGoButton {
  @scala.inline
  def apply(goButton: VdomNode = null): AnonGoButton = {
    val __obj = js.Dynamic.literal()
    if (goButton != null) __obj.updateDynamic("goButton")(goButton.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGoButton]
  }
}

