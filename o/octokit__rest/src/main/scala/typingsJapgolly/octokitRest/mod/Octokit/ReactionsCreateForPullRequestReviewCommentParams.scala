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

trait ReactionsCreateForPullRequestReviewCommentParams extends js.Object {
  var comment_id: Double
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the pull request review comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var owner: String
  var repo: String
}

object ReactionsCreateForPullRequestReviewCommentParams {
  @scala.inline
  def apply(
    comment_id: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    owner: String,
    repo: String
  ): ReactionsCreateForPullRequestReviewCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForPullRequestReviewCommentParams]
  }
}

