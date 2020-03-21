package typingsJapgolly.graphemeSplitter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphemeSplitter extends js.Object {
  /** count the number of grapheme clusters in a string */
  def countGraphemes(s: String): Double
  /** iterate the string to an iterable iterator of grapheme clusters */
  def iterateGraphemes(s: String): IterableIterator[String]
  /** split the string to an array of grapheme clusters */
  def splitGraphemes(s: String): js.Array[String]
}

object GraphemeSplitter {
  @scala.inline
  def apply(
    countGraphemes: String => CallbackTo[Double],
    iterateGraphemes: String => CallbackTo[IterableIterator[String]],
    splitGraphemes: String => CallbackTo[js.Array[String]]
  ): GraphemeSplitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("countGraphemes")(js.Any.fromFunction1((t0: java.lang.String) => countGraphemes(t0).runNow()))
    __obj.updateDynamic("iterateGraphemes")(js.Any.fromFunction1((t0: java.lang.String) => iterateGraphemes(t0).runNow()))
    __obj.updateDynamic("splitGraphemes")(js.Any.fromFunction1((t0: java.lang.String) => splitGraphemes(t0).runNow()))
    __obj.asInstanceOf[GraphemeSplitter]
  }
}

