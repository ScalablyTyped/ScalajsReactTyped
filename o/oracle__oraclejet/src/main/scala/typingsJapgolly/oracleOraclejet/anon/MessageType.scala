package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.error
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fatal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.info
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageType extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var messageType: js.UndefOr[info | error | fatal | warning] = js.undefined
  
  var visited: js.UndefOr[Boolean] = js.undefined
}
object MessageType {
  
  inline def apply(): MessageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageType]
  }
  
  extension [Self <: MessageType](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMessageType(value: info | error | fatal | warning): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
    
    inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
  }
}
