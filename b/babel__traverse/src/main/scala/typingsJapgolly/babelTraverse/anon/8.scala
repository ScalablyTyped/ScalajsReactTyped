package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.InterfaceTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var `type`: InterfaceTypeAnnotation
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setType(value: InterfaceTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
