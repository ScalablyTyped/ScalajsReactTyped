package typingsJapgolly.baseui.sideNavigationMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var itemId: js.UndefOr[String] = js.undefined
  var subNav: js.UndefOr[js.Array[Item]] = js.undefined
  var title: Node
}

object Item {
  @scala.inline
  def apply(itemId: String = null, subNav: js.Array[Item] = null, title: VdomNode = null): Item = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (subNav != null) __obj.updateDynamic("subNav")(subNav.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

