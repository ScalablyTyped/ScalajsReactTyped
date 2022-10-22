package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom[T] extends StObject {
  
  var custom: js.UndefOr[T] = js.undefined
  
  var loader: Record[String, Any]
}
object Custom {
  
  inline def apply[T](loader: Record[String, Any]): Custom[T] = {
    val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom[T]]
  }
  
  extension [Self <: Custom[?], T](x: Self & Custom[T]) {
    
    inline def setCustom(value: T): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setLoader(value: Record[String, Any]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
  }
}
