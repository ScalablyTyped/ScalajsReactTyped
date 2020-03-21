package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.mount
import typingsJapgolly.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenKey extends Operation {
  var children: Node
  var key: Double
  var `type`: mount
}

object AnonChildrenKey {
  @scala.inline
  def apply(key: Double, `type`: mount, children: VdomNode = null): AnonChildrenKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenKey]
  }
}

