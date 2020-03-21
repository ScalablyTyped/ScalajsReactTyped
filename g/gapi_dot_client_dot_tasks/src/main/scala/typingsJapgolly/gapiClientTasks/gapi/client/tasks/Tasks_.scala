package typingsJapgolly.gapiClientTasks.gapi.client.tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks_ extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Collection of tasks. */
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  /** Type of the resource. This is always "tasks#tasks". */
  var kind: js.UndefOr[String] = js.undefined
  /** Token used to access the next page of this result. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Tasks_ {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Task] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Tasks_ = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks_]
  }
}

