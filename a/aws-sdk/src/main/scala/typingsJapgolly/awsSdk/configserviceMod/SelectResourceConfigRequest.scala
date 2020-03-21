package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectResourceConfigRequest extends js.Object {
  /**
    * The SQL query SELECT command.
    */
  var Expression: typingsJapgolly.awsSdk.configserviceMod.Expression = js.native
  /**
    * The maximum number of query results returned on each page. 
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.NextToken] = js.native
}

object SelectResourceConfigRequest {
  @scala.inline
  def apply(Expression: Expression, Limit: Int | Double = null, NextToken: NextToken = null): SelectResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectResourceConfigRequest]
  }
}

