package typingsJapgolly.ipp.anon

import typingsJapgolly.ipp.mod.CharacterSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detailedstatusmessage extends StObject {
  
  var `attributes-charset`: CharacterSet
  
  var `attributes-natural-language`: String
  
  var `detailed-status-message`: js.UndefOr[String] = js.undefined
  
  var `status-message`: js.UndefOr[String] = js.undefined
}
object Detailedstatusmessage {
  
  inline def apply(`attributes-charset`: CharacterSet, `attributes-natural-language`: String): Detailedstatusmessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detailedstatusmessage]
  }
  
  extension [Self <: Detailedstatusmessage](x: Self) {
    
    inline def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setDetailed-status-message`(value: String): Self = StObject.set(x, "detailed-status-message", value.asInstanceOf[js.Any])
    
    inline def `setDetailed-status-messageUndefined`: Self = StObject.set(x, "detailed-status-message", js.undefined)
    
    inline def `setStatus-message`(value: String): Self = StObject.set(x, "status-message", value.asInstanceOf[js.Any])
    
    inline def `setStatus-messageUndefined`: Self = StObject.set(x, "status-message", js.undefined)
  }
}
