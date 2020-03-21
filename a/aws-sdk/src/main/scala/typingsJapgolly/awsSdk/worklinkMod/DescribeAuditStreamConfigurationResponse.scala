package typingsJapgolly.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditStreamConfigurationResponse extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that will receive the audit events.
    */
  var AuditStreamArn: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.AuditStreamArn] = js.native
}

object DescribeAuditStreamConfigurationResponse {
  @scala.inline
  def apply(AuditStreamArn: AuditStreamArn = null): DescribeAuditStreamConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (AuditStreamArn != null) __obj.updateDynamic("AuditStreamArn")(AuditStreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditStreamConfigurationResponse]
  }
}

