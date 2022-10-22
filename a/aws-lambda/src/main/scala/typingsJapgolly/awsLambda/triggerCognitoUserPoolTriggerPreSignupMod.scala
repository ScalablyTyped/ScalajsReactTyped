package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.AutoConfirmUser
import typingsJapgolly.awsLambda.anon.AwsSdkVersion
import typingsJapgolly.awsLambda.anon.ValidationData
import typingsJapgolly.awsLambda.awsLambdaStrings.PreSignUp_AdminCreateUser
import typingsJapgolly.awsLambda.awsLambdaStrings.PreSignUp_ExternalProvider
import typingsJapgolly.awsLambda.awsLambdaStrings.PreSignUp_SignUp
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerPreSignupMod {
  
  trait BasePreSignUpTriggerEvent[T /* <: String */]
    extends StObject
       with BaseTriggerEvent[T] {
    
    var request: ValidationData
    
    var response: AutoConfirmUser
  }
  object BasePreSignUpTriggerEvent {
    
    inline def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: ValidationData,
      response: AutoConfirmUser,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BasePreSignUpTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePreSignUpTriggerEvent[T]]
    }
    
    extension [Self <: BasePreSignUpTriggerEvent[?], T /* <: String */](x: Self & BasePreSignUpTriggerEvent[T]) {
      
      inline def setRequest(value: ValidationData): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: AutoConfirmUser): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type PreSignUpAdminCreateUserTriggerEvent = BasePreSignUpTriggerEvent[PreSignUp_AdminCreateUser]
  
  type PreSignUpEmailTriggerEvent = BasePreSignUpTriggerEvent[PreSignUp_SignUp]
  
  type PreSignUpExternalProviderTriggerEvent = BasePreSignUpTriggerEvent[PreSignUp_ExternalProvider]
  
  type PreSignUpTriggerEvent = PreSignUpEmailTriggerEvent | PreSignUpExternalProviderTriggerEvent | PreSignUpAdminCreateUserTriggerEvent
  
  type PreSignUpTriggerHandler = Handler[PreSignUpTriggerEvent, Any]
}
