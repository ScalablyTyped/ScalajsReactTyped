package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasFocus extends StObject {
  
  var hasFocus: Boolean
}
object HasFocus {
  
  inline def apply(hasFocus: Boolean): HasFocus = {
    val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasFocus]
  }
  
  extension [Self <: HasFocus](x: Self) {
    
    inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
  }
}
