package typingsJapgolly.coreJs

import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `for`[T] extends IterableIterator[T] {
  def array(): Array[T] = js.native
  def array[U](callbackfn: js.Function2[/* value */ T, /* key */ js.Any, U]): Array[U] = js.native
  def array[U](callbackfn: js.Function2[/* value */ T, /* key */ js.Any, U], thisArg: js.Any): Array[U] = js.native
  def filter(callbackfn: js.Function2[/* value */ T, /* key */ js.Any, Boolean]): `for`[T] = js.native
  def filter(callbackfn: js.Function2[/* value */ T, /* key */ js.Any, Boolean], thisArg: js.Any): `for`[T] = js.native
  def map[U](callbackfn: js.Function2[/* value */ T, /* key */ js.Any, U]): `for`[U] = js.native
  def map[U](callbackfn: js.Function2[/* value */ T, /* key */ js.Any, U], thisArg: js.Any): `for`[U] = js.native
  def of(callbackfn: js.Function2[/* value */ T, /* key */ js.Any, Unit]): Unit = js.native
  def of(callbackfn: js.Function2[/* value */ T, /* key */ js.Any, Unit], thisArg: js.Any): Unit = js.native
}

@JSGlobal("$for")
@js.native
object `for` extends js.Object {
  def apply[T](iterable: js.Iterable[T]): `for`[T] = js.native
}

