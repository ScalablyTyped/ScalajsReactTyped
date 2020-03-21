package typingsJapgolly.formatjsIntlListformat.coreMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFormat extends js.Object {
  def format(elements: js.Array[String]): String
  def formatToParts(elements: js.Array[String]): js.Array[Part]
  def resolvedOptions(): ResolvedIntlListFormatOptions
}

object ListFormat {
  @scala.inline
  def apply(
    format: js.Array[String] => CallbackTo[String],
    formatToParts: js.Array[String] => CallbackTo[js.Array[Part]],
    resolvedOptions: CallbackTo[ResolvedIntlListFormatOptions]
  ): ListFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => format(t0).runNow()))
    __obj.updateDynamic("formatToParts")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => formatToParts(t0).runNow()))
    __obj.updateDynamic("resolvedOptions")(resolvedOptions.toJsFn)
    __obj.asInstanceOf[ListFormat]
  }
}

