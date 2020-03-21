package typingsJapgolly.pulumiAws.logResourcePolicyMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogResourcePolicyArgs extends js.Object {
  /**
    * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
    */
  val policyDocument: Input[String] = js.native
  /**
    * Name of the resource policy.
    */
  val policyName: Input[String] = js.native
}

object LogResourcePolicyArgs {
  @scala.inline
  def apply(policyDocument: Input[String], policyName: Input[String]): LogResourcePolicyArgs = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogResourcePolicyArgs]
  }
}

