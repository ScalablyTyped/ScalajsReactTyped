package typingsJapgolly.tstl

import typingsJapgolly.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/IRandomAccessIterator", JSImport.Namespace)
@js.native
object irandomaccessiteratorMod extends js.Object {
  @js.native
  trait IRandomAccessIterator[T, Iterator /* <: IRandomAccessIterator[T, Iterator] */] extends IBidirectionalIterator[T, Iterator] {
    /**
      * Advance iterator.
      *
      * @param n Step to advance.
      * @return The advanced iterator.
      */
    def advance(n: Double): Iterator = js.native
    /**
      * Get index.
      *
      * @return The index.
      */
    def index(): Double = js.native
  }
  
}

