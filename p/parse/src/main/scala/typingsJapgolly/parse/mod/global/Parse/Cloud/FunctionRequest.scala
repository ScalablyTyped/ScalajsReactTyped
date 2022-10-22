package typingsJapgolly.parse.mod.global.Parse.Cloud

import typingsJapgolly.parse.mod.global.Parse.Attributes
import typingsJapgolly.parse.mod.global.Parse.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionRequest[T /* <: Params */] extends StObject {
  
  var installationId: js.UndefOr[String] = js.undefined
  
  var master: js.UndefOr[Boolean] = js.undefined
  
  var params: T
  
  var user: js.UndefOr[User[Attributes]] = js.undefined
}
object FunctionRequest {
  
  inline def apply[T /* <: Params */](params: T): FunctionRequest[T] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionRequest[T]]
  }
  
  extension [Self <: FunctionRequest[?], T /* <: Params */](x: Self & FunctionRequest[T]) {
    
    inline def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    inline def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    inline def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User[Attributes]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
