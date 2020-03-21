package typingsJapgolly.reactDates.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait CalendarDayPhrases extends js.Object {
  def chooseAvailableDate(date: String): String
  def dateIsSelected(date: String): String
  def dateIsUnavailable(date: String): String
}

object CalendarDayPhrases {
  @scala.inline
  def apply(
    chooseAvailableDate: String => CallbackTo[String],
    dateIsSelected: String => CallbackTo[String],
    dateIsUnavailable: String => CallbackTo[String]
  ): CalendarDayPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chooseAvailableDate")(js.Any.fromFunction1((t0: java.lang.String) => chooseAvailableDate(t0).runNow()))
    __obj.updateDynamic("dateIsSelected")(js.Any.fromFunction1((t0: java.lang.String) => dateIsSelected(t0).runNow()))
    __obj.updateDynamic("dateIsUnavailable")(js.Any.fromFunction1((t0: java.lang.String) => dateIsUnavailable(t0).runNow()))
    __obj.asInstanceOf[CalendarDayPhrases]
  }
}

