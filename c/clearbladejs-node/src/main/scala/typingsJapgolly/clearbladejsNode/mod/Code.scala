package typingsJapgolly.clearbladejsNode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var URI: String
  
  var URIPrefix: String
  
  var callTimeout: Double
  
  def execute(name: String, params: js.Object, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  var user: APIUser
}
object Code {
  
  inline def apply(
    URI: String,
    URIPrefix: String,
    callTimeout: Double,
    execute: (String, js.Object, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], URIPrefix = URIPrefix.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], execute = js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (execute(t0, t1, t2)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: (String, js.Object, CbCallback) => Callback): Self = StObject.set(x, "execute", js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIPrefix(value: String): Self = StObject.set(x, "URIPrefix", value.asInstanceOf[js.Any])
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
