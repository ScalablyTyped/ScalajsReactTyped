package typingsJapgolly.rcFieldForm

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChild extends js.Object {
  var child: Node
  var isFunction: Boolean
}

object AnonChild {
  @scala.inline
  def apply(isFunction: Boolean, child: VdomNode = null): AnonChild = {
    val __obj = js.Dynamic.literal(isFunction = isFunction.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChild]
  }
}

