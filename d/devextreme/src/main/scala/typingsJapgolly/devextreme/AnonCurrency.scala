package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.devextremeStrings.billions
import typingsJapgolly.devextreme.devextremeStrings.currency
import typingsJapgolly.devextreme.devextremeStrings.day
import typingsJapgolly.devextreme.devextremeStrings.dayOfWeek
import typingsJapgolly.devextreme.devextremeStrings.decimal_
import typingsJapgolly.devextreme.devextremeStrings.exponential
import typingsJapgolly.devextreme.devextremeStrings.fixedPoint
import typingsJapgolly.devextreme.devextremeStrings.hour
import typingsJapgolly.devextreme.devextremeStrings.largeNumber
import typingsJapgolly.devextreme.devextremeStrings.longDate
import typingsJapgolly.devextreme.devextremeStrings.longDateLongTime
import typingsJapgolly.devextreme.devextremeStrings.longTime
import typingsJapgolly.devextreme.devextremeStrings.millions
import typingsJapgolly.devextreme.devextremeStrings.millisecond
import typingsJapgolly.devextreme.devextremeStrings.minute
import typingsJapgolly.devextreme.devextremeStrings.month
import typingsJapgolly.devextreme.devextremeStrings.monthAndDay
import typingsJapgolly.devextreme.devextremeStrings.monthAndYear
import typingsJapgolly.devextreme.devextremeStrings.percent
import typingsJapgolly.devextreme.devextremeStrings.quarter
import typingsJapgolly.devextreme.devextremeStrings.quarterAndYear
import typingsJapgolly.devextreme.devextremeStrings.second
import typingsJapgolly.devextreme.devextremeStrings.shortDate
import typingsJapgolly.devextreme.devextremeStrings.shortDateShortTime
import typingsJapgolly.devextreme.devextremeStrings.shortTime
import typingsJapgolly.devextreme.devextremeStrings.thousands
import typingsJapgolly.devextreme.devextremeStrings.trillions
import typingsJapgolly.devextreme.devextremeStrings.year
import typingsJapgolly.devextreme.mod.DevExpress.ui._format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrency extends _format {
  var currency: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* value */ Double | js.Date, String]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* value */ String, Double | js.Date]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[
    billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
  ] = js.undefined
}

object AnonCurrency {
  @scala.inline
  def apply(
    currency: String = null,
    formatter: /* value */ Double | js.Date => CallbackTo[String] = null,
    parser: /* value */ String => CallbackTo[Double | js.Date] = null,
    precision: Int | Double = null,
    `type`: billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime = null
  ): AnonCurrency = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* value */ scala.Double | js.Date) => formatter(t0).runNow()))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => parser(t0).runNow()))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrency]
  }
}

