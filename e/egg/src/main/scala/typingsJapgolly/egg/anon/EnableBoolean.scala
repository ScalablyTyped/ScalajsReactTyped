package typingsJapgolly.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableBoolean extends StObject {
  
  var enable: Boolean
}
object EnableBoolean {
  
  inline def apply(enable: Boolean): EnableBoolean = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableBoolean]
  }
  
  extension [Self <: EnableBoolean](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
  }
}
