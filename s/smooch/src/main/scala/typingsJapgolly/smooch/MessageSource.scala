package typingsJapgolly.smooch

import typingsJapgolly.smooch.smoochStrings.slack
import typingsJapgolly.smooch.smoochStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSource extends StObject {
  
  var id: String
  
  var integrationId: String
  
  var `type`: web | slack
}
object MessageSource {
  
  inline def apply(id: String, integrationId: String, `type`: web | slack): MessageSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], integrationId = integrationId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSource]
  }
  
  extension [Self <: MessageSource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIntegrationId(value: String): Self = StObject.set(x, "integrationId", value.asInstanceOf[js.Any])
    
    inline def setType(value: web | slack): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
