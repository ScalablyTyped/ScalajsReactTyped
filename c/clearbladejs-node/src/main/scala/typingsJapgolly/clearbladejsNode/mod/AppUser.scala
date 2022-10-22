package typingsJapgolly.clearbladejsNode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppUser extends StObject {
  
  var URI: String
  
  def allUsers(query: Query, callback: CbCallback): Unit
  
  def getUser(callback: CbCallback): Unit
  
  def setUser(data: js.Object, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  var user: APIUser
}
object AppUser {
  
  inline def apply(
    URI: String,
    allUsers: (Query, CbCallback) => Callback,
    getUser: CbCallback => Callback,
    setUser: (js.Object, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): AppUser = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], allUsers = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (allUsers(t0, t1)).runNow()), getUser = js.Any.fromFunction1((t0: CbCallback) => getUser(t0).runNow()), setUser = js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (setUser(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUser]
  }
  
  extension [Self <: AppUser](x: Self) {
    
    inline def setAllUsers(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "allUsers", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setGetUser(value: CbCallback => Callback): Self = StObject.set(x, "getUser", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setSetUser(value: (js.Object, CbCallback) => Callback): Self = StObject.set(x, "setUser", js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
