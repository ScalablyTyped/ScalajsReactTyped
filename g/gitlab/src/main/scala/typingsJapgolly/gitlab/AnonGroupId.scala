package typingsJapgolly.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupId extends js.Object {
  var groupId: js.UndefOr[String | Double] = js.undefined
}

object AnonGroupId {
  @scala.inline
  def apply(groupId: String | Double = null): AnonGroupId = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupId]
  }
}

