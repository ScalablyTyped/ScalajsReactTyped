package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTagsListResponse extends js.Object {
  var eventTags: js.UndefOr[js.Array[EventTag]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object EventTagsListResponse {
  @scala.inline
  def apply(eventTags: js.Array[EventTag] = null, kind: String = null): EventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTags != null) __obj.updateDynamic("eventTags")(eventTags.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTagsListResponse]
  }
}

