package typingsJapgolly.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Server configuration */
trait ServerConfig extends StObject {
  
  var db: String
  
  var url: String
}
object ServerConfig {
  
  inline def apply(db: String, url: String): ServerConfig = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  
  extension [Self <: ServerConfig](x: Self) {
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
