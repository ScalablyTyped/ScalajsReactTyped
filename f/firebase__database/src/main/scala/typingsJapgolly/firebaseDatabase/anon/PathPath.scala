package typingsJapgolly.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPath[T] extends StObject {
  
  var path: typingsJapgolly.firebaseDatabase.distSrcCoreUtilPathMod.Path
  
  var value: T
}
object PathPath {
  
  inline def apply[T](path: typingsJapgolly.firebaseDatabase.distSrcCoreUtilPathMod.Path, value: T): PathPath[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPath[T]]
  }
  
  extension [Self <: PathPath[?], T](x: Self & PathPath[T]) {
    
    inline def setPath(value: typingsJapgolly.firebaseDatabase.distSrcCoreUtilPathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
