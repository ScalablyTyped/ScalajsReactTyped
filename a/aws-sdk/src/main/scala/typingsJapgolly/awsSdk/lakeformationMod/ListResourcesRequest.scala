package typingsJapgolly.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesRequest extends js.Object {
  /**
    * Any applicable row-level and/or column-level filtering conditions for the resources.
    */
  var FilterConditionList: js.UndefOr[typingsJapgolly.awsSdk.lakeformationMod.FilterConditionList] = js.native
  /**
    * The maximum number of resource results.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListResourcesRequest {
  @scala.inline
  def apply(
    FilterConditionList: FilterConditionList = null,
    MaxResults: Int | Double = null,
    NextToken: Token = null
  ): ListResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (FilterConditionList != null) __obj.updateDynamic("FilterConditionList")(FilterConditionList.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesRequest]
  }
}

