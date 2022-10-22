package typingsJapgolly.awsLambda.anon

import typingsJapgolly.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH
import typingsJapgolly.awsLambda.awsLambdaStrings.CUSTOM_CHALLENGE
import typingsJapgolly.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER
import typingsJapgolly.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH
import typingsJapgolly.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER
import typingsJapgolly.awsLambda.awsLambdaStrings.SMS_MFA
import typingsJapgolly.awsLambda.awsLambdaStrings.SRP_A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeResult extends StObject {
  
  var challengeMetadata: js.UndefOr[String] = js.undefined
  
  var challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A
  
  var challengeResult: Boolean
}
object ChallengeResult {
  
  inline def apply(
    challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A,
    challengeResult: Boolean
  ): ChallengeResult = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeResult]
  }
  
  extension [Self <: ChallengeResult](x: Self) {
    
    inline def setChallengeMetadata(value: String): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
    
    inline def setChallengeMetadataUndefined: Self = StObject.set(x, "challengeMetadata", js.undefined)
    
    inline def setChallengeName(
      value: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A
    ): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
    
    inline def setChallengeResult(value: Boolean): Self = StObject.set(x, "challengeResult", value.asInstanceOf[js.Any])
  }
}
