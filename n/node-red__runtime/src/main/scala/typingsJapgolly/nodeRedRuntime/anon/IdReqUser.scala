package typingsJapgolly.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdReqUser extends StObject {
  
  var id: String
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var user: js.UndefOr[typingsJapgolly.nodeRedRuntime.mod.User] = js.undefined
}
object IdReqUser {
  
  inline def apply(id: String): IdReqUser = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdReqUser]
  }
  
  extension [Self <: IdReqUser](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    inline def setUser(value: typingsJapgolly.nodeRedRuntime.mod.User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
