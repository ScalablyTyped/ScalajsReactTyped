package typingsJapgolly.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var TaskArn: js.UndefOr[typingsJapgolly.awsSdk.datasyncMod.TaskArn] = js.native
}

object CreateTaskResponse {
  @scala.inline
  def apply(TaskArn: TaskArn = null): CreateTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskResponse]
  }
}

