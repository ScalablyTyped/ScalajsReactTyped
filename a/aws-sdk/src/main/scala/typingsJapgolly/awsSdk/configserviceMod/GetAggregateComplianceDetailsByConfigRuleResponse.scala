package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateComplianceDetailsByConfigRuleResponse extends js.Object {
  /**
    * Returns an AggregateEvaluationResults object.
    */
  var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.NextToken] = js.native
}

object GetAggregateComplianceDetailsByConfigRuleResponse {
  @scala.inline
  def apply(AggregateEvaluationResults: AggregateEvaluationResultList = null, NextToken: NextToken = null): GetAggregateComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregateEvaluationResults != null) __obj.updateDynamic("AggregateEvaluationResults")(AggregateEvaluationResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleResponse]
  }
}

