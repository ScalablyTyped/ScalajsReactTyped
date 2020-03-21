package typingsJapgolly.rxCore.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverStatic extends js.Object {
  /**
    * Schedules the invocation of observer methods on the given scheduler.
    * @param scheduler Scheduler to schedule observer messages on.
    * @returns Observer whose messages are scheduled on the given scheduler.
    */
  def notifyOn[T](scheduler: IScheduler): Observer[T]
}

object ObserverStatic {
  @scala.inline
  def apply(notifyOn: IScheduler => CallbackTo[Observer[js.Any]]): ObserverStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notifyOn")(js.Any.fromFunction1((t0: typingsJapgolly.rxCore.Rx.IScheduler) => notifyOn(t0).runNow()))
    __obj.asInstanceOf[ObserverStatic]
  }
}

