package typingsJapgolly.cswAasJs.authContextProviderMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextProps extends js.Object {
  var children: Node
  var config: AuthContextConfig
}

object AuthContextProps {
  @scala.inline
  def apply(config: AuthContextConfig, children: VdomNode = null): AuthContextProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthContextProps]
  }
}

