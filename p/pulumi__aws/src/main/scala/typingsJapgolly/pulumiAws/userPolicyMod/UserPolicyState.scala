package typingsJapgolly.pulumiAws.userPolicyMod

import typingsJapgolly.pulumiAws.documentsMod.PolicyDocument
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPolicyState extends js.Object {
  /**
    * The name of the policy. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * IAM user to which to attach this policy.
    */
  val user: js.UndefOr[Input[String]] = js.native
}

object UserPolicyState {
  @scala.inline
  def apply(
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    policy: Input[String | PolicyDocument] = null,
    user: Input[String] = null
  ): UserPolicyState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPolicyState]
  }
}

