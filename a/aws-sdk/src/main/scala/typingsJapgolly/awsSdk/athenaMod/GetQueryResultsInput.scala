package typingsJapgolly.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsInput extends js.Object {
  /**
    * The maximum number of results (rows) to return in this request.
    */
  var MaxResults: js.UndefOr[MaxQueryResults] = js.native
  /**
    * The token that specifies where to start pagination if a previous request was truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The unique ID of the query execution.
    */
  var QueryExecutionId: typingsJapgolly.awsSdk.athenaMod.QueryExecutionId = js.native
}

object GetQueryResultsInput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId, MaxResults: Int | Double = null, NextToken: Token = null): GetQueryResultsInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsInput]
  }
}

