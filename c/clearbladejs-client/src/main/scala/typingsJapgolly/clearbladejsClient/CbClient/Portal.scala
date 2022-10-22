package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Portal extends StObject {
  
  var URI: String
  
  def fetch(callback: CbCallback): Unit
  
  var name: String
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(data: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Portal {
  
  inline def apply(
    URI: String,
    fetch: CbCallback => Callback,
    name: String,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Callback,
    user: APIUser
  ): Portal = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fetch = js.Any.fromFunction1((t0: CbCallback) => fetch(t0).runNow()), name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (update(t0, t1)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Portal]
  }
  
  extension [Self <: Portal](x: Self) {
    
    inline def setFetch(value: CbCallback => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (js.Object, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
