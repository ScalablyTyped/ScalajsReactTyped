package typingsJapgolly.parse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthData extends StObject {
  
  var authData: js.UndefOr[typingsJapgolly.parse.mod.global.Parse.AuthData] = js.undefined
}
object AuthData {
  
  inline def apply(): AuthData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthData]
  }
  
  extension [Self <: AuthData](x: Self) {
    
    inline def setAuthData(value: typingsJapgolly.parse.mod.global.Parse.AuthData): Self = StObject.set(x, "authData", value.asInstanceOf[js.Any])
    
    inline def setAuthDataUndefined: Self = StObject.set(x, "authData", js.undefined)
  }
}
