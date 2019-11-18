package typingsJapgolly.antd.esTreeTreeMod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeExpandedEvent extends AntTreeNodeBaseEvent {
  var expanded: js.UndefOr[Boolean] = js.undefined
}

object AntTreeNodeExpandedEvent {
  @scala.inline
  def apply(
    nativeEvent: MouseEvent,
    node: Component[AntTreeNodeProps with js.Object, js.Object],
    expanded: js.UndefOr[Boolean] = js.undefined
  ): AntTreeNodeExpandedEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeExpandedEvent]
  }
}

