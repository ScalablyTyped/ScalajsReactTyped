package typingsJapgolly.reactSpringRafz

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSpringRafz.distDeclarationsSrcTypesMod.VoidFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel[T /* <: VoidFn */] extends StObject {
    
    def cancel(): Unit
    
    var handler: T
  }
  object Cancel {
    
    inline def apply[T /* <: VoidFn */](cancel: Callback, handler: T): Cancel[T] = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, handler = handler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel[T]]
    }
    
    extension [Self <: Cancel[?], T /* <: VoidFn */](x: Self & Cancel[T]) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setHandler(value: T): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
}
