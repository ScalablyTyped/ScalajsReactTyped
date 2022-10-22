package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorTerminationHealthResponse extends StObject {
  
  /**
    * The termination health details.
    */
  var TerminationHealth: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.TerminationHealth] = js.undefined
}
object GetVoiceConnectorTerminationHealthResponse {
  
  inline def apply(): GetVoiceConnectorTerminationHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
  }
  
  extension [Self <: GetVoiceConnectorTerminationHealthResponse](x: Self) {
    
    inline def setTerminationHealth(value: TerminationHealth): Self = StObject.set(x, "TerminationHealth", value.asInstanceOf[js.Any])
    
    inline def setTerminationHealthUndefined: Self = StObject.set(x, "TerminationHealth", js.undefined)
  }
}
