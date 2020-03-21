package typingsJapgolly.whatwgUrl.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url", "URLSearchParams")
@js.native
class URLSearchParams protected () extends js.Object {
  def this(init: String) = this()
  def this(init: js.Array[js.Tuple2[String, String]]) = this()
  def this(init: StringDictionary[String]) = this()
  def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
  def append(name: String, value: String): Unit = js.native
  def delete(name: String): Unit = js.native
  def get(name: String): String | Null = js.native
  def getAll(name: String): js.Array[String] = js.native
  def has(name: String): Boolean = js.native
  def set(name: String, value: String): Unit = js.native
  def sort(): Unit = js.native
}

