package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`author-date`
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`committer-date`
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.asc
import typingsJapgolly.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCommitsParams extends js.Object {
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[desc | asc] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query). See "[Searching commits](https://help.github.com/articles/searching-commits/)" for a detailed list of qualifiers.
    */
  var q: String
  /**
    * Sorts the results of your query by `author-date` or `committer-date`. Default: [best match](https://developer.github.com/v3/search/#ranking-search-results)
    */
  var sort: js.UndefOr[`author-date` | `committer-date`] = js.undefined
}

object SearchCommitsParams {
  @scala.inline
  def apply(
    q: String,
    order: desc | asc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: `author-date` | `committer-date` = null
  ): SearchCommitsParams = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCommitsParams]
  }
}

