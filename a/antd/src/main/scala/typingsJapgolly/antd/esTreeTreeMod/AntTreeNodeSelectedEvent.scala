package typingsJapgolly.antd.esTreeTreeMod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.antd.antdStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeSelectedEvent extends AntTreeNodeBaseEvent {
  var event: select
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedNodes: js.UndefOr[js.Array[Component[AntTreeNodeProps with js.Object, js.Object]]] = js.undefined
}

object AntTreeNodeSelectedEvent {
  @scala.inline
  def apply(
    event: select,
    nativeEvent: MouseEvent,
    node: Component[AntTreeNodeProps with js.Object, js.Object],
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedNodes: js.Array[Component[AntTreeNodeProps with js.Object, js.Object]] = null
  ): AntTreeNodeSelectedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedNodes != null) __obj.updateDynamic("selectedNodes")(selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeSelectedEvent]
  }
}

