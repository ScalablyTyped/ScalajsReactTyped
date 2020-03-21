package typingsJapgolly.octokitRest.mod.Octokit

import typingsJapgolly.octokitRest.octokitRestStrings.Plussign1
import typingsJapgolly.octokitRest.octokitRestStrings.`-1`
import typingsJapgolly.octokitRest.octokitRestStrings.confused
import typingsJapgolly.octokitRest.octokitRestStrings.eyes
import typingsJapgolly.octokitRest.octokitRestStrings.heart
import typingsJapgolly.octokitRest.octokitRestStrings.hooray
import typingsJapgolly.octokitRest.octokitRestStrings.laugh
import typingsJapgolly.octokitRest.octokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionInOrgParams extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var discussion_number: Double
  var org: String
  var team_slug: String
}

object ReactionsCreateForTeamDiscussionInOrgParams {
  @scala.inline
  def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    org: String,
    team_slug: String
  ): ReactionsCreateForTeamDiscussionInOrgParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionInOrgParams]
  }
}

