package typingsJapgolly.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResolverRulePolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the account that you want to grant permissions to.
    */
  var Arn: typingsJapgolly.awsSdk.route53resolverMod.Arn = js.native
  /**
    * An AWS Identity and Access Management policy statement that lists the permissions that you want to grant to another AWS account.
    */
  var ResolverRulePolicy: typingsJapgolly.awsSdk.route53resolverMod.ResolverRulePolicy = js.native
}

object PutResolverRulePolicyRequest {
  @scala.inline
  def apply(Arn: Arn, ResolverRulePolicy: ResolverRulePolicy): PutResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ResolverRulePolicy = ResolverRulePolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutResolverRulePolicyRequest]
  }
}

