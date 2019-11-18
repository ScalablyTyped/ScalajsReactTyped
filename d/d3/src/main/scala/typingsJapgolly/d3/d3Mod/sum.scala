package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashArray.d3DashArrayMod.Numeric
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "sum")
@js.native
object sum extends js.Object {
  def apply[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]]): Double = js.native
  def apply[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Double = js.native
}

