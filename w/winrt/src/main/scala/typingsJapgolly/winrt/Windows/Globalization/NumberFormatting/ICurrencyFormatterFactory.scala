package typingsJapgolly.winrt.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrencyFormatterFactory extends js.Object {
  def createCurrencyFormatterCode(currencyCode: String): CurrencyFormatter
  def createCurrencyFormatterCodeContext(currencyCode: String, languages: IIterable[String], geographicRegion: String): CurrencyFormatter
}

object ICurrencyFormatterFactory {
  @scala.inline
  def apply(
    createCurrencyFormatterCode: String => CallbackTo[CurrencyFormatter],
    createCurrencyFormatterCodeContext: (String, IIterable[String], String) => CallbackTo[CurrencyFormatter]
  ): ICurrencyFormatterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCurrencyFormatterCode")(js.Any.fromFunction1((t0: java.lang.String) => createCurrencyFormatterCode(t0).runNow()))
    __obj.updateDynamic("createCurrencyFormatterCodeContext")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String], t2: java.lang.String) => createCurrencyFormatterCodeContext(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ICurrencyFormatterFactory]
  }
}

