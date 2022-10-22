package typingsJapgolly.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redirect extends StObject {
  
  var cookies: Unit
  
  var redirect: String
}
object Redirect {
  
  inline def apply(cookies: Unit, redirect: String): Redirect = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
  
  extension [Self <: Redirect](x: Self) {
    
    inline def setCookies(value: Unit): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
  }
}
