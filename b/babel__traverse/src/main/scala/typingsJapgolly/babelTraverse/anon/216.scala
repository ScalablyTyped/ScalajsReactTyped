package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.NumericLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  var `type`: NumericLiteral
}
object `216` {
  
  inline def apply(): `216` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[`216`]
  }
  
  extension [Self <: `216`](x: Self) {
    
    inline def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
