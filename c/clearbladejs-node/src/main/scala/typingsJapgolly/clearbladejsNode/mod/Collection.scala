package typingsJapgolly.clearbladejsNode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var URI: String
  
  def create(newItem: Item, callback: CbCallback): Unit
  
  var endpoint: String
  
  def fetch(query: QueryObj, callback: CbCallback): Unit
  
  def remove(query: Query, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Collection {
  
  inline def apply(
    URI: String,
    create: (Item, CbCallback) => Callback,
    endpoint: String,
    fetch: (QueryObj, CbCallback) => Callback,
    remove: (Query, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], create = js.Any.fromFunction2((t0: Item, t1: CbCallback) => (create(t0, t1)).runNow()), endpoint = endpoint.asInstanceOf[js.Any], fetch = js.Any.fromFunction2((t0: QueryObj, t1: CbCallback) => (fetch(t0, t1)).runNow()), remove = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (remove(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: Query, t1: js.Object, t2: CbCallback) => (update(t0, t1, t2)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setCreate(value: (Item, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Item, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setFetch(value: (QueryObj, CbCallback) => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction2((t0: QueryObj, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Query, js.Object, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: Query, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
