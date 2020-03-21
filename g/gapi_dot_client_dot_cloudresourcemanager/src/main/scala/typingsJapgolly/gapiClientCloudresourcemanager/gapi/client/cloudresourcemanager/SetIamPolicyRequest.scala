package typingsJapgolly.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIamPolicyRequest extends js.Object {
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size of
    * the policy is limited to a few 10s of KB. An empty policy is a
    * valid policy but certain Cloud Platform services (such as Projects)
    * might reject them.
    */
  var policy: js.UndefOr[Policy] = js.undefined
  /**
    * OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only
    * the fields in the mask will be modified. If no mask is provided, the
    * following default mask is used:
    * paths: "bindings, etag"
    * This field is only used by Cloud IAM.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}

object SetIamPolicyRequest {
  @scala.inline
  def apply(policy: Policy = null, updateMask: String = null): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
}

