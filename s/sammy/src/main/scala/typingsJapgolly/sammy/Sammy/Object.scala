package typingsJapgolly.sammy.Sammy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sammy.Object")
@js.native
class Object protected () extends js.Object {
  def this(obj: js.Any) = this()
  def escapeHTML(s: String): String = js.native
  def h(s: String): String = js.native
  def has(key: String): Boolean = js.native
  def join(args: js.Any*): String = js.native
  def keys(): js.Array[String] = js.native
  def keys(attributes_only: Boolean): js.Array[String] = js.native
  def log(args: js.Any*): Unit = js.native
  def toHTML(): String = js.native
  def toHash(): js.Any = js.native
  def toString(include_functions: Boolean): String = js.native
}

