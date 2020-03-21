package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateInvitationResponse extends js.Object {
  var created_at: String
  var email: String
  var id: Double
  var invitation_team_url: String
  var inviter: OrgsCreateInvitationResponseInviter
  var login: String
  var role: String
  var team_count: Double
}

object OrgsCreateInvitationResponse {
  @scala.inline
  def apply(
    created_at: String,
    email: String,
    id: Double,
    invitation_team_url: String,
    inviter: OrgsCreateInvitationResponseInviter,
    login: String,
    role: String,
    team_count: Double
  ): OrgsCreateInvitationResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitation_team_url = invitation_team_url.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_count = team_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsCreateInvitationResponse]
  }
}

