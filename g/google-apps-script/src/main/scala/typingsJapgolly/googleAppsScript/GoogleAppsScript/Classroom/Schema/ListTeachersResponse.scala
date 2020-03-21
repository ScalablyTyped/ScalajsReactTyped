package typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTeachersResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var teachers: js.UndefOr[js.Array[Teacher]] = js.undefined
}

object ListTeachersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, teachers: js.Array[Teacher] = null): ListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (teachers != null) __obj.updateDynamic("teachers")(teachers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTeachersResponse]
  }
}

