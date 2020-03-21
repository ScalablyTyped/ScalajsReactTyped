package typingsJapgolly.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionFilter extends js.Object {
  /**
    * The workflowId to pass of match the criteria of this filter.
    */
  var workflowId: WorkflowId = js.native
}

object WorkflowExecutionFilter {
  @scala.inline
  def apply(workflowId: WorkflowId): WorkflowExecutionFilter = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkflowExecutionFilter]
  }
}

