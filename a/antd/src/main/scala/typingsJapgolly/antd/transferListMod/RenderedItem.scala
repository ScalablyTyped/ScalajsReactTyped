package typingsJapgolly.antd.transferListMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedItem extends js.Object {
  var item: TransferItem
  var renderedEl: Node
  var renderedText: String
}

object RenderedItem {
  @scala.inline
  def apply(item: TransferItem, renderedText: String, renderedEl: VdomNode = null): RenderedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
    if (renderedEl != null) __obj.updateDynamic("renderedEl")(renderedEl.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedItem]
  }
}

