package typingsJapgolly.stremioAddonSdk.anon

import typingsJapgolly.stremioAddonSdk.mod.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var `type`: ContentType
}
object Id {
  
  inline def apply(id: String, `type`: ContentType): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
