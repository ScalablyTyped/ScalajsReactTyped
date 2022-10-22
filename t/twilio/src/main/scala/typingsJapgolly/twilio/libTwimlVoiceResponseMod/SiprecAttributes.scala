package typingsJapgolly.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiprecAttributes extends StObject {
  
  var connectorName: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var track: js.UndefOr[SiprecTrack] = js.undefined
}
object SiprecAttributes {
  
  inline def apply(): SiprecAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiprecAttributes]
  }
  
  extension [Self <: SiprecAttributes](x: Self) {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTrack(value: SiprecTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
