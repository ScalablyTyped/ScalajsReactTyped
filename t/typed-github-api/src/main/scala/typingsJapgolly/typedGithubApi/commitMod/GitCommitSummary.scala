package typingsJapgolly.typedGithubApi.commitMod

import typingsJapgolly.typedGithubApi.AnonPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitSummary extends js.Object {
  var author: GitActor
  var comment_count: Double
  var committer: GitActor
  var message: String
  var tree: GitRef
  var url: String
  var verification: js.UndefOr[AnonPayload] = js.undefined
}

object GitCommitSummary {
  @scala.inline
  def apply(
    author: GitActor,
    comment_count: Double,
    committer: GitActor,
    message: String,
    tree: GitRef,
    url: String,
    verification: AnonPayload = null
  ): GitCommitSummary = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitSummary]
  }
}

