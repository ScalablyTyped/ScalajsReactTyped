package typingsJapgolly.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendTaskFailureInput extends js.Object {
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
  /**
    * The token that represents this task. Task tokens are generated by Step Functions when tasks are assigned to a worker, or in the context object when a workflow enters a task state. See GetActivityTaskOutput$taskToken.
    */
  var taskToken: TaskToken = js.native
}

object SendTaskFailureInput {
  @scala.inline
  def apply(taskToken: TaskToken, cause: SensitiveCause = null, error: SensitiveError = null): SendTaskFailureInput = {
    val __obj = js.Dynamic.literal(taskToken = taskToken.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendTaskFailureInput]
  }
}

