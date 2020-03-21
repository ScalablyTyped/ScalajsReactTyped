package typingsJapgolly.antd.treeTreeMod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.antd.antdStrings.check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeCheckedEvent extends AntTreeNodeBaseEvent {
  var checked: js.UndefOr[Boolean] = js.undefined
  var checkedNodes: js.UndefOr[js.Array[Component[AntTreeNodeProps with js.Object, js.Object]]] = js.undefined
  var event: check
}

object AntTreeNodeCheckedEvent {
  @scala.inline
  def apply(
    event: check,
    nativeEvent: MouseEvent,
    node: Component[AntTreeNodeProps with js.Object, js.Object],
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedNodes: js.Array[Component[AntTreeNodeProps with js.Object, js.Object]] = null
  ): AntTreeNodeCheckedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (checkedNodes != null) __obj.updateDynamic("checkedNodes")(checkedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeCheckedEvent]
  }
}

