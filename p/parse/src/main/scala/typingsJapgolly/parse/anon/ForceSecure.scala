package typingsJapgolly.parse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceSecure extends StObject {
  
  var forceSecure: js.UndefOr[Boolean] = js.undefined
}
object ForceSecure {
  
  inline def apply(): ForceSecure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceSecure]
  }
  
  extension [Self <: ForceSecure](x: Self) {
    
    inline def setForceSecure(value: Boolean): Self = StObject.set(x, "forceSecure", value.asInstanceOf[js.Any])
    
    inline def setForceSecureUndefined: Self = StObject.set(x, "forceSecure", js.undefined)
  }
}
