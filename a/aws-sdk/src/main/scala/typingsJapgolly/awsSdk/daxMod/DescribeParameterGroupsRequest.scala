package typingsJapgolly.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeParameterGroupsRequest extends js.Object {
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The names of the parameter groups.
    */
  var ParameterGroupNames: js.UndefOr[ParameterGroupNameList] = js.native
}

object DescribeParameterGroupsRequest {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    NextToken: String = null,
    ParameterGroupNames: ParameterGroupNameList = null
  ): DescribeParameterGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ParameterGroupNames != null) __obj.updateDynamic("ParameterGroupNames")(ParameterGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeParameterGroupsRequest]
  }
}

