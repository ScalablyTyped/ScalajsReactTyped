package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH
import typingsJapgolly.awsLambda.awsLambdaStrings.CUSTOM_CHALLENGE
import typingsJapgolly.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER
import typingsJapgolly.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH
import typingsJapgolly.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER
import typingsJapgolly.awsLambda.awsLambdaStrings.SMS_MFA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChallengeMetadata extends js.Object {
  var challengeMetadata: js.UndefOr[String] = js.undefined
  var challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH
  var challengeResult: Boolean
}

object AnonChallengeMetadata {
  @scala.inline
  def apply(
    challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH,
    challengeResult: Boolean,
    challengeMetadata: String = null
  ): AnonChallengeMetadata = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    if (challengeMetadata != null) __obj.updateDynamic("challengeMetadata")(challengeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChallengeMetadata]
  }
}

