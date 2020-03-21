package typingsJapgolly.reactFocusLock.interfacesMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFocusProps extends js.Object {
  var children: Node
  var className: js.UndefOr[String] = js.undefined
}

object AutoFocusProps {
  @scala.inline
  def apply(children: VdomNode = null, className: String = null): AutoFocusProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocusProps]
  }
}

