package typingsJapgolly.reactAlert.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertComponentProps extends js.Object {
  var id: String
  var message: Node
  var options: AlertCustomOptionsWithType
  def close(): Unit
}

object AlertComponentProps {
  @scala.inline
  def apply(close: Callback, id: String, options: AlertCustomOptionsWithType, message: VdomNode = null): AlertComponentProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertComponentProps]
  }
}

