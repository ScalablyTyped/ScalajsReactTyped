package typingsJapgolly.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  var method: String
  
  var path: String
  
  var vhost: js.UndefOr[String] = js.undefined
}
object Method {
  
  inline def apply(method: String, path: String): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  extension [Self <: Method](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
  }
}
