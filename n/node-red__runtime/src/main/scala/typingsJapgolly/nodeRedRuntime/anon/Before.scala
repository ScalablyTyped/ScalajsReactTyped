package typingsJapgolly.nodeRedRuntime.anon

import typingsJapgolly.nodeRedRuntime.mod.ProjectUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Before extends StObject {
  
  var before: String
  
  var id: String
  
  var limit: String
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var user: js.UndefOr[ProjectUser] = js.undefined
}
object Before {
  
  inline def apply(before: String, id: String, limit: String): Before = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
  
  extension [Self <: Before](x: Self) {
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    inline def setUser(value: ProjectUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
