package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var `type`: NullableTypeAnnotation
}
object `97` {
  
  inline def apply(): `97` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
