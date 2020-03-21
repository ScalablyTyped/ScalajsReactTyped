package typingsJapgolly.reactRelay.relayEnvironmentProviderMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: Node
  var environment: Environment
}

object Props {
  @scala.inline
  def apply(environment: Environment, children: VdomNode = null): Props = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

