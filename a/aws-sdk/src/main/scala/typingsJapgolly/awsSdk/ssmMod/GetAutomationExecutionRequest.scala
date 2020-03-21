package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutomationExecutionRequest extends js.Object {
  /**
    * The unique identifier for an existing automation execution to examine. The execution ID is returned by StartAutomationExecution when the execution of an Automation document is initiated.
    */
  var AutomationExecutionId: typingsJapgolly.awsSdk.ssmMod.AutomationExecutionId = js.native
}

object GetAutomationExecutionRequest {
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId): GetAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAutomationExecutionRequest]
  }
}

