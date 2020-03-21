package typingsJapgolly.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCostAndUsageResponse extends js.Object {
  /**
    * The groups that are specified by the Filter or GroupBy parameters in the request.
    */
  var GroupDefinitions: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.GroupDefinitions] = js.native
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The time period that is covered by the results in the response.
    */
  var ResultsByTime: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.ResultsByTime] = js.native
}

object GetCostAndUsageResponse {
  @scala.inline
  def apply(
    GroupDefinitions: GroupDefinitions = null,
    NextPageToken: NextPageToken = null,
    ResultsByTime: ResultsByTime = null
  ): GetCostAndUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupDefinitions != null) __obj.updateDynamic("GroupDefinitions")(GroupDefinitions.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ResultsByTime != null) __obj.updateDynamic("ResultsByTime")(ResultsByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCostAndUsageResponse]
  }
}

