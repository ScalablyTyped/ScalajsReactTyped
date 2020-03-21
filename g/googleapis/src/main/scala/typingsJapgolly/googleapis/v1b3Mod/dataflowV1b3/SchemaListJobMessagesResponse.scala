package typingsJapgolly.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list job messages.
  */
@js.native
trait SchemaListJobMessagesResponse extends js.Object {
  /**
    * Autoscaling events in ascending timestamp order.
    */
  var autoscalingEvents: js.UndefOr[js.Array[SchemaAutoscalingEvent]] = js.native
  /**
    * Messages in ascending timestamp order.
    */
  var jobMessages: js.UndefOr[js.Array[SchemaJobMessage]] = js.native
  /**
    * The token to obtain the next page of results if there are more.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListJobMessagesResponse {
  @scala.inline
  def apply(
    autoscalingEvents: js.Array[SchemaAutoscalingEvent] = null,
    jobMessages: js.Array[SchemaJobMessage] = null,
    nextPageToken: String = null
  ): SchemaListJobMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (autoscalingEvents != null) __obj.updateDynamic("autoscalingEvents")(autoscalingEvents.asInstanceOf[js.Any])
    if (jobMessages != null) __obj.updateDynamic("jobMessages")(jobMessages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListJobMessagesResponse]
  }
}

