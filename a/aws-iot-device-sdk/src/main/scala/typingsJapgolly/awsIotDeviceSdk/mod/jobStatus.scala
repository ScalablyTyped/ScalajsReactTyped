package typingsJapgolly.awsIotDeviceSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jobStatus extends js.Object {
  var status: String
  var statusDetails: typingsJapgolly.awsIotDeviceSdk.mod.statusDetails
}

object jobStatus {
  @scala.inline
  def apply(status: String, statusDetails: statusDetails): jobStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusDetails = statusDetails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[jobStatus]
  }
}

