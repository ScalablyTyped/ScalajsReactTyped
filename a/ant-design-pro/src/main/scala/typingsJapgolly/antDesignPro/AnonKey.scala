package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var tab: Node
}

object AnonKey {
  @scala.inline
  def apply(key: String, tab: VdomNode = null): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

