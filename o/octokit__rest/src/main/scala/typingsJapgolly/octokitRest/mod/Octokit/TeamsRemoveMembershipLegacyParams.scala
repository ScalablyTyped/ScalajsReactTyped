package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveMembershipLegacyParams extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsRemoveMembershipLegacyParams {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsRemoveMembershipLegacyParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsRemoveMembershipLegacyParams]
  }
}

