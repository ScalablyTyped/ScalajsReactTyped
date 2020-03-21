package typingsJapgolly.octokitRest.mod.Octokit

import typingsJapgolly.octokitRest.octokitRestStrings.`private`
import typingsJapgolly.octokitRest.octokitRestStrings.all
import typingsJapgolly.octokitRest.octokitRestStrings.asc
import typingsJapgolly.octokitRest.octokitRestStrings.created
import typingsJapgolly.octokitRest.octokitRestStrings.desc
import typingsJapgolly.octokitRest.octokitRestStrings.forks
import typingsJapgolly.octokitRest.octokitRestStrings.full_name
import typingsJapgolly.octokitRest.octokitRestStrings.internal
import typingsJapgolly.octokitRest.octokitRestStrings.member
import typingsJapgolly.octokitRest.octokitRestStrings.public
import typingsJapgolly.octokitRest.octokitRestStrings.pushed
import typingsJapgolly.octokitRest.octokitRestStrings.sources
import typingsJapgolly.octokitRest.octokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForOrgParams extends js.Object {
  /**
    * Can be one of `asc` or `desc`. Default: when using `full_name`: `asc`, otherwise `desc`
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  var org: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * Can be one of `created`, `updated`, `pushed`, `full_name`.
    */
  var sort: js.UndefOr[created | updated | pushed | full_name] = js.undefined
  /**
    * Specifies the types of repositories you want returned. Can be one of `all`, `public`, `private`, `forks`, `sources`, `member`, `internal`. Default: `all`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud, `type` can also be `internal`.
    */
  var `type`: js.UndefOr[all | public | `private` | forks | sources | member | internal] = js.undefined
}

object ReposListForOrgParams {
  @scala.inline
  def apply(
    org: String,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: created | updated | pushed | full_name = null,
    `type`: all | public | `private` | forks | sources | member | internal = null
  ): ReposListForOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForOrgParams]
  }
}

