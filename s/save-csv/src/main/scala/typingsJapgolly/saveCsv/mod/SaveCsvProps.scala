package typingsJapgolly.saveCsv.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveCsvProps extends js.Object {
  var bom: js.UndefOr[Boolean] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var filename: String
  var formatter: js.UndefOr[js.Function1[/* value */ String | JSON, Unit]] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var sep: js.UndefOr[String] = js.undefined
}

object SaveCsvProps {
  @scala.inline
  def apply(
    filename: String,
    bom: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    formatter: /* value */ String | JSON => Callback = null,
    mime: String = null,
    quote: String = null,
    sep: String = null
  ): SaveCsvProps = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* value */ java.lang.String | typingsJapgolly.std.JSON) => formatter(t0).runNow()))
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveCsvProps]
  }
}

