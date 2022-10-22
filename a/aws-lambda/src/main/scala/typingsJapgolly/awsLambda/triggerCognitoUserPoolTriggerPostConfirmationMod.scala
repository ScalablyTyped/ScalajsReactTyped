package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.AwsSdkVersion
import typingsJapgolly.awsLambda.anon.UserAttributes
import typingsJapgolly.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmForgotPassword
import typingsJapgolly.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmSignUp
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerPostConfirmationMod {
  
  trait BasePostConfirmationTriggerEvent[T /* <: String */]
    extends StObject
       with BaseTriggerEvent[T] {
    
    var request: UserAttributes
  }
  object BasePostConfirmationTriggerEvent {
    
    inline def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: UserAttributes,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BasePostConfirmationTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePostConfirmationTriggerEvent[T]]
    }
    
    extension [Self <: BasePostConfirmationTriggerEvent[?], T /* <: String */](x: Self & BasePostConfirmationTriggerEvent[T]) {
      
      inline def setRequest(value: UserAttributes): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type PostConfirmationConfirmForgotPassword = BasePostConfirmationTriggerEvent[PostConfirmation_ConfirmForgotPassword]
  
  type PostConfirmationConfirmSignUpTriggerEvent = BasePostConfirmationTriggerEvent[PostConfirmation_ConfirmSignUp]
  
  type PostConfirmationTriggerEvent = PostConfirmationConfirmSignUpTriggerEvent | PostConfirmationConfirmForgotPassword
  
  type PostConfirmationTriggerHandler = Handler[PostConfirmationTriggerEvent, Any]
}
