package typingsJapgolly.phosphorAlgorithm

import typingsJapgolly.phosphorAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/reduce", JSImport.Namespace)
@js.native
object reduceMod extends js.Object {
  def reduce[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ T, /* value */ T, /* index */ Double, T]
  ): T = js.native
  def reduce[T, U](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ U, /* value */ T, /* index */ Double, U],
    initial: U
  ): U = js.native
}

