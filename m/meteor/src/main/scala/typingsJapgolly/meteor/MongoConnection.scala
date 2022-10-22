package typingsJapgolly.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoConnection extends StObject {
  
  var client: Any
  
  var db: Any
}
object MongoConnection {
  
  inline def apply(client: Any, db: Any): MongoConnection = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoConnection]
  }
  
  extension [Self <: MongoConnection](x: Self) {
    
    inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDb(value: Any): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
  }
}
