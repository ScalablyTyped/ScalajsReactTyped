package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddMemberParams extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsAddMemberParams {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsAddMemberParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddMemberParams]
  }
}

