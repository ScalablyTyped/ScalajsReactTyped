package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionCommentParams extends js.Object {
  var comment_number: Double
  var discussion_number: Double
  var team_id: Double
}

object TeamsDeleteDiscussionCommentParams {
  @scala.inline
  def apply(comment_number: Double, discussion_number: Double, team_id: Double): TeamsDeleteDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsDeleteDiscussionCommentParams]
  }
}

