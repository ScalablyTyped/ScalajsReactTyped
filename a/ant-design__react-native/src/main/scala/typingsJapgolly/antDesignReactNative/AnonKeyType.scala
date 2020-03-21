package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.update
import typingsJapgolly.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyType extends Operation {
  var children: Node
  var key: Double
  var `type`: update
}

object AnonKeyType {
  @scala.inline
  def apply(key: Double, `type`: update, children: VdomNode = null): AnonKeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyType]
  }
}

