package typingsJapgolly.markdownPdf.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatFromOptionsBuilder extends js.Object {
  /** Create and concatenate readable streams from paths and pipe to markdown-pdf. */
  def paths(paths: js.Array[String], opts: js.Any): ToOptionsBuilder
  /** Create and concatenate readable streams from strings and pipe to markdown-pdf. */
  def strings(markdownTexts: js.Array[String], opts: js.Any): ToOptionsBuilder
}

object ConcatFromOptionsBuilder {
  @scala.inline
  def apply(
    paths: (js.Array[String], js.Any) => CallbackTo[ToOptionsBuilder],
    strings: (js.Array[String], js.Any) => CallbackTo[ToOptionsBuilder]
  ): ConcatFromOptionsBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("paths")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Any) => paths(t0, t1).runNow()))
    __obj.updateDynamic("strings")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Any) => strings(t0, t1).runNow()))
    __obj.asInstanceOf[ConcatFromOptionsBuilder]
  }
}

