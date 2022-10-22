package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.anon.AwsSdkVersion
import typingsJapgolly.awsLambda.anon.ClientMetadata
import typingsJapgolly.awsLambda.anon.Code
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomEmailSender_AccountTakeOverNotification
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomEmailSender_AdminCreateUser
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomEmailSender_ForgotPassword
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomEmailSender_ResendCode
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomEmailSender_SignUp
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomEmailSender_UpdateUserAttribute
import typingsJapgolly.awsLambda.awsLambdaStrings.CustomEmailSender_VerifyUserAttribute
import typingsJapgolly.awsLambda.handlerMod.Handler
import typingsJapgolly.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerCustomEmailSenderMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.BLOCK
    - typingsJapgolly.awsLambda.awsLambdaStrings.NO_ACTION
    - typingsJapgolly.awsLambda.awsLambdaStrings.MFA
    - typingsJapgolly.awsLambda.awsLambdaStrings.MFA_IF_CONFIGURED
    - typingsJapgolly.awsLambda.awsLambdaStrings.MFA_REQUIRED
  */
  trait AccountTakeOverActionType extends StObject
  object AccountTakeOverActionType {
    
    inline def BLOCK: typingsJapgolly.awsLambda.awsLambdaStrings.BLOCK = "BLOCK".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.BLOCK]
    
    inline def MFA: typingsJapgolly.awsLambda.awsLambdaStrings.MFA = "MFA".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.MFA]
    
    inline def MFA_IF_CONFIGURED: typingsJapgolly.awsLambda.awsLambdaStrings.MFA_IF_CONFIGURED = "MFA_IF_CONFIGURED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.MFA_IF_CONFIGURED]
    
    inline def MFA_REQUIRED: typingsJapgolly.awsLambda.awsLambdaStrings.MFA_REQUIRED = "MFA_REQUIRED".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.MFA_REQUIRED]
    
    inline def NO_ACTION: typingsJapgolly.awsLambda.awsLambdaStrings.NO_ACTION = "NO_ACTION".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.NO_ACTION]
  }
  
  trait BaseCustomEmailSenderTriggerEvent[T /* <: String */]
    extends StObject
       with BaseTriggerEvent[T] {
    
    var request: ClientMetadata
  }
  object BaseCustomEmailSenderTriggerEvent {
    
    inline def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: ClientMetadata,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BaseCustomEmailSenderTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseCustomEmailSenderTriggerEvent[T]]
    }
    
    extension [Self <: BaseCustomEmailSenderTriggerEvent[?], T /* <: String */](x: Self & BaseCustomEmailSenderTriggerEvent[T]) {
      
      inline def setRequest(value: ClientMetadata): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomEmailSenderAccountTakeOverNotificationTriggerEvent
    extends StObject
       with BaseTriggerEvent[CustomEmailSender_AccountTakeOverNotification] {
    
    var request: Code
  }
  object CustomEmailSenderAccountTakeOverNotificationTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: Code,
      userName: String,
      userPoolId: String,
      version: String
    ): CustomEmailSenderAccountTakeOverNotificationTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = "CustomEmailSender_AccountTakeOverNotification", userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEmailSenderAccountTakeOverNotificationTriggerEvent]
    }
    
    extension [Self <: CustomEmailSenderAccountTakeOverNotificationTriggerEvent](x: Self) {
      
      inline def setRequest(value: Code): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomEmailSenderAccountTakeOverNotificationUserAttributes extends StObject {
    
    var ACCOUNT_TAKE_OVER_ACTION: AccountTakeOverActionType
    
    var CITY: js.UndefOr[String] = js.undefined
    
    var COUNTRY: js.UndefOr[String] = js.undefined
    
    var DEVICE_NAME: js.UndefOr[String] = js.undefined
    
    var EVENT_ID: String
    
    var FEEDBACK_TOKEN: String
    
    var IP_ADDRESS: String
    
    var LOGIN_TIME: String
    
    var ONE_CLICK_LINK_INVALID: String
    
    var ONE_CLICK_LINK_VALID: String
    
    var USER_NAME: String
  }
  object CustomEmailSenderAccountTakeOverNotificationUserAttributes {
    
    inline def apply(
      ACCOUNT_TAKE_OVER_ACTION: AccountTakeOverActionType,
      EVENT_ID: String,
      FEEDBACK_TOKEN: String,
      IP_ADDRESS: String,
      LOGIN_TIME: String,
      ONE_CLICK_LINK_INVALID: String,
      ONE_CLICK_LINK_VALID: String,
      USER_NAME: String
    ): CustomEmailSenderAccountTakeOverNotificationUserAttributes = {
      val __obj = js.Dynamic.literal(ACCOUNT_TAKE_OVER_ACTION = ACCOUNT_TAKE_OVER_ACTION.asInstanceOf[js.Any], EVENT_ID = EVENT_ID.asInstanceOf[js.Any], FEEDBACK_TOKEN = FEEDBACK_TOKEN.asInstanceOf[js.Any], IP_ADDRESS = IP_ADDRESS.asInstanceOf[js.Any], LOGIN_TIME = LOGIN_TIME.asInstanceOf[js.Any], ONE_CLICK_LINK_INVALID = ONE_CLICK_LINK_INVALID.asInstanceOf[js.Any], ONE_CLICK_LINK_VALID = ONE_CLICK_LINK_VALID.asInstanceOf[js.Any], USER_NAME = USER_NAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEmailSenderAccountTakeOverNotificationUserAttributes]
    }
    
    extension [Self <: CustomEmailSenderAccountTakeOverNotificationUserAttributes](x: Self) {
      
      inline def setACCOUNT_TAKE_OVER_ACTION(value: AccountTakeOverActionType): Self = StObject.set(x, "ACCOUNT_TAKE_OVER_ACTION", value.asInstanceOf[js.Any])
      
      inline def setCITY(value: String): Self = StObject.set(x, "CITY", value.asInstanceOf[js.Any])
      
      inline def setCITYUndefined: Self = StObject.set(x, "CITY", js.undefined)
      
      inline def setCOUNTRY(value: String): Self = StObject.set(x, "COUNTRY", value.asInstanceOf[js.Any])
      
      inline def setCOUNTRYUndefined: Self = StObject.set(x, "COUNTRY", js.undefined)
      
      inline def setDEVICE_NAME(value: String): Self = StObject.set(x, "DEVICE_NAME", value.asInstanceOf[js.Any])
      
      inline def setDEVICE_NAMEUndefined: Self = StObject.set(x, "DEVICE_NAME", js.undefined)
      
      inline def setEVENT_ID(value: String): Self = StObject.set(x, "EVENT_ID", value.asInstanceOf[js.Any])
      
      inline def setFEEDBACK_TOKEN(value: String): Self = StObject.set(x, "FEEDBACK_TOKEN", value.asInstanceOf[js.Any])
      
      inline def setIP_ADDRESS(value: String): Self = StObject.set(x, "IP_ADDRESS", value.asInstanceOf[js.Any])
      
      inline def setLOGIN_TIME(value: String): Self = StObject.set(x, "LOGIN_TIME", value.asInstanceOf[js.Any])
      
      inline def setONE_CLICK_LINK_INVALID(value: String): Self = StObject.set(x, "ONE_CLICK_LINK_INVALID", value.asInstanceOf[js.Any])
      
      inline def setONE_CLICK_LINK_VALID(value: String): Self = StObject.set(x, "ONE_CLICK_LINK_VALID", value.asInstanceOf[js.Any])
      
      inline def setUSER_NAME(value: String): Self = StObject.set(x, "USER_NAME", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomEmailSenderAdminCreateUserTriggerEvent = BaseCustomEmailSenderTriggerEvent[CustomEmailSender_AdminCreateUser]
  
  type CustomEmailSenderForgotPasswordTriggerEvent = BaseCustomEmailSenderTriggerEvent[CustomEmailSender_ForgotPassword]
  
  type CustomEmailSenderResendCodeTriggerEvent = BaseCustomEmailSenderTriggerEvent[CustomEmailSender_ResendCode]
  
  type CustomEmailSenderSignUpTriggerEvent = BaseCustomEmailSenderTriggerEvent[CustomEmailSender_SignUp]
  
  type CustomEmailSenderTriggerEvent = CustomEmailSenderSignUpTriggerEvent | CustomEmailSenderResendCodeTriggerEvent | CustomEmailSenderForgotPasswordTriggerEvent | CustomEmailSenderUpdateUserAttributeTriggerEvent | CustomEmailSenderVerifyUserAttributeTriggerEvent | CustomEmailSenderAdminCreateUserTriggerEvent | CustomEmailSenderAccountTakeOverNotificationTriggerEvent
  
  type CustomEmailSenderTriggerHandler = Handler[CustomEmailSenderTriggerEvent, Any]
  
  type CustomEmailSenderUpdateUserAttributeTriggerEvent = BaseCustomEmailSenderTriggerEvent[CustomEmailSender_UpdateUserAttribute]
  
  type CustomEmailSenderVerifyUserAttributeTriggerEvent = BaseCustomEmailSenderTriggerEvent[CustomEmailSender_VerifyUserAttribute]
}
