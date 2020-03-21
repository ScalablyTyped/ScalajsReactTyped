package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobMessagesResponse extends js.Object {
  /** Autoscaling events in ascending timestamp order. */
  var autoscalingEvents: js.UndefOr[js.Array[AutoscalingEvent]] = js.undefined
  /** Messages in ascending timestamp order. */
  var jobMessages: js.UndefOr[js.Array[JobMessage]] = js.undefined
  /** The token to obtain the next page of results if there are more. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListJobMessagesResponse {
  @scala.inline
  def apply(
    autoscalingEvents: js.Array[AutoscalingEvent] = null,
    jobMessages: js.Array[JobMessage] = null,
    nextPageToken: String = null
  ): ListJobMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (autoscalingEvents != null) __obj.updateDynamic("autoscalingEvents")(autoscalingEvents.asInstanceOf[js.Any])
    if (jobMessages != null) __obj.updateDynamic("jobMessages")(jobMessages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobMessagesResponse]
  }
}

