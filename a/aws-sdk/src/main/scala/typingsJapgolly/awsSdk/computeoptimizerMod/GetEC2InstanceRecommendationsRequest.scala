package typingsJapgolly.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEC2InstanceRecommendationsRequest extends js.Object {
  /**
    * The AWS account IDs for which to return instance recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.native
  /**
    * An array of objects that describe a filter that returns a more specific list of instance recommendations.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * The Amazon Resource Name (ARN) of the instances for which to return recommendations.
    */
  var instanceArns: js.UndefOr[InstanceArns] = js.native
  /**
    * The maximum number of instance recommendations to return with a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to advance to the next page of instance recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetEC2InstanceRecommendationsRequest {
  @scala.inline
  def apply(
    accountIds: AccountIds = null,
    filters: Filters = null,
    instanceArns: InstanceArns = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): GetEC2InstanceRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountIds != null) __obj.updateDynamic("accountIds")(accountIds.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (instanceArns != null) __obj.updateDynamic("instanceArns")(instanceArns.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEC2InstanceRecommendationsRequest]
  }
}

