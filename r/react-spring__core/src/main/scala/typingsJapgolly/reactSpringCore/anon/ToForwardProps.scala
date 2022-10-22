package typingsJapgolly.reactSpringCore.anon

import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesPropsMod.ForwardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToForwardProps[T /* <: js.Object */] extends StObject {
  
  var to: ForwardProps[T]
}
object ToForwardProps {
  
  inline def apply[T /* <: js.Object */](to: ForwardProps[T]): ToForwardProps[T] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToForwardProps[T]]
  }
  
  extension [Self <: ToForwardProps[?], T /* <: js.Object */](x: Self & ToForwardProps[T]) {
    
    inline def setTo(value: ForwardProps[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
