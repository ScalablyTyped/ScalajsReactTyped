package typingsJapgolly.rxCore.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduler extends js.Object {
  def `catch`(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler
  def catchException(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler
}

object IScheduler {
  @scala.inline
  def apply(
    `catch`: js.Function1[/* exception */ js.Any, Boolean] => CallbackTo[IScheduler],
    catchException: js.Function1[/* exception */ js.Any, Boolean] => CallbackTo[IScheduler]
  ): IScheduler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1((t0: js.Function1[/* exception */ js.Any, scala.Boolean]) => `catch`(t0).runNow()))
    __obj.updateDynamic("catchException")(js.Any.fromFunction1((t0: js.Function1[/* exception */ js.Any, scala.Boolean]) => catchException(t0).runNow()))
    __obj.asInstanceOf[IScheduler]
  }
}

