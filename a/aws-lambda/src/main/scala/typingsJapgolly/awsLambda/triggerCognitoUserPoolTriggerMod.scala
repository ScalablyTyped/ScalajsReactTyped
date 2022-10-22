package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.AnswerCorrect
import typingsJapgolly.awsLambda.anon.AwsSdkVersion
import typingsJapgolly.awsLambda.anon.ChallengeAnswer
import typingsJapgolly.awsLambda.awsLambdaStrings.CreateAuthChallenge_Authentication
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomMessage_AdminCreateUser
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomMessage_Authentication
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomMessage_ForgotPassword
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomMessage_ResendCode
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomMessage_SignUp
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomMessage_UpdateUserAttribute
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomMessage_VerifyUserAttribute
import typingsJapgolly.awsLambda.awsLambdaStrings.DefineAuthChallenge_Authentication
import typingsJapgolly.awsLambda.awsLambdaStrings.PostAuthentication_Authentication
import typingsJapgolly.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmForgotPassword
import typingsJapgolly.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmSignUp
import typingsJapgolly.awsLambda.awsLambdaStrings.PreAuthentication_Authentication
import typingsJapgolly.awsLambda.awsLambdaStrings.PreSignUp_AdminCreateUser
import typingsJapgolly.awsLambda.awsLambdaStrings.PreSignUp_ExternalProvider
import typingsJapgolly.awsLambda.awsLambdaStrings.PreSignUp_SignUp
import typingsJapgolly.awsLambda.awsLambdaStrings.TokenGeneration_AuthenticateDevice
import typingsJapgolly.awsLambda.awsLambdaStrings.TokenGeneration_Authentication
import typingsJapgolly.awsLambda.awsLambdaStrings.TokenGeneration_HostedAuth
import typingsJapgolly.awsLambda.awsLambdaStrings.TokenGeneration_NewPasswordChallenge
import typingsJapgolly.awsLambda.awsLambdaStrings.TokenGeneration_RefreshTokens
import typingsJapgolly.awsLambda.awsLambdaStrings.UserMigration_Authentication
import typingsJapgolly.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword
import typingsJapgolly.awsLambda.awsLambdaStrings.VerifyAuthChallengeResponse_Authentication
import typingsJapgolly.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerMod {
  
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  
  trait CognitoUserPoolTriggerEvent extends StObject {
    
    var callerContext: AwsSdkVersion
    
    var region: String
    
    var request: ChallengeAnswer
    
    var response: AnswerCorrect
    
    var triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword
    
    var userName: js.UndefOr[String] = js.undefined
    
    var userPoolId: String
    
    var version: Double
  }
  object CognitoUserPoolTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: ChallengeAnswer,
      response: AnswerCorrect,
      triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword,
      userPoolId: String,
      version: Double
    ): CognitoUserPoolTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoUserPoolTriggerEvent]
    }
    
    extension [Self <: CognitoUserPoolTriggerEvent](x: Self) {
      
      inline def setCallerContext(value: AwsSdkVersion): Self = StObject.set(x, "callerContext", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: ChallengeAnswer): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: AnswerCorrect): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setTriggerSource(
        value: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword
      ): Self = StObject.set(x, "triggerSource", value.asInstanceOf[js.Any])
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
      
      inline def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type CognitoUserPoolTriggerHandler = Handler[CognitoUserPoolTriggerEvent, Any]
}
