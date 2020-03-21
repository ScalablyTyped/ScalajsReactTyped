package typingsJapgolly.cswAasJs.checkLoginMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckLoginProps extends js.Object {
  var children: Node
  var error: Node
}

object CheckLoginProps {
  @scala.inline
  def apply(children: VdomNode = null, error: VdomNode = null): CheckLoginProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckLoginProps]
  }
}

