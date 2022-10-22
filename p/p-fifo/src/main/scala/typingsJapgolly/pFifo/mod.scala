package typingsJapgolly.pFifo

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-fifo", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with PFifo[T] {
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def push(chunk: T): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def shift(): js.Promise[T] = js.native
  }
  
  trait PFifo[T] extends StObject {
    
    def isEmpty(): Boolean
    
    def push(chunk: T): js.Promise[Unit]
    
    def shift(): js.Promise[T]
  }
  object PFifo {
    
    inline def apply[T](isEmpty: CallbackTo[Boolean], push: T => js.Promise[Unit], shift: CallbackTo[js.Promise[T]]): PFifo[T] = {
      val __obj = js.Dynamic.literal(isEmpty = isEmpty.toJsFn, push = js.Any.fromFunction1(push), shift = shift.toJsFn)
      __obj.asInstanceOf[PFifo[T]]
    }
    
    extension [Self <: PFifo[?], T](x: Self & PFifo[T]) {
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setPush(value: T => js.Promise[Unit]): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setShift(value: CallbackTo[js.Promise[T]]): Self = StObject.set(x, "shift", value.toJsFn)
    }
  }
}
