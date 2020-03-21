package typingsJapgolly.youtube

import typingsJapgolly.youtube.YT.SuggestedVideoQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndSeconds extends js.Object {
  var endSeconds: js.UndefOr[Double] = js.undefined
  var mediaContentUrl: String
  var startSeconds: js.UndefOr[Double] = js.undefined
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.undefined
}

object AnonEndSeconds {
  @scala.inline
  def apply(
    mediaContentUrl: String,
    endSeconds: Int | Double = null,
    startSeconds: Int | Double = null,
    suggestedQuality: SuggestedVideoQuality = null
  ): AnonEndSeconds = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    if (endSeconds != null) __obj.updateDynamic("endSeconds")(endSeconds.asInstanceOf[js.Any])
    if (startSeconds != null) __obj.updateDynamic("startSeconds")(startSeconds.asInstanceOf[js.Any])
    if (suggestedQuality != null) __obj.updateDynamic("suggestedQuality")(suggestedQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndSeconds]
  }
}

