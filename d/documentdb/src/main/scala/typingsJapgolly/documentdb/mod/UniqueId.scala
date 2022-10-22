package typingsJapgolly.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueId extends StObject {
  
  /** The user-defined unique identifier for a document or other DocumentDB object (database, collection, procedure...) */
  var id: String
}
object UniqueId {
  
  inline def apply(id: String): UniqueId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueId]
  }
  
  extension [Self <: UniqueId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
