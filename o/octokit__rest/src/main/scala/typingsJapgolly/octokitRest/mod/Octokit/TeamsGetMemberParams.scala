package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMemberParams extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsGetMemberParams {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMemberParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetMemberParams]
  }
}

