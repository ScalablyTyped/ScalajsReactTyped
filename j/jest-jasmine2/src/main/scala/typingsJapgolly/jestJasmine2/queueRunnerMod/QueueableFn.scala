package typingsJapgolly.jestJasmine2.queueRunnerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueableFn extends js.Object {
  var initError: js.UndefOr[js.Error] = js.undefined
  var timeout: js.UndefOr[js.Function0[Double]] = js.undefined
  def fn(done: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit
}

object QueueableFn {
  @scala.inline
  def apply(
    fn: js.Function1[/* error */ js.UndefOr[js.Any], Unit] => Callback,
    initError: js.Error = null,
    timeout: js.UndefOr[CallbackTo[Double]] = js.undefined
  ): QueueableFn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fn")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]) => fn(t0).runNow()))
    if (initError != null) __obj.updateDynamic("initError")(initError.asInstanceOf[js.Any])
    timeout.foreach(p => __obj.updateDynamic("timeout")(p.toJsFn))
    __obj.asInstanceOf[QueueableFn]
  }
}

