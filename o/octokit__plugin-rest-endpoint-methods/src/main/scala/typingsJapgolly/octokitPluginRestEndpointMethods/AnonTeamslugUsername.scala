package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeamslugUsername extends js.Object {
  var org: AnonRequired
  var team_slug: AnonRequired
  var username: AnonRequired
}

object AnonTeamslugUsername {
  @scala.inline
  def apply(org: AnonRequired, team_slug: AnonRequired, username: AnonRequired): AnonTeamslugUsername = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTeamslugUsername]
  }
}

