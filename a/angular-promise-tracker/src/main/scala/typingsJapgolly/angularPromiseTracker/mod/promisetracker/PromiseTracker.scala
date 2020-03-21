package typingsJapgolly.angularPromiseTracker.mod.promisetracker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IDeferred
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTracker extends js.Object {
  def active(): Boolean
  def addPromise[T](promise: IPromise[T]): IDeferred[Unit]
  def cancel(): Unit
  def createPromise(): IDeferred[Unit]
  def tracking(): Boolean
  def trackingCount(): Double
}

object PromiseTracker {
  @scala.inline
  def apply(
    active: CallbackTo[Boolean],
    addPromise: IPromise[js.Any] => CallbackTo[IDeferred[Unit]],
    cancel: Callback,
    createPromise: CallbackTo[IDeferred[Unit]],
    tracking: CallbackTo[Boolean],
    trackingCount: CallbackTo[Double]
  ): PromiseTracker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active.toJsFn)
    __obj.updateDynamic("addPromise")(js.Any.fromFunction1((t0: typingsJapgolly.angular.mod.IPromise[js.Any]) => addPromise(t0).runNow()))
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("createPromise")(createPromise.toJsFn)
    __obj.updateDynamic("tracking")(tracking.toJsFn)
    __obj.updateDynamic("trackingCount")(trackingCount.toJsFn)
    __obj.asInstanceOf[PromiseTracker]
  }
}

