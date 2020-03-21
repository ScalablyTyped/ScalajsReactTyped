package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommentsForCommitParamsDeprecatedRef extends js.Object {
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated "ref" parameter renamed to "commit_sha"
    */
  var ref: String
  var repo: String
}

object ReposListCommentsForCommitParamsDeprecatedRef {
  @scala.inline
  def apply(owner: String, ref: String, repo: String, page: Int | Double = null, per_page: Int | Double = null): ReposListCommentsForCommitParamsDeprecatedRef = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCommentsForCommitParamsDeprecatedRef]
  }
}

