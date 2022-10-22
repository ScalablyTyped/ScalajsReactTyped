package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var URI: String
  
  def columns(callback: CbCallback): Unit
  
  def count(query: Query, callback: CbCallback): Unit
  
  def create(newDevice: js.Object, callback: CbCallback): Unit
  
  def delete(query: Query, callback: CbCallback): Unit
  
  def deleteDeviceByName(name: String, callback: CbCallback): Unit
  
  def fetch(query: Query, callback: CbCallback): Unit
  
  def getDeviceByName(name: String, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(query: Query, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit
  
  def updateDeviceByName(name: String, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit
  
  var user: APIUser
}
object Device {
  
  inline def apply(
    URI: String,
    columns: CbCallback => Callback,
    count: (Query, CbCallback) => Callback,
    create: (js.Object, CbCallback) => Callback,
    delete: (Query, CbCallback) => Callback,
    deleteDeviceByName: (String, CbCallback) => Callback,
    fetch: (Query, CbCallback) => Callback,
    getDeviceByName: (String, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, Boolean, CbCallback) => Callback,
    updateDeviceByName: (String, js.Object, Boolean, CbCallback) => Callback,
    user: APIUser
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1((t0: CbCallback) => columns(t0).runNow()), count = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (count(t0, t1)).runNow()), create = js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (create(t0, t1)).runNow()), delete = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (delete(t0, t1)).runNow()), deleteDeviceByName = js.Any.fromFunction2((t0: String, t1: CbCallback) => (deleteDeviceByName(t0, t1)).runNow()), fetch = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (fetch(t0, t1)).runNow()), getDeviceByName = js.Any.fromFunction2((t0: String, t1: CbCallback) => (getDeviceByName(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction4((t0: Query, t1: js.Object, t2: Boolean, t3: CbCallback) => (update(t0, t1, t2, t3)).runNow()), updateDeviceByName = js.Any.fromFunction4((t0: String, t1: js.Object, t2: Boolean, t3: CbCallback) => (updateDeviceByName(t0, t1, t2, t3)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setColumns(value: CbCallback => Callback): Self = StObject.set(x, "columns", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setCount(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "count", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setCreate(value: (js.Object, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setDelete(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setDeleteDeviceByName(value: (String, CbCallback) => Callback): Self = StObject.set(x, "deleteDeviceByName", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setFetch(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setGetDeviceByName(value: (String, CbCallback) => Callback): Self = StObject.set(x, "getDeviceByName", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Query, js.Object, Boolean, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction4((t0: Query, t1: js.Object, t2: Boolean, t3: CbCallback) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUpdateDeviceByName(value: (String, js.Object, Boolean, CbCallback) => Callback): Self = StObject.set(x, "updateDeviceByName", js.Any.fromFunction4((t0: String, t1: js.Object, t2: Boolean, t3: CbCallback) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
