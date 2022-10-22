package typingsJapgolly.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSetting extends StObject {
  
  var authSetting: Album
}
object AuthSetting {
  
  inline def apply(authSetting: Album): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  extension [Self <: AuthSetting](x: Self) {
    
    inline def setAuthSetting(value: Album): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
