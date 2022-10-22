package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddToSetOperators[Type] extends StObject {
  
  @JSName("$each")
  var $each: js.UndefOr[js.Array[Flatten[Type]]] = js.undefined
}
object AddToSetOperators {
  
  inline def apply[Type](): AddToSetOperators[Type] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddToSetOperators[Type]]
  }
  
  extension [Self <: AddToSetOperators[?], Type](x: Self & AddToSetOperators[Type]) {
    
    inline def set$each(value: js.Array[Flatten[Type]]): Self = StObject.set(x, "$each", value.asInstanceOf[js.Any])
    
    inline def set$eachUndefined: Self = StObject.set(x, "$each", js.undefined)
    
    inline def set$eachVarargs(value: Flatten[Type]*): Self = StObject.set(x, "$each", js.Array(value*))
  }
}
