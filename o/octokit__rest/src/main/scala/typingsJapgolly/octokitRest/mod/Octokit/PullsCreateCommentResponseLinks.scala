package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentResponseLinks extends js.Object {
  var html: PullsCreateCommentResponseLinksHtml
  var pull_request: PullsCreateCommentResponseLinksPullRequest
  var self: PullsCreateCommentResponseLinksSelf
}

object PullsCreateCommentResponseLinks {
  @scala.inline
  def apply(
    html: PullsCreateCommentResponseLinksHtml,
    pull_request: PullsCreateCommentResponseLinksPullRequest,
    self: PullsCreateCommentResponseLinksSelf
  ): PullsCreateCommentResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateCommentResponseLinks]
  }
}

