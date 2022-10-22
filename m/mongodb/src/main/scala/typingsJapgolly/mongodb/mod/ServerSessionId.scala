package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSessionId extends StObject {
  
  var id: typingsJapgolly.bson.mod.Binary
}
object ServerSessionId {
  
  inline def apply(id: typingsJapgolly.bson.mod.Binary): ServerSessionId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSessionId]
  }
  
  extension [Self <: ServerSessionId](x: Self) {
    
    inline def setId(value: typingsJapgolly.bson.mod.Binary): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
