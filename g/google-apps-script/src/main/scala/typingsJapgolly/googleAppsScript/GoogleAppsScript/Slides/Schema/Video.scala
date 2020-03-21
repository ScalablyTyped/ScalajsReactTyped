package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var videoProperties: js.UndefOr[VideoProperties] = js.undefined
}

object Video {
  @scala.inline
  def apply(
    id: String = null,
    source: String = null,
    url: String = null,
    videoProperties: VideoProperties = null
  ): Video = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (videoProperties != null) __obj.updateDynamic("videoProperties")(videoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
}

