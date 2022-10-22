package typingsJapgolly.numberAllocator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("number-allocator", "NumberAllocator")
  @js.native
  open class NumberAllocator protected ()
    extends typingsJapgolly.numberAllocator.typesLibNumberAllocatorMod.NumberAllocator {
    /**
      * NumberAllocator constructor.
      * The all numbers are set to vacant status.
      * Time Complexity O(1)
      * @constructor
      * @param {number} min  - The maximum number of allocatable. The number must be integer.
      * @param {number} maxh - The minimum number of allocatable. The number must be integer.
      */
    def this(min: Double, max: Double) = this()
  }
}
