package typingsJapgolly.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdAny extends StObject {
  
  var id: Any
}
object IdAny {
  
  inline def apply(id: Any): IdAny = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAny]
  }
  
  extension [Self <: IdAny](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
