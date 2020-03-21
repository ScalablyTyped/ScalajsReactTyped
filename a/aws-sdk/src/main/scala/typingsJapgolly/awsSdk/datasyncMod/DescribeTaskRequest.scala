package typingsJapgolly.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task to describe.
    */
  var TaskArn: typingsJapgolly.awsSdk.datasyncMod.TaskArn = js.native
}

object DescribeTaskRequest {
  @scala.inline
  def apply(TaskArn: TaskArn): DescribeTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTaskRequest]
  }
}

