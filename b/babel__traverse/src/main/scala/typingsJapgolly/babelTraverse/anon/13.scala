package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.TupleTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var `type`: TupleTypeAnnotation
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setType(value: TupleTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
