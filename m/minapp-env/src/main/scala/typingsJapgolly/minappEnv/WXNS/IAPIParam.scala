package typingsJapgolly.minappEnv.WXNS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAPIParam[T] extends js.Object {
  var complete: js.UndefOr[js.Function1[/* val */ T | IAPIError, Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* err */ IAPIError, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.undefined
}

object IAPIParam {
  @scala.inline
  def apply[T](
    complete: /* val */ T | IAPIError => Callback = null,
    fail: /* err */ IAPIError => Callback = null,
    success: /* res */ T => Callback = null
  ): IAPIParam[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* val */ T | typingsJapgolly.minappEnv.WXNS.IAPIError) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.minappEnv.WXNS.IAPIError) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ T) => success(t0).runNow()))
    __obj.asInstanceOf[IAPIParam[T]]
  }
}

