package typingsJapgolly.fortawesomeFontawesomeSvgCore

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var node: Node
  def callback(): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: Callback, node: Node): AnonCallback = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[AnonCallback]
  }
}

