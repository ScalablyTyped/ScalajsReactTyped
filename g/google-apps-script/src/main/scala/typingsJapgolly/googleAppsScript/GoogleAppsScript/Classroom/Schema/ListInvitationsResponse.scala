package typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsResponse extends js.Object {
  var invitations: js.UndefOr[js.Array[Invitation]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListInvitationsResponse {
  @scala.inline
  def apply(invitations: js.Array[Invitation] = null, nextPageToken: String = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

