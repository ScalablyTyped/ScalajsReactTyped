package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.NewExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var `type`: NewExpression
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setType(value: NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
