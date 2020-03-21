package typingsJapgolly.pulumiAws.inputMod.cognito

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolAdminCreateUserConfigInviteMessageTemplate extends js.Object {
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[Input[String]] = js.native
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[Input[String]] = js.native
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[Input[String]] = js.native
}

object UserPoolAdminCreateUserConfigInviteMessageTemplate {
  @scala.inline
  def apply(
    emailMessage: Input[String] = null,
    emailSubject: Input[String] = null,
    smsMessage: Input[String] = null
  ): UserPoolAdminCreateUserConfigInviteMessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage.asInstanceOf[js.Any])
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject.asInstanceOf[js.Any])
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolAdminCreateUserConfigInviteMessageTemplate]
  }
}

