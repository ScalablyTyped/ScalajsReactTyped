package typingsJapgolly.googleAppsScript.GoogleAppsScript.Appsactivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActivitiesResponse extends js.Object {
  var activities: js.UndefOr[js.Array[Activity]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListActivitiesResponse {
  @scala.inline
  def apply(activities: js.Array[Activity] = null, nextPageToken: String = null): ListActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActivitiesResponse]
  }
}

