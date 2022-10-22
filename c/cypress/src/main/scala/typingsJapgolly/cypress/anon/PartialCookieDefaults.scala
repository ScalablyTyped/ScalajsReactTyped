package typingsJapgolly.cypress.anon

import typingsJapgolly.cypress.Cypress.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.CookieDefaults> */
trait PartialCookieDefaults extends StObject {
  
  var preserve: js.UndefOr[
    String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ Cookie, Boolean])
  ] = js.undefined
}
object PartialCookieDefaults {
  
  inline def apply(): PartialCookieDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCookieDefaults]
  }
  
  extension [Self <: PartialCookieDefaults](x: Self) {
    
    inline def setPreserve(value: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ Cookie, Boolean])): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    
    inline def setPreserveFunction1(value: /* cookie */ Cookie => Boolean): Self = StObject.set(x, "preserve", js.Any.fromFunction1(value))
    
    inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    
    inline def setPreserveVarargs(value: String*): Self = StObject.set(x, "preserve", js.Array(value*))
  }
}
