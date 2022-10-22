package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  def execute(name: String, params: js.Object, loggingEnabled: Boolean, callback: CbCallback): Unit
  
  def getAllServices(callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  var user: APIUser
}
object Code {
  
  inline def apply(
    execute: (String, js.Object, Boolean, CbCallback) => Callback,
    getAllServices: CbCallback => Callback,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4((t0: String, t1: js.Object, t2: Boolean, t3: CbCallback) => (execute(t0, t1, t2, t3)).runNow()), getAllServices = js.Any.fromFunction1((t0: CbCallback) => getAllServices(t0).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setExecute(value: (String, js.Object, Boolean, CbCallback) => Callback): Self = StObject.set(x, "execute", js.Any.fromFunction4((t0: String, t1: js.Object, t2: Boolean, t3: CbCallback) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetAllServices(value: CbCallback => Callback): Self = StObject.set(x, "getAllServices", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
