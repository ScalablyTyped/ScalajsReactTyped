package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordlessOptions extends StObject {
  
  var forwardedFor: js.UndefOr[String] = js.undefined
}
object PasswordlessOptions {
  
  inline def apply(): PasswordlessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordlessOptions]
  }
  
  extension [Self <: PasswordlessOptions](x: Self) {
    
    inline def setForwardedFor(value: String): Self = StObject.set(x, "forwardedFor", value.asInstanceOf[js.Any])
    
    inline def setForwardedForUndefined: Self = StObject.set(x, "forwardedFor", js.undefined)
  }
}
