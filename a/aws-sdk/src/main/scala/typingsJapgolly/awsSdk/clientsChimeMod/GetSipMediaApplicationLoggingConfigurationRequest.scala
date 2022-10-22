package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipMediaApplicationLoggingConfigurationRequest extends StObject {
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString
}
object GetSipMediaApplicationLoggingConfigurationRequest {
  
  inline def apply(SipMediaApplicationId: NonEmptyString): GetSipMediaApplicationLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationRequest]
  }
  
  extension [Self <: GetSipMediaApplicationLoggingConfigurationRequest](x: Self) {
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
