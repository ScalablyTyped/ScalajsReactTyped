package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130` extends StObject {
  
  var `type`: StringLiteral
}
object `130` {
  
  inline def apply(): `130` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[`130`]
  }
  
  extension [Self <: `130`](x: Self) {
    
    inline def setType(value: StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
