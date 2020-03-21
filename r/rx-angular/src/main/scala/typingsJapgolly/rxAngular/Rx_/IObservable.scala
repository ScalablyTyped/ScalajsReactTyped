package typingsJapgolly.rxAngular.Rx_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable[T] extends js.Object {
  def safeApply($scope: IScope, callback: js.Function1[/* data */ T, Unit]): Observable[T]
}

object IObservable {
  @scala.inline
  def apply[T](safeApply: (IScope, js.Function1[/* data */ T, Unit]) => CallbackTo[Observable[T]]): IObservable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("safeApply")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: js.Function1[/* data */ T, scala.Unit]) => safeApply(t0, t1).runNow()))
    __obj.asInstanceOf[IObservable[T]]
  }
}

