package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetBinder[D /* <: DirectiveMeta */] extends StObject {
  
  def bind(target: Target): BoundTarget[D]
}
object TargetBinder {
  
  inline def apply[D /* <: DirectiveMeta */](bind: Target => BoundTarget[D]): TargetBinder[D] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind))
    __obj.asInstanceOf[TargetBinder[D]]
  }
  
  extension [Self <: TargetBinder[?], D /* <: DirectiveMeta */](x: Self & TargetBinder[D]) {
    
    inline def setBind(value: Target => BoundTarget[D]): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
  }
}
