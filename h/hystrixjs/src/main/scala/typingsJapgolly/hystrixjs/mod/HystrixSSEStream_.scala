package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixSSEStream_ extends js.Object {
  def toCommandJson(metrics: js.Any): String
  def toObservable(): Observable[_]
}

object HystrixSSEStream_ {
  @scala.inline
  def apply(toCommandJson: js.Any => CallbackTo[String], toObservable: CallbackTo[Observable[js.Any]]): HystrixSSEStream_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toCommandJson")(js.Any.fromFunction1((t0: js.Any) => toCommandJson(t0).runNow()))
    __obj.updateDynamic("toObservable")(toObservable.toJsFn)
    __obj.asInstanceOf[HystrixSSEStream_]
  }
}

