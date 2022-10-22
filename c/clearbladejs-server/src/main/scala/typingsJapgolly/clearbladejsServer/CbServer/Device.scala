package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var URI: String
  
  def create(newDevice: js.Object, callback: CbCallback): Unit
  
  def delete(query: Query, callback: CbCallback): Unit
  
  def fetch(query: Query, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}
object Device {
  
  inline def apply(
    URI: String,
    create: (js.Object, CbCallback) => Callback,
    delete: (Query, CbCallback) => Callback,
    fetch: (Query, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Callback
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], create = js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (create(t0, t1)).runNow()), delete = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (delete(t0, t1)).runNow()), fetch = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (fetch(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: Query, t1: js.Object, t2: CbCallback) => (update(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setCreate(value: (js.Object, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setDelete(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setFetch(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Query, js.Object, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: Query, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
  }
}
