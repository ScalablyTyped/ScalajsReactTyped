package typingsJapgolly.dateFns

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateTime extends js.Object {
  def date(args: js.Any*): js.Any
  def dateTime(args: js.Any*): js.Any
  def time(args: js.Any*): js.Any
}

object AnonDateTime {
  @scala.inline
  def apply(
    date: /* repeated */ js.Any => CallbackTo[js.Any],
    dateTime: /* repeated */ js.Any => CallbackTo[js.Any],
    time: /* repeated */ js.Any => CallbackTo[js.Any]
  ): AnonDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => date(t0).runNow()))
    __obj.updateDynamic("dateTime")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => dateTime(t0).runNow()))
    __obj.updateDynamic("time")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => time(t0).runNow()))
    __obj.asInstanceOf[AnonDateTime]
  }
}

