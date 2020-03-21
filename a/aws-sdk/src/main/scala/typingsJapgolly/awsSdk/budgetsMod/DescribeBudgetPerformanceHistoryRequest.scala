package typingsJapgolly.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetPerformanceHistoryRequest extends js.Object {
  var AccountId: typingsJapgolly.awsSdk.budgetsMod.AccountId = js.native
  var BudgetName: typingsJapgolly.awsSdk.budgetsMod.BudgetName = js.native
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.budgetsMod.MaxResults] = js.native
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * Retrieves how often the budget went into an ALARM state for the specified time period.
    */
  var TimePeriod: js.UndefOr[typingsJapgolly.awsSdk.budgetsMod.TimePeriod] = js.native
}

object DescribeBudgetPerformanceHistoryRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    MaxResults: Int | Double = null,
    NextToken: GenericString = null,
    TimePeriod: TimePeriod = null
  ): DescribeBudgetPerformanceHistoryRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryRequest]
  }
}

