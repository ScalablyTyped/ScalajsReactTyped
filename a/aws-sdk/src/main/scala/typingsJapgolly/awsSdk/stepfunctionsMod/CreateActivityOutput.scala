package typingsJapgolly.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateActivityOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the created activity.
    */
  var activityArn: Arn = js.native
  /**
    * The date the activity is created.
    */
  var creationDate: js.Date = js.native
}

object CreateActivityOutput {
  @scala.inline
  def apply(activityArn: Arn, creationDate: js.Date): CreateActivityOutput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateActivityOutput]
  }
}

