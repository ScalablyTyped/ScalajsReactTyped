package typingsJapgolly.octokitRest.mod.Octokit

import typingsJapgolly.octokitRest.octokitRestStrings.all
import typingsJapgolly.octokitRest.octokitRestStrings.asc
import typingsJapgolly.octokitRest.octokitRestStrings.assigned
import typingsJapgolly.octokitRest.octokitRestStrings.closed
import typingsJapgolly.octokitRest.octokitRestStrings.comments
import typingsJapgolly.octokitRest.octokitRestStrings.created
import typingsJapgolly.octokitRest.octokitRestStrings.desc
import typingsJapgolly.octokitRest.octokitRestStrings.mentioned
import typingsJapgolly.octokitRest.octokitRestStrings.open
import typingsJapgolly.octokitRest.octokitRestStrings.subscribed
import typingsJapgolly.octokitRest.octokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForAuthenticatedUserParams extends js.Object {
  /**
    * The direction of the sort. Can be either `asc` or `desc`.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  /**
    * Indicates which sorts of issues to return. Can be one of:
    * \* `assigned`: Issues assigned to you
    * \* `created`: Issues created by you
    * \* `mentioned`: Issues mentioning you
    * \* `subscribed`: Issues you're subscribed to updates for
    * \* `all`: All issues the authenticated user can see, regardless of participation or creation
    */
  var filter: js.UndefOr[assigned | created | mentioned | subscribed | all] = js.undefined
  /**
    * A list of comma separated label names. Example: `bug,ui,@high`
    */
  var labels: js.UndefOr[String] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * Only issues updated at or after this time are returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[String] = js.undefined
  /**
    * What to sort results by. Can be either `created`, `updated`, `comments`.
    */
  var sort: js.UndefOr[created | updated | comments] = js.undefined
  /**
    * Indicates the state of the issues to return. Can be either `open`, `closed`, or `all`.
    */
  var state: js.UndefOr[open | closed | all] = js.undefined
}

object IssuesListForAuthenticatedUserParams {
  @scala.inline
  def apply(
    direction: asc | desc = null,
    filter: assigned | created | mentioned | subscribed | all = null,
    labels: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    since: String = null,
    sort: created | updated | comments = null,
    state: open | closed | all = null
  ): IssuesListForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListForAuthenticatedUserParams]
  }
}

