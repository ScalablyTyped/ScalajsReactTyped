package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  var `type`: Decorator
}
object `81` {
  
  inline def apply(): `81` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Decorator")
    __obj.asInstanceOf[`81`]
  }
  
  extension [Self <: `81`](x: Self) {
    
    inline def setType(value: Decorator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
