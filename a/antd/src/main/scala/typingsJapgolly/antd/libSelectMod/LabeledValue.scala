package typingsJapgolly.antd.libSelectMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledValue extends js.Object {
  var key: String
  var label: Node
}

object LabeledValue {
  @scala.inline
  def apply(key: String, label: VdomNode): LabeledValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledValue]
  }
}

