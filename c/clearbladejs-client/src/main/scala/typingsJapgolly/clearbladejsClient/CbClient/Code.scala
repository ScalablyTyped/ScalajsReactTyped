package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var URI: String
  
  var callTimeout: Double
  
  def create(name: String, body: String, callback: CbCallback): Unit
  
  def delete(name: String, callback: CbCallback): Unit
  
  def execute(name: String, params: js.Object, callback: CbCallback): Unit
  
  def getAllServices(callback: CbCallback): Unit
  
  def getCompletedServices(callback: CbCallback): Unit
  
  def getFailedServices(callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(name: String, body: String, callback: CbCallback): Unit
  
  var user: APIUser
}
object Code {
  
  inline def apply(
    URI: String,
    callTimeout: Double,
    create: (String, String, CbCallback) => Callback,
    delete: (String, CbCallback) => Callback,
    execute: (String, js.Object, CbCallback) => Callback,
    getAllServices: CbCallback => Callback,
    getCompletedServices: CbCallback => Callback,
    getFailedServices: CbCallback => Callback,
    systemKey: String,
    systemSecret: String,
    update: (String, String, CbCallback) => Callback,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], create = js.Any.fromFunction3((t0: String, t1: String, t2: CbCallback) => (create(t0, t1, t2)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: CbCallback) => (delete(t0, t1)).runNow()), execute = js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (execute(t0, t1, t2)).runNow()), getAllServices = js.Any.fromFunction1((t0: CbCallback) => getAllServices(t0).runNow()), getCompletedServices = js.Any.fromFunction1((t0: CbCallback) => getCompletedServices(t0).runNow()), getFailedServices = js.Any.fromFunction1((t0: CbCallback) => getFailedServices(t0).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: String, t1: String, t2: CbCallback) => (update(t0, t1, t2)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: (String, String, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: String, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setDelete(value: (String, CbCallback) => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setExecute(value: (String, js.Object, CbCallback) => Callback): Self = StObject.set(x, "execute", js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetAllServices(value: CbCallback => Callback): Self = StObject.set(x, "getAllServices", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setGetCompletedServices(value: CbCallback => Callback): Self = StObject.set(x, "getCompletedServices", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setGetFailedServices(value: CbCallback => Callback): Self = StObject.set(x, "getFailedServices", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (String, String, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: String, t1: String, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
