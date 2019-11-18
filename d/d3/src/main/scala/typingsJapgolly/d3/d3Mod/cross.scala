package typingsJapgolly.d3.d3Mod

import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "cross")
@js.native
object cross extends js.Object {
  def apply[S, T](a: Iterable[S], b: Iterable[T]): js.Array[js.Tuple2[S, T]] = js.native
  def apply[S, T, U](a: Iterable[S], b: Iterable[T], reducer: js.Function2[/* a */ S, /* b */ T, U]): js.Array[U] = js.native
}

