package typingsJapgolly.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudFunctionsV2StateMessage extends StObject {
  
  /** The message. */
  var message: js.UndefOr[String] = js.undefined
  
  /** Severity of the state message. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** One-word CamelCase type of the state message. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudFunctionsV2StateMessage {
  
  inline def apply(): GoogleCloudFunctionsV2StateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudFunctionsV2StateMessage]
  }
  
  extension [Self <: GoogleCloudFunctionsV2StateMessage](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
