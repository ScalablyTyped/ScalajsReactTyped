package typingsJapgolly.fastFifo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-fifo", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with FastFIFO[T] {
    def this(hwm: Double) = this()
    
    /* CompleteClass */
    var head: typingsJapgolly.fastFifo.fixedSizeMod.^[T] = js.native
    
    /* CompleteClass */
    var hwm: Double = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def push(`val`: T): Unit = js.native
    
    /* CompleteClass */
    override def shift(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    var tail: typingsJapgolly.fastFifo.fixedSizeMod.^[T] = js.native
  }
  
  trait FastFIFO[T] extends StObject {
    
    var head: typingsJapgolly.fastFifo.fixedSizeMod.^[T]
    
    var hwm: Double
    
    def isEmpty(): Boolean
    
    def push(`val`: T): Unit
    
    def shift(): js.UndefOr[T]
    
    var tail: typingsJapgolly.fastFifo.fixedSizeMod.^[T]
  }
  object FastFIFO {
    
    inline def apply[T](
      head: typingsJapgolly.fastFifo.fixedSizeMod.^[T],
      hwm: Double,
      isEmpty: CallbackTo[Boolean],
      push: T => Callback,
      shift: CallbackTo[js.UndefOr[T]],
      tail: typingsJapgolly.fastFifo.fixedSizeMod.^[T]
    ): FastFIFO[T] = {
      val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], hwm = hwm.asInstanceOf[js.Any], isEmpty = isEmpty.toJsFn, push = js.Any.fromFunction1((t0: T) => push(t0).runNow()), shift = shift.toJsFn, tail = tail.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastFIFO[T]]
    }
    
    extension [Self <: FastFIFO[?], T](x: Self & FastFIFO[T]) {
      
      inline def setHead(value: typingsJapgolly.fastFifo.fixedSizeMod.^[T]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHwm(value: Double): Self = StObject.set(x, "hwm", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setPush(value: T => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setShift(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "shift", value.toJsFn)
      
      inline def setTail(value: typingsJapgolly.fastFifo.fixedSizeMod.^[T]): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    }
  }
}
