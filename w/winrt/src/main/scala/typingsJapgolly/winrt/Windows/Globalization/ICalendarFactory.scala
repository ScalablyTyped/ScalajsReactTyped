package typingsJapgolly.winrt.Windows.Globalization

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarFactory extends js.Object {
  def createCalendar(languages: IIterable[String], calendar: String, clock: String): Calendar
  def createCalendarDefaultCalendarAndClock(languages: IIterable[String]): Calendar
}

object ICalendarFactory {
  @scala.inline
  def apply(
    createCalendar: (IIterable[String], String, String) => CallbackTo[Calendar],
    createCalendarDefaultCalendarAndClock: IIterable[String] => CallbackTo[Calendar]
  ): ICalendarFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCalendar")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String], t1: java.lang.String, t2: java.lang.String) => createCalendar(t0, t1, t2).runNow()))
    __obj.updateDynamic("createCalendarDefaultCalendarAndClock")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String]) => createCalendarDefaultCalendarAndClock(t0).runNow()))
    __obj.asInstanceOf[ICalendarFactory]
  }
}

