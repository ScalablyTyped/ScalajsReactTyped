package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  var `type`: ObjectExpression
}
object `123` {
  
  inline def apply(): `123` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[`123`]
  }
  
  extension [Self <: `123`](x: Self) {
    
    inline def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
