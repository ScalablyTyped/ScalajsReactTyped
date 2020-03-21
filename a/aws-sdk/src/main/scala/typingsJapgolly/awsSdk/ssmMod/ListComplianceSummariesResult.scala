package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceSummariesResult extends js.Object {
  /**
    * A list of compliant and non-compliant summary counts based on compliance types. For example, this call returns State Manager associations, patches, or custom compliance types according to the filter criteria that you specified.
    */
  var ComplianceSummaryItems: js.UndefOr[ComplianceSummaryItemList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.NextToken] = js.native
}

object ListComplianceSummariesResult {
  @scala.inline
  def apply(ComplianceSummaryItems: ComplianceSummaryItemList = null, NextToken: NextToken = null): ListComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummaryItems != null) __obj.updateDynamic("ComplianceSummaryItems")(ComplianceSummaryItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComplianceSummariesResult]
  }
}

