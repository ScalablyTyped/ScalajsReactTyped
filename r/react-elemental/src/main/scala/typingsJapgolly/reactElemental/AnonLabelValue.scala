package typingsJapgolly.reactElemental

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelValue extends js.Object {
  val label: String | Node
  val value: String
}

object AnonLabelValue {
  @scala.inline
  def apply(value: String, label: String | Node = null): AnonLabelValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelValue]
  }
}

