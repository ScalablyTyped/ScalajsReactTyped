package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.TSNullKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var `type`: TSNullKeyword
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setType(value: TSNullKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
