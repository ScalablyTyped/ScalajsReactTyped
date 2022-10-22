package typingsJapgolly.jsSdsl

import typingsJapgolly.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typingsJapgolly.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typingsJapgolly.jsSdsl.distEsmContainerSequentialContainerBaseRandomIteratorMod.RandomIterator
import typingsJapgolly.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerSequentialContainerDequeMod {
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/Deque", JSImport.Default)
  @js.native
  open class default[T] () extends Deque[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, _bucketSize: Double) = this()
    def this(container: initContainer[T], _bucketSize: Double) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/Deque", "DequeIterator")
  @js.native
  /* protected */ open class DequeIterator[T] () extends RandomIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
  
  @js.native
  trait Deque[T]
    extends typingsJapgolly.jsSdsl.distEsmContainerSequentialContainerBaseMod.default[T] {
    
    /**
      * @description Remove all elements after the specified position (excluding the specified position).
      * @param pos The previous position of the _first removed element.
      * @example deque.cut(1); // Then deque's size will be 2. deque -> [0, 1]
      */
    def cut(pos: Double): Unit = js.native
    
    def eraseElementByIterator(iter: DequeIterator[T]): DequeIterator[T] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Deque: js.Function0[Generator[T, Unit, Any]] = js.native
    
    /**
      * @description Remove the _first element.
      */
    def popFront(): Unit = js.native
    
    /**
      * @description Push the element to the front.
      * @param element The element you want to push.
      */
    def pushFront(element: T): Unit = js.native
    
    /**
      * @description Remove as much useless space as possible.
      */
    def shrinkToFit(): Unit = js.native
  }
}
