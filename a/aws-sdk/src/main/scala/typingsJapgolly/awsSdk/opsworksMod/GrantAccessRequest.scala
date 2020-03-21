package typingsJapgolly.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantAccessRequest extends js.Object {
  /**
    * The instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: String = js.native
  /**
    * The length of time (in minutes) that the grant is valid. When the grant expires at the end of this period, the user will no longer be able to use the credentials to log in. If the user is logged in at the time, he or she automatically will be logged out.
    */
  var ValidForInMinutes: js.UndefOr[typingsJapgolly.awsSdk.opsworksMod.ValidForInMinutes] = js.native
}

object GrantAccessRequest {
  @scala.inline
  def apply(InstanceId: String, ValidForInMinutes: Int | scala.Double = null): GrantAccessRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (ValidForInMinutes != null) __obj.updateDynamic("ValidForInMinutes")(ValidForInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantAccessRequest]
  }
}

