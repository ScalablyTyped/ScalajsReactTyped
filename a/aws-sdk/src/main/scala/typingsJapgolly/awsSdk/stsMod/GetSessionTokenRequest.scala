package typingsJapgolly.awsSdk.stsMod

import typingsJapgolly.awsSdk.temporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSessionTokenRequest extends TemporaryCredentialsOptions {
  /**
    * The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions for AWS account owners are restricted to a maximum of 3,600 seconds (one hour). If the duration is longer than one hour, the session for AWS account owners defaults to one hour.
    */
  var DurationSeconds: js.UndefOr[durationSecondsType] = js.native
  /**
    * The identification number of the MFA device that is associated with the IAM user who is making the GetSessionToken call. Specify this value if the IAM user has a policy that requires MFA authentication. The value is either the serial number for a hardware device (such as GAHT12345678) or an Amazon Resource Name (ARN) for a virtual device (such as arn:aws:iam::123456789012:mfa/user). You can find the device for an IAM user by going to the AWS Management Console and viewing the user's security credentials.  The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@:/-
    */
  var SerialNumber: js.UndefOr[serialNumberType] = js.native
  /**
    * The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an MFA code, specify this value. If MFA authentication is required, the user must provide a code when requesting a set of temporary security credentials. A user who fails to provide the code receives an "access denied" response when requesting resources that require MFA authentication. The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
    */
  var TokenCode: js.UndefOr[tokenCodeType] = js.native
}

object GetSessionTokenRequest {
  @scala.inline
  def apply(
    DurationSeconds: Int | Double = null,
    SerialNumber: serialNumberType = null,
    TokenCode: tokenCodeType = null
  ): GetSessionTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (DurationSeconds != null) __obj.updateDynamic("DurationSeconds")(DurationSeconds.asInstanceOf[js.Any])
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber.asInstanceOf[js.Any])
    if (TokenCode != null) __obj.updateDynamic("TokenCode")(TokenCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionTokenRequest]
  }
}

