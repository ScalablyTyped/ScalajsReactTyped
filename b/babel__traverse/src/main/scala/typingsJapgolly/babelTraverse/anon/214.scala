package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.IntersectionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214` extends StObject {
  
  var `type`: IntersectionTypeAnnotation
}
object `214` {
  
  inline def apply(): `214` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[`214`]
  }
  
  extension [Self <: `214`](x: Self) {
    
    inline def setType(value: IntersectionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
