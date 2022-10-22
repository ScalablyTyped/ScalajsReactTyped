package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieName extends StObject {
  
  var cookieName: js.UndefOr[String] = js.undefined
  
  var headerName: js.UndefOr[String] = js.undefined
}
object CookieName {
  
  inline def apply(): CookieName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieName]
  }
  
  extension [Self <: CookieName](x: Self) {
    
    inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
    
    inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
  }
}
