package typingsJapgolly.reactDashBigDashCalendar

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End[TEvent /* <: js.Object */] extends js.Object {
  var end: js.UndefOr[js.Function1[/* event */ TEvent, js.Date]] = js.undefined
  var start: js.UndefOr[js.Function1[/* event */ TEvent, js.Date]] = js.undefined
  var title: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.undefined
  var tooltip: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    end: /* event */ TEvent => CallbackTo[js.Date] = null,
    start: /* event */ TEvent => CallbackTo[js.Date] = null,
    title: /* event */ TEvent => CallbackTo[String] = null,
    tooltip: /* event */ TEvent => CallbackTo[String] = null
  ): Anon_End[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1((t0: /* event */ TEvent) => end(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* event */ TEvent) => start(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1((t0: /* event */ TEvent) => title(t0).runNow()))
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1((t0: /* event */ TEvent) => tooltip(t0).runNow()))
    __obj.asInstanceOf[Anon_End[TEvent]]
  }
}

