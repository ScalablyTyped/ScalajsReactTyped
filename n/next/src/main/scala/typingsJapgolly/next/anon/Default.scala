package typingsJapgolly.next.anon

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default[P] extends StObject {
  
  var default: ComponentType[P]
}
object Default {
  
  inline def apply[P](default: ComponentType[P]): Default[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[P]]
  }
  
  extension [Self <: Default[?], P](x: Self & Default[P]) {
    
    inline def setDefault(value: ComponentType[P]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
