package typingsJapgolly.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsLogGroupRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
}

object ListTagsLogGroupRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): ListTagsLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsLogGroupRequest]
  }
}

