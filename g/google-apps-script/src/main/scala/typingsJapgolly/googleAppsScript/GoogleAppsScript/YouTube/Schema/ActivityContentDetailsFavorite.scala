package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsFavorite extends js.Object {
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsFavorite {
  @scala.inline
  def apply(resourceId: ResourceId = null): ActivityContentDetailsFavorite = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityContentDetailsFavorite]
  }
}

