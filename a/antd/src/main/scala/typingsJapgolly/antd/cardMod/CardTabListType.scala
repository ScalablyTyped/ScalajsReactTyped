package typingsJapgolly.antd.cardMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTabListType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: String
  var tab: Node
}

object CardTabListType {
  @scala.inline
  def apply(key: String, disabled: js.UndefOr[Boolean] = js.undefined, tab: VdomNode = null): CardTabListType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTabListType]
  }
}

