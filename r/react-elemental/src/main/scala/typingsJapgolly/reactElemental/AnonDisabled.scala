package typingsJapgolly.reactElemental

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  val disabled: js.UndefOr[Boolean] = js.undefined
  val label: String | Node
  val value: String
}

object AnonDisabled {
  @scala.inline
  def apply(value: String, disabled: js.UndefOr[Boolean] = js.undefined, label: String | Node = null): AnonDisabled = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
}

