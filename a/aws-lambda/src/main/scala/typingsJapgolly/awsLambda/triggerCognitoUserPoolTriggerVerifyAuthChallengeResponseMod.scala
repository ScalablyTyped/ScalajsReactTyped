package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.AnswerCorrectBoolean
import typingsJapgolly.awsLambda.anon.AwsSdkVersion
import typingsJapgolly.awsLambda.anon.PrivateChallengeParameters
import typingsJapgolly.awsLambda.awsLambdaStrings.VerifyAuthChallengeResponse_Authentication
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerVerifyAuthChallengeResponseMod {
  
  trait VerifyAuthChallengeResponseTriggerEvent
    extends StObject
       with BaseTriggerEvent[VerifyAuthChallengeResponse_Authentication] {
    
    var request: PrivateChallengeParameters
    
    var response: AnswerCorrectBoolean
  }
  object VerifyAuthChallengeResponseTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: PrivateChallengeParameters,
      response: AnswerCorrectBoolean,
      userName: String,
      userPoolId: String,
      version: String
    ): VerifyAuthChallengeResponseTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = "VerifyAuthChallengeResponse_Authentication", userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyAuthChallengeResponseTriggerEvent]
    }
    
    extension [Self <: VerifyAuthChallengeResponseTriggerEvent](x: Self) {
      
      inline def setRequest(value: PrivateChallengeParameters): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: AnswerCorrectBoolean): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyAuthChallengeResponseTriggerHandler = Handler[VerifyAuthChallengeResponseTriggerEvent, Any]
}
