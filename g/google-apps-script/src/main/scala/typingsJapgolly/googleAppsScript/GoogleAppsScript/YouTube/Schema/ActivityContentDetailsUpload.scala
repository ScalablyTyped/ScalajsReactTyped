package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsUpload extends js.Object {
  var videoId: js.UndefOr[String] = js.undefined
}

object ActivityContentDetailsUpload {
  @scala.inline
  def apply(videoId: String = null): ActivityContentDetailsUpload = {
    val __obj = js.Dynamic.literal()
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityContentDetailsUpload]
  }
}

