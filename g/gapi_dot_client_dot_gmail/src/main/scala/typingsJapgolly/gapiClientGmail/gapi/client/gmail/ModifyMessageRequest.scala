package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyMessageRequest extends js.Object {
  /** A list of IDs of labels to add to this message. */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  /** A list IDs of labels to remove from this message. */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ModifyMessageRequest {
  @scala.inline
  def apply(addLabelIds: js.Array[String] = null, removeLabelIds: js.Array[String] = null): ModifyMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds.asInstanceOf[js.Any])
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyMessageRequest]
  }
}

