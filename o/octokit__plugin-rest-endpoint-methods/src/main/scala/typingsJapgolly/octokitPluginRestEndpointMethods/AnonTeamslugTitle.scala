package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeamslugTitle extends js.Object {
  var body: AnonType
  var discussion_number: AnonRequired
  var org: AnonRequired
  var team_slug: AnonRequired
  var title: AnonType
}

object AnonTeamslugTitle {
  @scala.inline
  def apply(
    body: AnonType,
    discussion_number: AnonRequired,
    org: AnonRequired,
    team_slug: AnonRequired,
    title: AnonType
  ): AnonTeamslugTitle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTeamslugTitle]
  }
}

