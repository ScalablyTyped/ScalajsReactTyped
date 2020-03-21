package typingsJapgolly.namedRegexpGroups.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedRegExp extends js.Object {
  @JSName(scala.scalajs.js.Symbol.`match`)
  var `match`: js.Function1[/* str */ String, NamedRegExpExecArray] = js.native
  @JSName(scala.scalajs.js.Symbol.replace)
  var replace: js.Function2[
    /* str */ String, 
    /* replacement */ String | (js.Function2[/* match */ String, /* repeated */ String, String]), 
    String
  ] = js.native
  @JSName(scala.scalajs.js.Symbol.search)
  var search: js.Function1[/* str */ String, Double] = js.native
  @JSName(scala.scalajs.js.Symbol.split)
  var split: js.Function1[/* str */ String, js.Array[String]] = js.native
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  def exec(string: String): NamedRegExpExecArray | Null = js.native
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  def test(string: String): Boolean = js.native
}

