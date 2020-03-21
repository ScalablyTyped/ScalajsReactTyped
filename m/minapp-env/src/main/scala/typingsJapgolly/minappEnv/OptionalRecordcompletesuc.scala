package typingsJapgolly.minappEnv

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.Optional<minapp-env.Record<'complete' | 'success' | 'fail', (args : ...any): any>> */
trait OptionalRecordcompletesuc extends js.Object {
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object OptionalRecordcompletesuc {
  @scala.inline
  def apply(
    complete: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    fail: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    success: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): OptionalRecordcompletesuc = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[OptionalRecordcompletesuc]
  }
}

