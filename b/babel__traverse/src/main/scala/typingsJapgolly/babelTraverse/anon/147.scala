package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.ModuleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  var `type`: ModuleExpression
}
object `147` {
  
  inline def apply(): `147` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[`147`]
  }
  
  extension [Self <: `147`](x: Self) {
    
    inline def setType(value: ModuleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
