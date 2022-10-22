package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Triggers extends StObject {
  
  var URI: String
  
  def create(name: String, data: js.Object, callback: CbCallback): Unit
  
  def delete(name: String, callback: CbCallback): Unit
  
  def fetchDefinitions(callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(name: String, data: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Triggers {
  
  inline def apply(
    URI: String,
    create: (String, js.Object, CbCallback) => Callback,
    delete: (String, CbCallback) => Callback,
    fetchDefinitions: CbCallback => Callback,
    systemKey: String,
    systemSecret: String,
    update: (String, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Triggers = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], create = js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (create(t0, t1, t2)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: CbCallback) => (delete(t0, t1)).runNow()), fetchDefinitions = js.Any.fromFunction1((t0: CbCallback) => fetchDefinitions(t0).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (update(t0, t1, t2)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Triggers]
  }
  
  extension [Self <: Triggers](x: Self) {
    
    inline def setCreate(value: (String, js.Object, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setDelete(value: (String, CbCallback) => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setFetchDefinitions(value: CbCallback => Callback): Self = StObject.set(x, "fetchDefinitions", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (String, js.Object, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
