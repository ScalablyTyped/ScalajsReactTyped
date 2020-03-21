package typingsJapgolly.antDesignReactNative.portalHostMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.mount
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.unmount
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.antDesignReactNative.AnonChildrenKey
  - typingsJapgolly.antDesignReactNative.AnonKeyType
  - typingsJapgolly.antDesignReactNative.AnonKeyNumber
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def AnonChildrenKey(key: Double, `type`: mount, children: VdomNode = null): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def AnonKeyType(key: Double, `type`: update, children: VdomNode = null): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def AnonKeyNumber(key: Double, `type`: unmount): Operation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

