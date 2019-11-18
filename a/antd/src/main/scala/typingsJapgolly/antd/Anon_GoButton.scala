package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GoButton extends js.Object {
  var goButton: js.UndefOr[Node] = js.undefined
}

object Anon_GoButton {
  @scala.inline
  def apply(goButton: VdomNode = null): Anon_GoButton = {
    val __obj = js.Dynamic.literal()
    if (goButton != null) __obj.updateDynamic("goButton")(goButton.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GoButton]
  }
}

