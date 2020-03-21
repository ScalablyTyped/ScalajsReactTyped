package typingsJapgolly.pulumiAws.dashboardMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardArgs extends js.Object {
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
    */
  val dashboardBody: Input[String] = js.native
  /**
    * The name of the dashboard.
    */
  val dashboardName: Input[String] = js.native
}

object DashboardArgs {
  @scala.inline
  def apply(dashboardBody: Input[String], dashboardName: Input[String]): DashboardArgs = {
    val __obj = js.Dynamic.literal(dashboardBody = dashboardBody.asInstanceOf[js.Any], dashboardName = dashboardName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DashboardArgs]
  }
}

