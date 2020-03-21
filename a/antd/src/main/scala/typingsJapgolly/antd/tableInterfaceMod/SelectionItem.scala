package typingsJapgolly.antd.tableInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionItem extends js.Object {
  var key: String
  var onSelect: js.UndefOr[SelectionItemSelectFn] = js.undefined
  var text: Node
}

object SelectionItem {
  @scala.inline
  def apply(
    key: String,
    onSelect: /* currentRowKeys */ js.Array[Key] => Callback = null,
    text: VdomNode = null
  ): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* currentRowKeys */ js.Array[typingsJapgolly.antd.tableInterfaceMod.Key]) => onSelect(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionItem]
  }
}

