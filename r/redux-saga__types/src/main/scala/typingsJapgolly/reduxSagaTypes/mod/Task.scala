package typingsJapgolly.reduxSagaTypes.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /**
    * Cancels the task (If it is still running)
    */
  def cancel(): Unit
  /**
    * Returns task thrown error. `undefined` if task is still running
    */
  def error(): js.UndefOr[js.Any]
  /**
    * Returns true if the task has been cancelled
    */
  def isCancelled(): Boolean
  /**
    * Returns true if the task hasn't yet returned or thrown an error
    */
  def isRunning(): Boolean
  /**
    * Returns task return value. `undefined` if task is still running
    */
  def result[T](): js.UndefOr[T]
  def setContext[C /* <: js.Object */](props: Partial[C]): Unit
  /**
    * Returns a Promise which is either:
    * - resolved with task's return value
    * - rejected with task's thrown error
    */
  def toPromise[T](): js.Promise[T]
}

object Task {
  @scala.inline
  def apply(
    cancel: Callback,
    error: CallbackTo[js.UndefOr[js.Any]],
    isCancelled: CallbackTo[Boolean],
    isRunning: CallbackTo[Boolean],
    result: CallbackTo[js.UndefOr[js.Any]],
    setContext: Partial[js.Any] => Callback,
    toPromise: CallbackTo[js.Promise[js.Any]]
  ): Task = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("error")(error.toJsFn)
    __obj.updateDynamic("isCancelled")(isCancelled.toJsFn)
    __obj.updateDynamic("isRunning")(isRunning.toJsFn)
    __obj.updateDynamic("result")(result.toJsFn)
    __obj.updateDynamic("setContext")(js.Any.fromFunction1((t0: typingsJapgolly.std.Partial[js.Any]) => setContext(t0).runNow()))
    __obj.updateDynamic("toPromise")(toPromise.toJsFn)
    __obj.asInstanceOf[Task]
  }
}

