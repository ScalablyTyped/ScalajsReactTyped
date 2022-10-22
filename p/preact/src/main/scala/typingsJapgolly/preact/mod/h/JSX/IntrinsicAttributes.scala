package typingsJapgolly.preact.mod.h.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrinsicAttributes extends StObject {
  
  var key: js.UndefOr[Any] = js.undefined
}
object IntrinsicAttributes {
  
  inline def apply(): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicAttributes]
  }
  
  extension [Self <: IntrinsicAttributes](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
