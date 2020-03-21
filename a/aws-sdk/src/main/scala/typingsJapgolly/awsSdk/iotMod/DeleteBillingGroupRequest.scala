package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBillingGroupRequest extends js.Object {
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName = js.native
  /**
    * The expected version of the billing group. If the version of the billing group does not match the expected version specified in the request, the DeleteBillingGroup request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
}

object DeleteBillingGroupRequest {
  @scala.inline
  def apply(billingGroupName: BillingGroupName, expectedVersion: Int | Double = null): DeleteBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBillingGroupRequest]
  }
}

