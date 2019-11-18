package typingsJapgolly.node.urlMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "URLSearchParams")
@js.native
class URLSearchParams ()
  extends Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[js.Tuple2[java.lang.String, java.lang.String]]) = this()
  def this(init: StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]) = this()
  def this(init: URLSearchParams) = this()
  def this(init: js.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_URLSearchParams: js.Function0[IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  def delete(name: java.lang.String): Unit = js.native
  def entries(): IterableIterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def forEach(
    callback: js.Function3[
      /* value */ java.lang.String, 
      /* name */ java.lang.String, 
      /* searchParams */ this.type, 
      Unit
    ]
  ): Unit = js.native
  def get(name: java.lang.String): java.lang.String | Null = js.native
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  def has(name: java.lang.String): Boolean = js.native
  def keys(): IterableIterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: java.lang.String): Unit = js.native
  def sort(): Unit = js.native
  def values(): IterableIterator[java.lang.String] = js.native
}

