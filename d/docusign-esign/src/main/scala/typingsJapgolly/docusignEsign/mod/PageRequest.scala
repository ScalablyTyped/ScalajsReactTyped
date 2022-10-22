package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRequest extends StObject {
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the direction the page image is rotated. The possible settings are: left or right
    */
  var rotate: js.UndefOr[String] = js.undefined
}
object PageRequest {
  
  inline def apply(): PageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageRequest]
  }
  
  extension [Self <: PageRequest](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
  }
}
