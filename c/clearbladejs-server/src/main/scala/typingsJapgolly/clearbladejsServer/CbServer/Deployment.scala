package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  def create(name: String, description: String, options: DeploymentOptions, callback: CbCallback): Unit
  
  def delete(name: String, callback: CbCallback): Unit
  
  def read(name: String, callback: CbCallback): Unit
  
  def readAll(query: QueryObj, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(name: String, options: DeploymentOptions, callback: CbCallback): Unit
  
  var user: APIUser
}
object Deployment {
  
  inline def apply(
    create: (String, String, DeploymentOptions, CbCallback) => Callback,
    delete: (String, CbCallback) => Callback,
    read: (String, CbCallback) => Callback,
    readAll: (QueryObj, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (String, DeploymentOptions, CbCallback) => Callback,
    user: APIUser
  ): Deployment = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4((t0: String, t1: String, t2: DeploymentOptions, t3: CbCallback) => (create(t0, t1, t2, t3)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: CbCallback) => (delete(t0, t1)).runNow()), read = js.Any.fromFunction2((t0: String, t1: CbCallback) => (read(t0, t1)).runNow()), readAll = js.Any.fromFunction2((t0: QueryObj, t1: CbCallback) => (readAll(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: String, t1: DeploymentOptions, t2: CbCallback) => (update(t0, t1, t2)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
  
  extension [Self <: Deployment](x: Self) {
    
    inline def setCreate(value: (String, String, DeploymentOptions, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction4((t0: String, t1: String, t2: DeploymentOptions, t3: CbCallback) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDelete(value: (String, CbCallback) => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setRead(value: (String, CbCallback) => Callback): Self = StObject.set(x, "read", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setReadAll(value: (QueryObj, CbCallback) => Callback): Self = StObject.set(x, "readAll", js.Any.fromFunction2((t0: QueryObj, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (String, DeploymentOptions, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: String, t1: DeploymentOptions, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
