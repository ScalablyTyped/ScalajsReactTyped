package typingsJapgolly.tstl

import typingsJapgolly.tstl.adaptorContainerMod.AdaptorContainer
import typingsJapgolly.tstl.vectorMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Stack", JSImport.Namespace)
@js.native
object stackMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class Stack[T] () extends AdaptorContainer[T, Vector[T], Stack[T]] {
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: Stack[T]) = this()
    /**
      * Get the last element.
      *
      * @return The last element.
      */
    def top(): T = js.native
  }
  
}

