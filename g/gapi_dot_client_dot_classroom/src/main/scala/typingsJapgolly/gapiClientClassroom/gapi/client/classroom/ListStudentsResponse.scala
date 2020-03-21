package typingsJapgolly.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStudentsResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Students who match the list request. */
  var students: js.UndefOr[js.Array[Student]] = js.undefined
}

object ListStudentsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, students: js.Array[Student] = null): ListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (students != null) __obj.updateDynamic("students")(students.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStudentsResponse]
  }
}

