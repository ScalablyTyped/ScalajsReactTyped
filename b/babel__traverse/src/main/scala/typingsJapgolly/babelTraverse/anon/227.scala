package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227` extends StObject {
  
  var `type`: FunctionTypeParam
}
object `227` {
  
  inline def apply(): `227` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[`227`]
  }
  
  extension [Self <: `227`](x: Self) {
    
    inline def setType(value: FunctionTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
