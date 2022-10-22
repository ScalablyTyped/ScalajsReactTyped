package typingsJapgolly.jsSdsl

import typingsJapgolly.jsSdsl.anon.ForEach
import typingsJapgolly.jsSdsl.anon.Length
import typingsJapgolly.jsSdsl.anon.Size
import typingsJapgolly.jsSdsl.jsSdslInts.`0`
import typingsJapgolly.jsSdsl.jsSdslInts.`1`
import typingsJapgolly.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerContainerBaseMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/ContainerBase", "Base")
  @js.native
  open class Base () extends StObject {
    
    /**
      * @description Clear the container.
      */
    def clear(): Unit = js.native
    
    /**
      * @return Boolean about if the container is empty.
      */
    def empty(): Boolean = js.native
    
    /**
      * @return The size of the container.
      */
    def size(): Double = js.native
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/ContainerBase", "Container")
  @js.native
  open class Container[T] () extends Base {
    
    /**
      * @description Using for `for...of` syntax like Array.
      */
    var `abstract`: Any = js.native
    
    /**
      * @return The last element of the container.
      */
    def back(): js.UndefOr[T] = js.native
    
    /**
      * @return Iterator pointing to the beginning element.
      */
    def begin(): ContainerIterator[T] = js.native
    
    /**
      * @return Iterator pointing to the super end like c++.
      */
    def end(): ContainerIterator[T] = js.native
    
    /**
      * @description Removes element by iterator and move `iter` to next.
      * @param iter The iterator you want to erase.
      * @example container.eraseElementByIterator(container.begin());
      */
    def eraseElementByIterator(iter: ContainerIterator[T]): ContainerIterator[T] = js.native
    
    /**
      * @description Removes the element at the specified position.
      * @param pos The element's position you want to remove.
      */
    def eraseElementByPos(pos: Double): Unit = js.native
    
    /**
      * @param element The element you want to find.
      * @return An iterator pointing to the element if found, or super end if not found.
      */
    def find(element: T): ContainerIterator[T] = js.native
    
    /**
      * @description Iterate over all elements in the container.
      * @param callback Callback function like Array.forEach.
      */
    def forEach(callback: js.Function2[/* element */ T, /* index */ Double, Unit]): Unit = js.native
    
    /**
      * @return The first element of the container.
      */
    def front(): js.UndefOr[T] = js.native
    
    /**
      * @description Gets the value of the element at the specified position.
      */
    def getElementByPos(pos: Double): T = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[T, Unit, Unit]] = js.native
    
    /**
      * @return Iterator pointing to the end element.
      */
    def rBegin(): ContainerIterator[T] = js.native
    
    /**
      * @return Iterator pointing to the super begin like c++.
      */
    def rEnd(): ContainerIterator[T] = js.native
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/ContainerBase", "ContainerIterator")
  @js.native
  /* protected */ open class ContainerIterator[T] () extends StObject {
    /* protected */ def this(iteratorType: IteratorType) = this()
    
    /**
      * @description Get a copy of itself.<br/>
      *              We do not guarantee the safety of this function.<br/>
      *              Please ensure that the iterator will not fail.
      * @return The copy of self.
      */
    def copy(): ContainerIterator[T] = js.native
    
    /**
      * @param obj The other iterator you want to compare.
      * @return Boolean about if this equals to obj.
      * @example container.find(1).equals(container.end());
      */
    def equals(obj: ContainerIterator[T]): Boolean = js.native
    
    /**
      * @description Iterator's type.
      */
    val iteratorType: IteratorType = js.native
    
    /**
      * @description Move `this` iterator to next.
      */
    def next(): this.type = js.native
    
    /**
      * @description Pointers to element.
      * @return The value of the pointer's element.
      */
    def pointer: T = js.native
    /**
      * @description Set pointer's value (some containers are unavailable).
      * @param newValue The new value you want to set.
      */
    def pointer_=(newValue: T): Unit = js.native
    
    /**
      * @description Move `this` iterator to pre.
      */
    def pre(): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsSdsl.jsSdslInts.`0`
    - typingsJapgolly.jsSdsl.jsSdslInts.`1`
  */
  trait IteratorType extends StObject
  object IteratorType {
    
    inline def NORMAL: `0` = 0.asInstanceOf[`0`]
    
    inline def REVERSE: `1` = 1.asInstanceOf[`1`]
  }
  
  type initContainer[T] = (Size & ForEach[T]) | (Length & ForEach[T]) | (typingsJapgolly.jsSdsl.anon.`0` & ForEach[T])
}
