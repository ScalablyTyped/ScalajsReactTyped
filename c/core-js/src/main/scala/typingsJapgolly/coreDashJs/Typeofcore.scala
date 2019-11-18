package typingsJapgolly.coreDashJs

import typingsJapgolly.coreDashJs.core.Locale
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
  val Array: Anon_A = js.native
  val Date: Anon_Date = js.native
  @JSName("Dict")
  val Dict_Original: DictConstructor = js.native
  val Function: Anon_ArgArray = js.native
  val Map: MapConstructor = js.native
  val Math: Anon_AcoshAsinh = js.native
  val Number: Anon_Acosh = js.native
  val Object: Anon_Assign = js.native
  val Promise: PromiseConstructor = js.native
  val Reflect: TypeofReflect = js.native
  val RegExp: Anon_Escape = js.native
  val Set: SetConstructor = js.native
  val String: Anon_At = js.native
  val Symbol: SymbolConstructor = js.native
  val WeakMap: WeakMapConstructor = js.native
  val WeakSet: WeakSetConstructor = js.native
  val `_`: Boolean = js.native
  val global: js.Any = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: js.Iterable[T]): typingsJapgolly.coreDashJs.$for[T] = js.native
  def Dict(): typingsJapgolly.coreDashJs.Dict[_] = js.native
  def Dict(value: js.Any): typingsJapgolly.coreDashJs.Dict[_] = js.native
  def Dict[T](value: typingsJapgolly.coreDashJs.Dict[T]): typingsJapgolly.coreDashJs.Dict[T] = js.native
  @JSName("Dict")
  def Dict_T[T](): Dict[T] = js.native
  def addLocale(lang: java.lang.String, locale: Locale): /* import warning: importer.ImportType#apply Failed type conversion: typeof core */ js.Any = js.native
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

