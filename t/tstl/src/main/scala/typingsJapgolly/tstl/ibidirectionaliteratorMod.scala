package typingsJapgolly.tstl

import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/IBidirectionalIterator", JSImport.Namespace)
@js.native
object ibidirectionaliteratorMod extends js.Object {
  @js.native
  trait IBidirectionalIterator[T, Iterator /* <: IBidirectionalIterator[T, Iterator] */] extends IForwardIterator[T, Iterator] {
    /**
      * Get previous iterator.
      *
      * @return The previous iterator.
      */
    def prev(): Iterator = js.native
  }
  
}

