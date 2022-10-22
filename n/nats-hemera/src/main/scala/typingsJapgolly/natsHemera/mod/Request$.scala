package typingsJapgolly.natsHemera.mod

import typingsJapgolly.natsHemera.natsHemeraStrings.pubsub
import typingsJapgolly.natsHemera.natsHemeraStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request$ extends StObject {
  
  var id: String
  
  var `type`: pubsub | request
}
object Request$ {
  
  inline def apply(id: String, `type`: pubsub | request): Request$ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request$]
  }
  
  extension [Self <: Request$](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: pubsub | request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
