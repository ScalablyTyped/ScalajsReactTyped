package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroup extends js.Object {
  var group: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object AnonGroup {
  @scala.inline
  def apply(group: String = null, id: String = null, weight: Int | Double = null): AnonGroup = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroup]
  }
}

