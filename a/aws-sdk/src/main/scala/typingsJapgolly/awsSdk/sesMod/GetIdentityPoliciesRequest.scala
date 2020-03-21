package typingsJapgolly.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityPoliciesRequest extends js.Object {
  /**
    * The identity for which the policies will be retrieved. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
    */
  var Identity: typingsJapgolly.awsSdk.sesMod.Identity = js.native
  /**
    * A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If you do not know the names of the policies that are attached to the identity, you can use ListIdentityPolicies.
    */
  var PolicyNames: PolicyNameList = js.native
}

object GetIdentityPoliciesRequest {
  @scala.inline
  def apply(Identity: Identity, PolicyNames: PolicyNameList): GetIdentityPoliciesRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any], PolicyNames = PolicyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIdentityPoliciesRequest]
  }
}

