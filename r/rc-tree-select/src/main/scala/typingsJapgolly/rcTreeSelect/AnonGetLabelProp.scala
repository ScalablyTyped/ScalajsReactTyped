package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcTreeSelect.interfaceMod.DataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.SimpleModeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetLabelProp extends js.Object {
  var simpleMode: Boolean | SimpleModeConfig
  def getLabelProp(node: DataNode): Node
}

object AnonGetLabelProp {
  @scala.inline
  def apply(getLabelProp: DataNode => CallbackTo[Node], simpleMode: Boolean | SimpleModeConfig): AnonGetLabelProp = {
    val __obj = js.Dynamic.literal(simpleMode = simpleMode.asInstanceOf[js.Any])
    __obj.updateDynamic("getLabelProp")(js.Any.fromFunction1((t0: typingsJapgolly.rcTreeSelect.interfaceMod.DataNode) => getLabelProp(t0).runNow()))
    __obj.asInstanceOf[AnonGetLabelProp]
  }
}

