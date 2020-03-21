package typingsJapgolly.reactInlinesvg.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var content: String
  var element: Node
  var hasCache: Boolean
  var status: String
}

object IState {
  @scala.inline
  def apply(content: String, hasCache: Boolean, status: String, element: VdomNode = null): IState = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], hasCache = hasCache.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

