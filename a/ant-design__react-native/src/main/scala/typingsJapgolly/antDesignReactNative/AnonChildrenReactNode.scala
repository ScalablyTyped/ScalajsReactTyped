package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenReactNode extends js.Object {
  var children: Node
  var key: Double
}

object AnonChildrenReactNode {
  @scala.inline
  def apply(key: Double, children: VdomNode = null): AnonChildrenReactNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenReactNode]
  }
}

