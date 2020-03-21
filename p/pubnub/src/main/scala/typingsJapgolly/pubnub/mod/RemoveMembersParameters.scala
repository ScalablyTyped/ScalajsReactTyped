package typingsJapgolly.pubnub.mod

import typingsJapgolly.pubnub.AnonCustomFields
import typingsJapgolly.pubnub.AnonNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveMembersParameters extends GetObjectsParameters {
  var spaceId: String
  var users: js.Array[String]
}

object RemoveMembersParameters {
  @scala.inline
  def apply(
    spaceId: String,
    users: js.Array[String],
    include: AnonCustomFields = null,
    limit: Int | Double = null,
    page: AnonNext = null
  ): RemoveMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMembersParameters]
  }
}

