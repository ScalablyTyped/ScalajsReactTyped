package typingsJapgolly.reduxLogger.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntryObject extends js.Object {
  var action: js.UndefOr[String | Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var nextState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var prevState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var started: js.UndefOr[Double] = js.undefined
  var startedTime: js.UndefOr[js.Date] = js.undefined
  var took: js.UndefOr[Double] = js.undefined
}

object LogEntryObject {
  @scala.inline
  def apply(
    action: String | Boolean | ActionToString = null,
    error: /* error */ js.Any => CallbackTo[js.Any] = null,
    nextState: /* state */ js.Any => CallbackTo[js.Any] = null,
    prevState: /* state */ js.Any => CallbackTo[js.Any] = null,
    started: Int | Double = null,
    startedTime: js.Date = null,
    took: Int | Double = null
  ): LogEntryObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ js.Any) => error(t0).runNow()))
    if (nextState != null) __obj.updateDynamic("nextState")(js.Any.fromFunction1((t0: /* state */ js.Any) => nextState(t0).runNow()))
    if (prevState != null) __obj.updateDynamic("prevState")(js.Any.fromFunction1((t0: /* state */ js.Any) => prevState(t0).runNow()))
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (startedTime != null) __obj.updateDynamic("startedTime")(startedTime.asInstanceOf[js.Any])
    if (took != null) __obj.updateDynamic("took")(took.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntryObject]
  }
}

