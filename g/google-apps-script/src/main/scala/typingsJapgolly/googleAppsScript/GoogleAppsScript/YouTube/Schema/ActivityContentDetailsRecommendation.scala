package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsRecommendation extends js.Object {
  var reason: js.UndefOr[String] = js.undefined
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  var seedResourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsRecommendation {
  @scala.inline
  def apply(reason: String = null, resourceId: ResourceId = null, seedResourceId: ResourceId = null): ActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (seedResourceId != null) __obj.updateDynamic("seedResourceId")(seedResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityContentDetailsRecommendation]
  }
}

