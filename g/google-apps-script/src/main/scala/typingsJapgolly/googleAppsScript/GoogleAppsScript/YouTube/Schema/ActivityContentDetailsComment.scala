package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsComment extends js.Object {
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsComment {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsComment = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityContentDetailsComment]
  }
}

