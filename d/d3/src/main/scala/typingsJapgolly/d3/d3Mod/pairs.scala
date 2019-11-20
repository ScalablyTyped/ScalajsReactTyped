package typingsJapgolly.d3.d3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "pairs")
@js.native
object pairs extends js.Object {
  def apply[T](array: js.Iterable[T]): js.Array[js.Tuple2[T, T]] = js.native
  def apply[T, U](array: js.Iterable[T], reducer: js.Function2[/* a */ T, /* b */ T, U]): js.Array[U] = js.native
}

