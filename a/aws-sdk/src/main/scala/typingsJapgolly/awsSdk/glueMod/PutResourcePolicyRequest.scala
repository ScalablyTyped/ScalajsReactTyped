package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyRequest extends js.Object {
  /**
    * A value of MUST_EXIST is used to update a policy. A value of NOT_EXIST is used to create a new policy. If a value of NONE or a null value is used, the call will not depend on the existence of a policy.
    */
  var PolicyExistsCondition: js.UndefOr[ExistCondition] = js.native
  /**
    * The hash value returned when the previous policy was set using PutResourcePolicy. Its purpose is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.native
  /**
    * Contains the policy document to set, in JSON format.
    */
  var PolicyInJson: PolicyJsonString = js.native
}

object PutResourcePolicyRequest {
  @scala.inline
  def apply(
    PolicyInJson: PolicyJsonString,
    PolicyExistsCondition: ExistCondition = null,
    PolicyHashCondition: HashString = null
  ): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyInJson = PolicyInJson.asInstanceOf[js.Any])
    if (PolicyExistsCondition != null) __obj.updateDynamic("PolicyExistsCondition")(PolicyExistsCondition.asInstanceOf[js.Any])
    if (PolicyHashCondition != null) __obj.updateDynamic("PolicyHashCondition")(PolicyHashCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
}

