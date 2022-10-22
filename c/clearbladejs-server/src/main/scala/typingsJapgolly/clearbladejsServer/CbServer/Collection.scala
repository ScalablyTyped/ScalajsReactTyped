package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var URI: String
  
  def addColumn(options: js.Object, callback: CbCallback): Unit
  
  def columns(callback: CbCallback): Unit
  
  def count(query: Query, callback: CbCallback): Unit
  
  def create(newItem: Item, callback: CbCallback): Unit
  
  def deleteCollection(callback: CbCallback): Unit
  
  def dropColumn(name: String, callback: CbCallback): Unit
  
  def fetch(query: Query, callback: CbCallback): Unit
  
  def remove(query: Query, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Collection {
  
  inline def apply(
    URI: String,
    addColumn: (js.Object, CbCallback) => Callback,
    columns: CbCallback => Callback,
    count: (Query, CbCallback) => Callback,
    create: (Item, CbCallback) => Callback,
    deleteCollection: CbCallback => Callback,
    dropColumn: (String, CbCallback) => Callback,
    fetch: (Query, CbCallback) => Callback,
    remove: (Query, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], addColumn = js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (addColumn(t0, t1)).runNow()), columns = js.Any.fromFunction1((t0: CbCallback) => columns(t0).runNow()), count = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (count(t0, t1)).runNow()), create = js.Any.fromFunction2((t0: Item, t1: CbCallback) => (create(t0, t1)).runNow()), deleteCollection = js.Any.fromFunction1((t0: CbCallback) => deleteCollection(t0).runNow()), dropColumn = js.Any.fromFunction2((t0: String, t1: CbCallback) => (dropColumn(t0, t1)).runNow()), fetch = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (fetch(t0, t1)).runNow()), remove = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (remove(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: Query, t1: js.Object, t2: CbCallback) => (update(t0, t1, t2)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setAddColumn(value: (js.Object, CbCallback) => Callback): Self = StObject.set(x, "addColumn", js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setColumns(value: CbCallback => Callback): Self = StObject.set(x, "columns", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setCount(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "count", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setCreate(value: (Item, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Item, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setDeleteCollection(value: CbCallback => Callback): Self = StObject.set(x, "deleteCollection", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setDropColumn(value: (String, CbCallback) => Callback): Self = StObject.set(x, "dropColumn", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setFetch(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Query, js.Object, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: Query, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
