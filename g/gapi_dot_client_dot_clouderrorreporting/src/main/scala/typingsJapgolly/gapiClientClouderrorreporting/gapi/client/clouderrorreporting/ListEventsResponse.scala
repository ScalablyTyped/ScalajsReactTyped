package typingsJapgolly.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventsResponse extends js.Object {
  /** The error events which match the given request. */
  var errorEvents: js.UndefOr[js.Array[ErrorEvent]] = js.undefined
  /**
    * If non-empty, more results are available.
    * Pass this token, along with the same query parameters as the first
    * request, to view the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The timestamp specifies the start time to which the request was restricted. */
  var timeRangeBegin: js.UndefOr[String] = js.undefined
}

object ListEventsResponse {
  @scala.inline
  def apply(
    errorEvents: js.Array[ErrorEvent] = null,
    nextPageToken: String = null,
    timeRangeBegin: String = null
  ): ListEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (errorEvents != null) __obj.updateDynamic("errorEvents")(errorEvents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (timeRangeBegin != null) __obj.updateDynamic("timeRangeBegin")(timeRangeBegin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventsResponse]
  }
}

