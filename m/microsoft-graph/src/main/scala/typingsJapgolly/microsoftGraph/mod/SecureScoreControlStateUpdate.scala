package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureScoreControlStateUpdate extends js.Object {
  // Assigns the control to the user who will take the action.
  var assignedTo: js.UndefOr[String] = js.undefined
  // Provides optional comment about the control.
  var comment: js.UndefOr[String] = js.undefined
  // State of the control, which can be modified via a PATCH command (for example, ignored, thirdParty).
  var state: js.UndefOr[String] = js.undefined
  // ID of the user who updated tenant state.
  var updatedBy: js.UndefOr[String] = js.undefined
  // Time at which the control state was updated.
  var updatedDateTime: js.UndefOr[String] = js.undefined
}

object SecureScoreControlStateUpdate {
  @scala.inline
  def apply(
    assignedTo: String = null,
    comment: String = null,
    state: String = null,
    updatedBy: String = null,
    updatedDateTime: String = null
  ): SecureScoreControlStateUpdate = {
    val __obj = js.Dynamic.literal()
    if (assignedTo != null) __obj.updateDynamic("assignedTo")(assignedTo.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (updatedBy != null) __obj.updateDynamic("updatedBy")(updatedBy.asInstanceOf[js.Any])
    if (updatedDateTime != null) __obj.updateDynamic("updatedDateTime")(updatedDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureScoreControlStateUpdate]
  }
}

