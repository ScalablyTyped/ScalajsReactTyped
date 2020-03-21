package typingsJapgolly.reactFocusLock.interfacesMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InFocusGuardProps extends js.Object {
  var children: Node
}

object InFocusGuardProps {
  @scala.inline
  def apply(children: VdomNode = null): InFocusGuardProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InFocusGuardProps]
  }
}

