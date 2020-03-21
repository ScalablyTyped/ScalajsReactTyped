package typingsJapgolly.insight.mod.insight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  var action: String
  var category: String
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | String] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(action: String, category: String, label: String = null, value: Double | String = null): IEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

