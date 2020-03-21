package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoGetRatingResponse extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var eventId: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[VideoRating]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var visitorId: js.UndefOr[String] = js.undefined
}

object VideoGetRatingResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[VideoRating] = null,
    kind: String = null,
    visitorId: String = null
  ): VideoGetRatingResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoGetRatingResponse]
  }
}

