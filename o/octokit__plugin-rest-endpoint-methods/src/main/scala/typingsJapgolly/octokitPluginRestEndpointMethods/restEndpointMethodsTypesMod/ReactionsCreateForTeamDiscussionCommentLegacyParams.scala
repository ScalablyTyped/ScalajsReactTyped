package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.Plussign1
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`-1`
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.confused
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.eyes
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.heart
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.hooray
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.laugh
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionCommentLegacyParams extends js.Object {
  var comment_number: Double
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var discussion_number: Double
  var team_id: Double
}

object ReactionsCreateForTeamDiscussionCommentLegacyParams {
  @scala.inline
  def apply(
    comment_number: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    team_id: Double
  ): ReactionsCreateForTeamDiscussionCommentLegacyParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentLegacyParams]
  }
}

