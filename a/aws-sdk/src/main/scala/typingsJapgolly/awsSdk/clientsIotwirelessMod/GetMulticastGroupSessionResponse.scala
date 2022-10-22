package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMulticastGroupSessionResponse extends StObject {
  
  var LoRaWAN: js.UndefOr[LoRaWANMulticastSession] = js.undefined
}
object GetMulticastGroupSessionResponse {
  
  inline def apply(): GetMulticastGroupSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMulticastGroupSessionResponse]
  }
  
  extension [Self <: GetMulticastGroupSessionResponse](x: Self) {
    
    inline def setLoRaWAN(value: LoRaWANMulticastSession): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
  }
}
