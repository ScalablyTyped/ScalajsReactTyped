package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.AwsSdkVersion
import typingsJapgolly.awsLambda.anon.UserNotFound
import typingsJapgolly.awsLambda.awsLambdaStrings.PreAuthentication_Authentication
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerPreAuthenticationMod {
  
  trait PreAuthenticationTriggerEvent
    extends StObject
       with BaseTriggerEvent[PreAuthentication_Authentication] {
    
    var request: UserNotFound
  }
  object PreAuthenticationTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: UserNotFound,
      userName: String,
      userPoolId: String,
      version: String
    ): PreAuthenticationTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = "PreAuthentication_Authentication", userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreAuthenticationTriggerEvent]
    }
    
    extension [Self <: PreAuthenticationTriggerEvent](x: Self) {
      
      inline def setRequest(value: UserNotFound): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type PreAuthenticationTriggerHandler = Handler[PreAuthenticationTriggerEvent, Any]
}
