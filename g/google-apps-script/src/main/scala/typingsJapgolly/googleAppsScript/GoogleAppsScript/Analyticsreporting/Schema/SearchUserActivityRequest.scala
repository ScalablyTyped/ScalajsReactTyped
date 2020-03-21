package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUserActivityRequest extends js.Object {
  var activityTypes: js.UndefOr[js.Array[String]] = js.undefined
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[User] = js.undefined
  var viewId: js.UndefOr[String] = js.undefined
}

object SearchUserActivityRequest {
  @scala.inline
  def apply(
    activityTypes: js.Array[String] = null,
    dateRange: DateRange = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    user: User = null,
    viewId: String = null
  ): SearchUserActivityRequest = {
    val __obj = js.Dynamic.literal()
    if (activityTypes != null) __obj.updateDynamic("activityTypes")(activityTypes.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (viewId != null) __obj.updateDynamic("viewId")(viewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserActivityRequest]
  }
}

