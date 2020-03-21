package typingsJapgolly.koaBunyanLogger.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeContextOptions extends js.Object {
  var logLevel: js.UndefOr[String] = js.undefined
  var updateLogFields: js.UndefOr[js.Function1[/* fields */ js.Any, _]] = js.undefined
}

object TimeContextOptions {
  @scala.inline
  def apply(logLevel: String = null, updateLogFields: /* fields */ js.Any => CallbackTo[js.Any] = null): TimeContextOptions = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (updateLogFields != null) __obj.updateDynamic("updateLogFields")(js.Any.fromFunction1((t0: /* fields */ js.Any) => updateLogFields(t0).runNow()))
    __obj.asInstanceOf[TimeContextOptions]
  }
}

