package typingsJapgolly.awsLambda.anon

import typingsJapgolly.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import typingsJapgolly.awsLambda.triggerCognitoUserPoolTriggerCustomEmailSenderMod.CustomEmailSenderAccountTakeOverNotificationUserAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var code: String | Null
  
  var `type`: String
  
  var userAttributes: CustomEmailSenderAccountTakeOverNotificationUserAttributes
}
object Code {
  
  inline def apply(`type`: String, userAttributes: CustomEmailSenderAccountTakeOverNotificationUserAttributes): Code = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any], code = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserAttributes(value: CustomEmailSenderAccountTakeOverNotificationUserAttributes): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}
