package typingsJapgolly.coreDashJs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/from", JSImport.Namespace)
@js.native
object fnArrayFromMod extends js.Object {
  def apply[T](arrayLike: ArrayLike[T]): Array[T] = js.native
  def apply[T](arrayLike: Iterable[T]): Array[T] = js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def apply[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
  def apply[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def apply[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
}

