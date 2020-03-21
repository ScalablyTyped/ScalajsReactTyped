package typingsJapgolly.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamedQueriesInput extends js.Object {
  /**
    * The maximum number of queries to return in this request.
    */
  var MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.native
  /**
    * The token that specifies where to start pagination if a previous request was truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The name of the workgroup from which the named queries are being returned.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}

object ListNamedQueriesInput {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: Token = null, WorkGroup: WorkGroupName = null): ListNamedQueriesInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNamedQueriesInput]
  }
}

