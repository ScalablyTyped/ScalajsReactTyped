package typingsJapgolly.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskExecutionsRequest extends js.Object {
  /**
    * The maximum number of executed tasks to list.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.datasyncMod.MaxResults] = js.native
  /**
    * An opaque string that indicates the position at which to begin the next list of the executed tasks.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
    */
  var TaskArn: js.UndefOr[typingsJapgolly.awsSdk.datasyncMod.TaskArn] = js.native
}

object ListTaskExecutionsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null, TaskArn: TaskArn = null): ListTaskExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTaskExecutionsRequest]
  }
}

