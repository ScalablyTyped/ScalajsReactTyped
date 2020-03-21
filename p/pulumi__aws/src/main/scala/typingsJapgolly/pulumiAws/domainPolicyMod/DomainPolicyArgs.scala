package typingsJapgolly.pulumiAws.domainPolicyMod

import typingsJapgolly.pulumiAws.documentsMod.PolicyDocument
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainPolicyArgs extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: Input[String | PolicyDocument] = js.native
  /**
    * Name of the domain.
    */
  val domainName: Input[String] = js.native
}

object DomainPolicyArgs {
  @scala.inline
  def apply(accessPolicies: Input[String | PolicyDocument], domainName: Input[String]): DomainPolicyArgs = {
    val __obj = js.Dynamic.literal(accessPolicies = accessPolicies.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainPolicyArgs]
  }
}

