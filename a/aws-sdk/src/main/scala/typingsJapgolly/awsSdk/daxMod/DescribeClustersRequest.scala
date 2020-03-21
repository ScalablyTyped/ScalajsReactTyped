package typingsJapgolly.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersRequest extends js.Object {
  /**
    * The names of the DAX clusters being described.
    */
  var ClusterNames: js.UndefOr[ClusterNameList] = js.native
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeClustersRequest {
  @scala.inline
  def apply(ClusterNames: ClusterNameList = null, MaxResults: Int | Double = null, NextToken: String = null): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (ClusterNames != null) __obj.updateDynamic("ClusterNames")(ClusterNames.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClustersRequest]
  }
}

