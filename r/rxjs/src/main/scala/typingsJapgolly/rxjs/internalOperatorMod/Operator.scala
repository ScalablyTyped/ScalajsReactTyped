package typingsJapgolly.rxjs.internalOperatorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.internalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator[T, R] extends js.Object {
  def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic
}

object Operator {
  @scala.inline
  def apply[T, R](call: (Subscriber[R], js.Any) => CallbackTo[TeardownLogic]): Operator[T, R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(js.Any.fromFunction2((t0: typingsJapgolly.rxjs.internalSubscriberMod.Subscriber[R], t1: js.Any) => call(t0, t1).runNow()))
    __obj.asInstanceOf[Operator[T, R]]
  }
}

