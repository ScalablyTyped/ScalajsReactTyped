package typingsJapgolly.coreJs

import typingsJapgolly.coreJs.core.Locale_
import typingsJapgolly.std.MapConstructor
import typingsJapgolly.std.PromiseConstructor
import typingsJapgolly.std.SetConstructor
import typingsJapgolly.std.WeakMapConstructor
import typingsJapgolly.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcore extends js.Object {
  val Array: AnonConcat = js.native
  val Date: AnonFormat = js.native
  @JSName("Dict")
  val Dict_Original: DictConstructor = js.native
  val Function: AnonBind = js.native
  val Map: MapConstructor = js.native
  val Math: AnonAsinh = js.native
  val Number: AnonAcosh = js.native
  val Object: AnonAssign = js.native
  val Promise: PromiseConstructor = js.native
  val Reflect: TypeofReflect = js.native
  val RegExp: AnonEscape = js.native
  val Set: SetConstructor = js.native
  val String: AnonAt = js.native
  val Symbol: SymbolConstructor = js.native
  val WeakMap: WeakMapConstructor = js.native
  val WeakSet: WeakSetConstructor = js.native
  @JSName("_")
  val _underscore: Boolean = js.native
  val global: js.Any = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: js.Iterable[T]): `for`[T] = js.native
  def Dict(): typingsJapgolly.coreJs.Dict[_] = js.native
  def Dict(value: js.Any): typingsJapgolly.coreJs.Dict[_] = js.native
  def Dict[T](value: typingsJapgolly.coreJs.Dict[T]): typingsJapgolly.coreJs.Dict[T] = js.native
  @JSName("Dict")
  def Dict_T[T](): Dict[T] = js.native
  def addLocale(lang: java.lang.String, locale: Locale_): /* import warning: importer.ImportType#apply Failed type conversion: typeof core */ js.Any = js.native
  def clearImmediate(handle: Double): Unit = js.native
  def delay(msec: Double): js.Promise[Unit] = js.native
  def getIterator[T](iterable: js.Iterable[T]): js.Iterator[T] = js.native
  def isIterable(value: js.Any): Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  def setImmediate(expression: js.Any, args: js.Any*): Double = js.native
  def setInterval(handler: js.Any): Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setTimeout(handler: js.Any): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
}

