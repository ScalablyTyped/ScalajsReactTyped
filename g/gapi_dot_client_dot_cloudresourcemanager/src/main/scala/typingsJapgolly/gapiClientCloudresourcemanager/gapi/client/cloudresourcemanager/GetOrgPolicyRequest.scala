package typingsJapgolly.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrgPolicyRequest extends js.Object {
  /** Name of the `Constraint` to get the `Policy`. */
  var constraint: js.UndefOr[String] = js.undefined
}

object GetOrgPolicyRequest {
  @scala.inline
  def apply(constraint: String = null): GetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrgPolicyRequest]
  }
}

