package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.DeclareOpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  var `type`: DeclareOpaqueType
}
object `228` {
  
  inline def apply(): `228` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[`228`]
  }
  
  extension [Self <: `228`](x: Self) {
    
    inline def setType(value: DeclareOpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
