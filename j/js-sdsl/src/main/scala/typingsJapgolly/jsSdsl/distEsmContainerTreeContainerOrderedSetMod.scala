package typingsJapgolly.jsSdsl

import typingsJapgolly.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typingsJapgolly.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerTreeContainerOrderedSetMod {
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/OrderedSet", JSImport.Default)
  @js.native
  /**
    * @param container The initialization container.
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
    */
  open class default[K] () extends OrderedSet[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: Unit, cmp: Unit, enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/OrderedSet", "OrderedSetIterator")
  @js.native
  open class OrderedSetIterator[K] ()
    extends typingsJapgolly.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, Unit]
  
  @js.native
  trait OrderedSet[K]
    extends typingsJapgolly.jsSdsl.distEsmContainerTreeContainerBaseMod.default[K, Unit] {
    
    /**
      * @description Insert element to set.
      * @param _key The _key want to insert.
      * @param hint You can give an iterator hint to improve insertion efficiency.
      */
    def insert(_key: K): Unit = js.native
    def insert(_key: K, hint: OrderedSetIterator[K]): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_OrderedSet: js.Function0[Generator[K, Unit, Unit]] = js.native
    
    def union(other: OrderedSet[K]): Unit = js.native
  }
}
