package typingsJapgolly.officeJs.OfficeExtension

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInfo[T] extends js.Object {
  def eventArgsTransformFunc(args: js.Any): js.Promise[T]
  def registerFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_]
  def unregisterFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_]
}

object EventInfo {
  @scala.inline
  def apply[T](
    eventArgsTransformFunc: js.Any => CallbackTo[js.Promise[T]],
    registerFunc: js.Function1[/* args */ js.Any, Unit] => CallbackTo[js.Promise[js.Any]],
    unregisterFunc: js.Function1[/* args */ js.Any, Unit] => CallbackTo[js.Promise[js.Any]]
  ): EventInfo[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventArgsTransformFunc")(js.Any.fromFunction1((t0: js.Any) => eventArgsTransformFunc(t0).runNow()))
    __obj.updateDynamic("registerFunc")(js.Any.fromFunction1((t0: js.Function1[/* args */ js.Any, scala.Unit]) => registerFunc(t0).runNow()))
    __obj.updateDynamic("unregisterFunc")(js.Any.fromFunction1((t0: js.Function1[/* args */ js.Any, scala.Unit]) => unregisterFunc(t0).runNow()))
    __obj.asInstanceOf[EventInfo[T]]
  }
}

