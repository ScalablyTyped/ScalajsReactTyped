package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var URI: String
  
  def columns(callback: CbCallback): Unit
  
  def count(query: Query, callback: CbCallback): Unit
  
  def create(newItem: Item, callback: CbCallback): Unit
  
  var endpoint: String
  
  def fetch(query: Query, callback: CbCallback): Unit
  
  var isUsingCollectionName: Boolean
  
  var name: String
  
  def remove(query: Query, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Collection {
  
  inline def apply(
    URI: String,
    columns: CbCallback => Callback,
    count: (Query, CbCallback) => Callback,
    create: (Item, CbCallback) => Callback,
    endpoint: String,
    fetch: (Query, CbCallback) => Callback,
    isUsingCollectionName: Boolean,
    name: String,
    remove: (Query, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1((t0: CbCallback) => columns(t0).runNow()), count = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (count(t0, t1)).runNow()), create = js.Any.fromFunction2((t0: Item, t1: CbCallback) => (create(t0, t1)).runNow()), endpoint = endpoint.asInstanceOf[js.Any], fetch = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (fetch(t0, t1)).runNow()), isUsingCollectionName = isUsingCollectionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (remove(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: Query, t1: js.Object, t2: CbCallback) => (update(t0, t1, t2)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setColumns(value: CbCallback => Callback): Self = StObject.set(x, "columns", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setCount(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "count", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setCreate(value: (Item, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Item, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setFetch(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setIsUsingCollectionName(value: Boolean): Self = StObject.set(x, "isUsingCollectionName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Query, js.Object, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: Query, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
