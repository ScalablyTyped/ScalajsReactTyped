package typingsJapgolly.googleCloudStorage.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNotificationMetadataOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object GetNotificationMetadataOptions {
  @scala.inline
  def apply(userProject: String = null): GetNotificationMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationMetadataOptions]
  }
}

