package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDashboardsInput extends js.Object {
  /**
    * The dashboards to be deleted. This parameter is required.
    */
  var DashboardNames: typingsJapgolly.awsSdk.cloudwatchMod.DashboardNames = js.native
}

object DeleteDashboardsInput {
  @scala.inline
  def apply(DashboardNames: DashboardNames): DeleteDashboardsInput = {
    val __obj = js.Dynamic.literal(DashboardNames = DashboardNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDashboardsInput]
  }
}

