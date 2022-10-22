package typingsJapgolly.tsJest.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstTransformer[T] extends StObject {
  
  var options: js.UndefOr[T] = js.undefined
  
  var path: String
}
object AstTransformer {
  
  inline def apply[T](path: String): AstTransformer[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstTransformer[T]]
  }
  
  extension [Self <: AstTransformer[?], T](x: Self & AstTransformer[T]) {
    
    inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
