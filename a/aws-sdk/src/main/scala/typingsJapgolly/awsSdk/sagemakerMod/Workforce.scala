package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workforce extends js.Object {
  /**
    * The most recent date that was used to successfully add one or more IP address ranges (CIDRs) to a private workforce's allow list.
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * A list of one to four IP address ranges (CIDRs) to be added to the workforce allow list.
    */
  var SourceIpConfig: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.SourceIpConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the private workforce.
    */
  var WorkforceArn: typingsJapgolly.awsSdk.sagemakerMod.WorkforceArn = js.native
  /**
    * The name of the private workforce whose access you want to restrict. WorkforceName is automatically set to "default" when a workforce is created and cannot be modified. 
    */
  var WorkforceName: typingsJapgolly.awsSdk.sagemakerMod.WorkforceName = js.native
}

object Workforce {
  @scala.inline
  def apply(
    WorkforceArn: WorkforceArn,
    WorkforceName: WorkforceName,
    LastUpdatedDate: js.Date = null,
    SourceIpConfig: SourceIpConfig = null
  ): Workforce = {
    val __obj = js.Dynamic.literal(WorkforceArn = WorkforceArn.asInstanceOf[js.Any], WorkforceName = WorkforceName.asInstanceOf[js.Any])
    if (LastUpdatedDate != null) __obj.updateDynamic("LastUpdatedDate")(LastUpdatedDate.asInstanceOf[js.Any])
    if (SourceIpConfig != null) __obj.updateDynamic("SourceIpConfig")(SourceIpConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workforce]
  }
}

