package typingsJapgolly.antd.errorBoundaryMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBoundaryProps extends js.Object {
  var description: js.UndefOr[Node] = js.undefined
  var message: js.UndefOr[Node] = js.undefined
}

object ErrorBoundaryProps {
  @scala.inline
  def apply(description: VdomNode = null, message: VdomNode = null): ErrorBoundaryProps = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBoundaryProps]
  }
}

