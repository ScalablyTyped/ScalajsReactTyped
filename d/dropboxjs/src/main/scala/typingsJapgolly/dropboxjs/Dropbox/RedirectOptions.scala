package typingsJapgolly.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectOptions extends StObject {
  
  var redirectFile: js.UndefOr[String] = js.undefined
  
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  var rememberUser: js.UndefOr[Boolean] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
}
object RedirectOptions {
  
  inline def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  
  extension [Self <: RedirectOptions](x: Self) {
    
    inline def setRedirectFile(value: String): Self = StObject.set(x, "redirectFile", value.asInstanceOf[js.Any])
    
    inline def setRedirectFileUndefined: Self = StObject.set(x, "redirectFile", js.undefined)
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    inline def setRememberUser(value: Boolean): Self = StObject.set(x, "rememberUser", value.asInstanceOf[js.Any])
    
    inline def setRememberUserUndefined: Self = StObject.set(x, "rememberUser", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
