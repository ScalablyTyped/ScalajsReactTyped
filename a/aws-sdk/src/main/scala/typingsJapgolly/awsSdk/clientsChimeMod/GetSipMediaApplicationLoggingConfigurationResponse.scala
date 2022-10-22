package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipMediaApplicationLoggingConfigurationResponse extends StObject {
  
  /**
    * The actual logging configuration.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.SipMediaApplicationLoggingConfiguration] = js.undefined
}
object GetSipMediaApplicationLoggingConfigurationResponse {
  
  inline def apply(): GetSipMediaApplicationLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationResponse]
  }
  
  extension [Self <: GetSipMediaApplicationLoggingConfigurationResponse](x: Self) {
    
    inline def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationLoggingConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
