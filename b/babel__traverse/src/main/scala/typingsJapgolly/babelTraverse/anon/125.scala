package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.ObjectMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var `type`: ObjectMethod
}
object `125` {
  
  inline def apply(): `125` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[`125`]
  }
  
  extension [Self <: `125`](x: Self) {
    
    inline def setType(value: ObjectMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
