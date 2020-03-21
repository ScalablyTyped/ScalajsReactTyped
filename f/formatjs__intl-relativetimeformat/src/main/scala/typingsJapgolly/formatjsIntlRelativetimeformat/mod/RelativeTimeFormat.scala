package typingsJapgolly.formatjsIntlRelativetimeformat.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeFormat extends js.Object {
  def format(value: Double, unit: FormattableUnit): String
  def formatToParts(value: Double, unit: FormattableUnit): js.Array[Part]
  def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions
}

object RelativeTimeFormat {
  @scala.inline
  def apply(
    format: (Double, FormattableUnit) => CallbackTo[String],
    formatToParts: (Double, FormattableUnit) => CallbackTo[js.Array[Part]],
    resolvedOptions: CallbackTo[ResolvedIntlRelativeTimeFormatOptions]
  ): RelativeTimeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.formatjsIntlRelativetimeformat.mod.FormattableUnit) => format(t0, t1).runNow()))
    __obj.updateDynamic("formatToParts")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.formatjsIntlRelativetimeformat.mod.FormattableUnit) => formatToParts(t0, t1).runNow()))
    __obj.updateDynamic("resolvedOptions")(resolvedOptions.toJsFn)
    __obj.asInstanceOf[RelativeTimeFormat]
  }
}

