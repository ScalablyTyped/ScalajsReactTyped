package typingsJapgolly.denque

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("denque", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with Denque[T] {
    def this(array: js.Array[T]) = this()
    def this(array: js.Array[T], options: IDenqueOptions) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(index: Double): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    override def peekAt(index: Double): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def peekBack(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def peekFront(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def pop(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def push(item: T): Double = js.native
    
    /* CompleteClass */
    override def remove(index: Double, count: Double): js.Array[T] = js.native
    
    /* CompleteClass */
    override def removeOne(index: Double): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def shift(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
    
    /* CompleteClass */
    override def splice(index: Double, count: Double, item: T*): js.UndefOr[js.Array[T]] = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[T] = js.native
    
    /* CompleteClass */
    override def unshift(item: T): Double = js.native
  }
  
  trait Denque[T] extends StObject {
    
    def clear(): Unit
    
    def get(index: Double): js.UndefOr[T]
    
    def isEmpty(): Boolean
    
    var length: Double
    
    def peekAt(index: Double): js.UndefOr[T]
    
    def peekBack(): js.UndefOr[T]
    
    def peekFront(): js.UndefOr[T]
    
    def pop(): js.UndefOr[T]
    
    def push(item: T): Double
    
    def remove(index: Double, count: Double): js.Array[T]
    
    def removeOne(index: Double): js.UndefOr[T]
    
    def shift(): js.UndefOr[T]
    
    def size(): Double
    
    def splice(index: Double, count: Double, item: T*): js.UndefOr[js.Array[T]]
    
    def toArray(): js.Array[T]
    
    def unshift(item: T): Double
  }
  object Denque {
    
    inline def apply[T](
      clear: Callback,
      get: Double => js.UndefOr[T],
      isEmpty: CallbackTo[Boolean],
      length: Double,
      peekAt: Double => js.UndefOr[T],
      peekBack: CallbackTo[js.UndefOr[T]],
      peekFront: CallbackTo[js.UndefOr[T]],
      pop: CallbackTo[js.UndefOr[T]],
      push: T => Double,
      remove: (Double, Double) => js.Array[T],
      removeOne: Double => js.UndefOr[T],
      shift: CallbackTo[js.UndefOr[T]],
      size: CallbackTo[Double],
      splice: (Double, Double, /* repeated */ T) => js.UndefOr[js.Array[T]],
      toArray: CallbackTo[js.Array[T]],
      unshift: T => Double
    ): Denque[T] = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, get = js.Any.fromFunction1(get), isEmpty = isEmpty.toJsFn, length = length.asInstanceOf[js.Any], peekAt = js.Any.fromFunction1(peekAt), peekBack = peekBack.toJsFn, peekFront = peekFront.toJsFn, pop = pop.toJsFn, push = js.Any.fromFunction1(push), remove = js.Any.fromFunction2(remove), removeOne = js.Any.fromFunction1(removeOne), shift = shift.toJsFn, size = size.toJsFn, splice = js.Any.fromFunction3(splice), toArray = toArray.toJsFn, unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[Denque[T]]
    }
    
    extension [Self <: Denque[?], T](x: Self & Denque[T]) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGet(value: Double => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPeekAt(value: Double => js.UndefOr[T]): Self = StObject.set(x, "peekAt", js.Any.fromFunction1(value))
      
      inline def setPeekBack(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "peekBack", value.toJsFn)
      
      inline def setPeekFront(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "peekFront", value.toJsFn)
      
      inline def setPop(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: T => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setRemove(value: (Double, Double) => js.Array[T]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveOne(value: Double => js.UndefOr[T]): Self = StObject.set(x, "removeOne", js.Any.fromFunction1(value))
      
      inline def setShift(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "shift", value.toJsFn)
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
      
      inline def setSplice(value: (Double, Double, /* repeated */ T) => js.UndefOr[js.Array[T]]): Self = StObject.set(x, "splice", js.Any.fromFunction3(value))
      
      inline def setToArray(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def setUnshift(value: T => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    }
  }
  
  trait IDenqueOptions extends StObject {
    
    var capacity: js.UndefOr[Double] = js.undefined
  }
  object IDenqueOptions {
    
    inline def apply(): IDenqueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDenqueOptions]
    }
    
    extension [Self <: IDenqueOptions](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    }
  }
}
