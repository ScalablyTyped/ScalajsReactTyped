package typingsJapgolly.seen.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Util")
@js.native
object Util extends js.Object {
  def arraysEqual[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
  def defaults[T](obj: T, opts: Partial[T], defaults: Partial[T]): Unit = js.native
  def element(elementOrId: String): HTMLElement = js.native
  def element(elementOrId: typingsJapgolly.std.HTMLElement): HTMLElement = js.native
  def uniqueId(): String = js.native
  def uniqueId(prefix: String): String = js.native
}

