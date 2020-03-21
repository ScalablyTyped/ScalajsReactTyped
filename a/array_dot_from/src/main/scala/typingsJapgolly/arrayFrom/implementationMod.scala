package typingsJapgolly.arrayFrom

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array.from/implementation", JSImport.Namespace)
@js.native
object implementationMod extends js.Object {
  def apply[T](arrayLike: ArrayLike[T]): js.Array[T] = js.native
  def apply[T](iterable: Iterable[T]): js.Array[T] = js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
  def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  def apply[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): js.Array[U] = js.native
}

