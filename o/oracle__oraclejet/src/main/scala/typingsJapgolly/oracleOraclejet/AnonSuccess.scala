package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuccess
  extends /* propName */ StringDictionary[js.Any] {
  var error: js.UndefOr[js.Function3[/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* json */ js.UndefOr[js.Array[_]], Unit]] = js.undefined
}

object AnonSuccess {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    error: (/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any) => Callback = null,
    success: /* json */ js.UndefOr[js.Array[js.Any]] => Callback = null
  ): AnonSuccess = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* xhr */ js.Any, t1: /* status */ js.Any, t2: /* error */ js.Any) => error(t0, t1, t2).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* json */ js.UndefOr[js.Array[js.Any]]) => success(t0).runNow()))
    __obj.asInstanceOf[AnonSuccess]
  }
}

