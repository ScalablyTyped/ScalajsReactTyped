package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertHistoryState extends js.Object {
  var appId: js.UndefOr[String] = js.undefined
  var assignedTo: js.UndefOr[String] = js.undefined
  var comments: js.UndefOr[js.Array[String]] = js.undefined
  var feedback: js.UndefOr[AlertFeedback] = js.undefined
  var status: js.UndefOr[AlertStatus] = js.undefined
  var updatedDateTime: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object AlertHistoryState {
  @scala.inline
  def apply(
    appId: String = null,
    assignedTo: String = null,
    comments: js.Array[String] = null,
    feedback: AlertFeedback = null,
    status: AlertStatus = null,
    updatedDateTime: String = null,
    user: String = null
  ): AlertHistoryState = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (assignedTo != null) __obj.updateDynamic("assignedTo")(assignedTo.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (feedback != null) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updatedDateTime != null) __obj.updateDynamic("updatedDateTime")(updatedDateTime.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertHistoryState]
  }
}

