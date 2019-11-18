package typingsJapgolly.antd.esTreeTreeMod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeBaseEvent extends js.Object {
  var nativeEvent: MouseEvent
  var node: Component[AntTreeNodeProps with js.Object, js.Object]
}

object AntTreeNodeBaseEvent {
  @scala.inline
  def apply(nativeEvent: MouseEvent, node: Component[AntTreeNodeProps with js.Object, js.Object]): AntTreeNodeBaseEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntTreeNodeBaseEvent]
  }
}

