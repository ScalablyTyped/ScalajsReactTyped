package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.ObjectTypeSpreadProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80` extends StObject {
  
  var `type`: ObjectTypeSpreadProperty
}
object `80` {
  
  inline def apply(): `80` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[`80`]
  }
  
  extension [Self <: `80`](x: Self) {
    
    inline def setType(value: ObjectTypeSpreadProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
