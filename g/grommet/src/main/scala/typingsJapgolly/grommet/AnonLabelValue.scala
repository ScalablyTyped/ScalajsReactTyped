package typingsJapgolly.grommet

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelValue extends js.Object {
  var label: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonLabelValue {
  @scala.inline
  def apply(label: VdomNode = null, value: js.Any = null): AnonLabelValue = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelValue]
  }
}

