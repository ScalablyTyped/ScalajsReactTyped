package typingsJapgolly.mfiles

import typingsJapgolly.mfiles.MFiles.MFScheduledJobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobOutputInfo extends js.Object {
  var ID: Double
  var JobType: MFScheduledJobType
  var Message: String
}

object IScheduledJobOutputInfo {
  @scala.inline
  def apply(ID: Double, JobType: MFScheduledJobType, Message: String): IScheduledJobOutputInfo = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScheduledJobOutputInfo]
  }
}

