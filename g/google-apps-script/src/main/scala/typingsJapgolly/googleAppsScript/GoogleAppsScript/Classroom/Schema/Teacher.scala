package typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Teacher extends js.Object {
  var courseId: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[UserProfile] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object Teacher {
  @scala.inline
  def apply(courseId: String = null, profile: UserProfile = null, userId: String = null): Teacher = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teacher]
  }
}

