package typingsJapgolly.pulumiAws.inputMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderAssumeRole extends js.Object {
  var externalId: js.UndefOr[Input[String]] = js.native
  var policy: js.UndefOr[Input[String]] = js.native
  var roleArn: js.UndefOr[Input[String]] = js.native
  var sessionName: js.UndefOr[Input[String]] = js.native
}

object ProviderAssumeRole {
  @scala.inline
  def apply(
    externalId: Input[String] = null,
    policy: Input[String] = null,
    roleArn: Input[String] = null,
    sessionName: Input[String] = null
  ): ProviderAssumeRole = {
    val __obj = js.Dynamic.literal()
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (sessionName != null) __obj.updateDynamic("sessionName")(sessionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderAssumeRole]
  }
}

