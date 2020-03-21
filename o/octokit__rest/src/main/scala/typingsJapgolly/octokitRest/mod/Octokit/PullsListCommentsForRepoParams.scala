package typingsJapgolly.octokitRest.mod.Octokit

import typingsJapgolly.octokitRest.octokitRestStrings.asc
import typingsJapgolly.octokitRest.octokitRestStrings.created
import typingsJapgolly.octokitRest.octokitRestStrings.desc
import typingsJapgolly.octokitRest.octokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommentsForRepoParams extends js.Object {
  /**
    * Can be either `asc` or `desc`. Ignored without `sort` parameter.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  /**
    * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Only returns comments `updated` at or after this time.
    */
  var since: js.UndefOr[String] = js.undefined
  /**
    * Can be either `created` or `updated` comments.
    */
  var sort: js.UndefOr[created | updated] = js.undefined
}

object PullsListCommentsForRepoParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    since: String = null,
    sort: created | updated = null
  ): PullsListCommentsForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListCommentsForRepoParams]
  }
}

