package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.TSOptionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  var `type`: TSOptionalType
}
object `184` {
  
  inline def apply(): `184` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[`184`]
  }
  
  extension [Self <: `184`](x: Self) {
    
    inline def setType(value: TSOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
