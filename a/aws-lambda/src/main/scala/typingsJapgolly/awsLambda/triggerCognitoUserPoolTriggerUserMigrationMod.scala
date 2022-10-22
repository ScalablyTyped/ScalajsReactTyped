package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.AwsSdkVersion
import typingsJapgolly.awsLambda.anon.DesiredDeliveryMediums
import typingsJapgolly.awsLambda.anon.Password
import typingsJapgolly.awsLambda.awsLambdaStrings.UserMigration_Authentication
import typingsJapgolly.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerUserMigrationMod {
  
  trait BaseUserMigrationTriggerEvent[T /* <: String */]
    extends StObject
       with BaseTriggerEvent[T] {
    
    var request: Password
    
    var response: DesiredDeliveryMediums
  }
  object BaseUserMigrationTriggerEvent {
    
    inline def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: Password,
      response: DesiredDeliveryMediums,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BaseUserMigrationTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUserMigrationTriggerEvent[T]]
    }
    
    extension [Self <: BaseUserMigrationTriggerEvent[?], T /* <: String */](x: Self & BaseUserMigrationTriggerEvent[T]) {
      
      inline def setRequest(value: Password): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: DesiredDeliveryMediums): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type UserMigrationAuthenticationTriggerEvent = BaseUserMigrationTriggerEvent[UserMigration_Authentication]
  
  type UserMigrationForgotPasswordTriggerEvent = BaseUserMigrationTriggerEvent[UserMigration_ForgotPassword]
  
  type UserMigrationTriggerEvent = UserMigrationAuthenticationTriggerEvent | UserMigrationForgotPasswordTriggerEvent
  
  type UserMigrationTriggerHandler = Handler[UserMigrationTriggerEvent, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.UNCONFIRMED
    - typingsJapgolly.awsLambda.awsLambdaStrings.CONFIRMED
    - typingsJapgolly.awsLambda.awsLambdaStrings.ARCHIVED
    - typingsJapgolly.awsLambda.awsLambdaStrings.COMPROMISED
    - typingsJapgolly.awsLambda.awsLambdaStrings.UNKNOWN
    - typingsJapgolly.awsLambda.awsLambdaStrings.RESET_REQUIRED
    - typingsJapgolly.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD
  */
  trait UserStatus extends StObject
  object UserStatus {
    
    inline def ARCHIVED: typingsJapgolly.awsLambda.awsLambdaStrings.ARCHIVED = "ARCHIVED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.ARCHIVED]
    
    inline def COMPROMISED: typingsJapgolly.awsLambda.awsLambdaStrings.COMPROMISED = "COMPROMISED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.COMPROMISED]
    
    inline def CONFIRMED: typingsJapgolly.awsLambda.awsLambdaStrings.CONFIRMED = "CONFIRMED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CONFIRMED]
    
    inline def FORCE_CHANGE_PASSWORD: typingsJapgolly.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD]
    
    inline def RESET_REQUIRED: typingsJapgolly.awsLambda.awsLambdaStrings.RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.RESET_REQUIRED]
    
    inline def UNCONFIRMED: typingsJapgolly.awsLambda.awsLambdaStrings.UNCONFIRMED = "UNCONFIRMED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.UNCONFIRMED]
    
    inline def UNKNOWN: typingsJapgolly.awsLambda.awsLambdaStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.UNKNOWN]
  }
}
