package typingsJapgolly.auth0Lock

import typingsJapgolly.auth0Lock.auth0LockStrings.error
import typingsJapgolly.auth0Lock.auth0LockStrings.info
import typingsJapgolly.auth0Lock.auth0LockStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockFlashMessageOptions extends StObject {
  
  var text: String
  
  var `type`: success | error | info
}
object Auth0LockFlashMessageOptions {
  
  inline def apply(text: String, `type`: success | error | info): Auth0LockFlashMessageOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockFlashMessageOptions]
  }
  
  extension [Self <: Auth0LockFlashMessageOptions](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: success | error | info): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
