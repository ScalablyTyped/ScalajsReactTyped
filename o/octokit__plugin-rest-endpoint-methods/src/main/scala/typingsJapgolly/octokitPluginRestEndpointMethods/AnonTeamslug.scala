package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeamslug extends js.Object {
  var comment_number: AnonRequired
  var content: AnonEnumRequired
  var discussion_number: AnonRequired
  var org: AnonRequired
  var team_slug: AnonRequired
}

object AnonTeamslug {
  @scala.inline
  def apply(
    comment_number: AnonRequired,
    content: AnonEnumRequired,
    discussion_number: AnonRequired,
    org: AnonRequired,
    team_slug: AnonRequired
  ): AnonTeamslug = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTeamslug]
  }
}

