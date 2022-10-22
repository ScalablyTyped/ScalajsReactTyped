package typingsJapgolly.hapiHapi.mod

import typingsJapgolly.hapiHapi.hapiHapiBooleans.`true`
import typingsJapgolly.hapiHapi.mod.Lifecycle._ReturnValueTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth
  extends StObject
     with _ReturnValueTypes {
  
  val data: js.UndefOr[AuthenticationData] = js.undefined
  
  val error: js.UndefOr[js.Error | Null] = js.undefined
  
  val isAuth: `true`
}
object Auth {
  
  inline def apply(): Auth = {
    val __obj = js.Dynamic.literal(isAuth = true)
    __obj.asInstanceOf[Auth]
  }
  
  extension [Self <: Auth](x: Self) {
    
    inline def setData(value: AuthenticationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsAuth(value: `true`): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
  }
}
