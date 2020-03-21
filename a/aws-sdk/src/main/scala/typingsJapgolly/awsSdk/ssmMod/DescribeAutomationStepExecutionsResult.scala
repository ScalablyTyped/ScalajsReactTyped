package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutomationStepExecutionsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.NextToken] = js.native
  /**
    * A list of details about the current state of all steps that make up an execution.
    */
  var StepExecutions: js.UndefOr[StepExecutionList] = js.native
}

object DescribeAutomationStepExecutionsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, StepExecutions: StepExecutionList = null): DescribeAutomationStepExecutionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StepExecutions != null) __obj.updateDynamic("StepExecutions")(StepExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutomationStepExecutionsResult]
  }
}

