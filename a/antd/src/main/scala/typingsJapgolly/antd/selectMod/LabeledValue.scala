package typingsJapgolly.antd.selectMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledValue extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var label: Node
  var value: RawValue
}

object LabeledValue {
  @scala.inline
  def apply(value: RawValue, key: String = null, label: VdomNode = null): LabeledValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledValue]
  }
}

