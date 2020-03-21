package typingsJapgolly.findMyWay

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.findMyWay.mod.HTTPVersion
import typingsJapgolly.findMyWay.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDel[V /* <: HTTPVersion */] extends js.Object {
  def del(version: String): Unit
  def empty(): Unit
  def get(version: String): Handler[V] | Null
  def set(version: String, store: Handler[V]): Unit
}

object AnonDel {
  @scala.inline
  def apply[V /* <: HTTPVersion */](
    del: String => Callback,
    empty: Callback,
    get: String => CallbackTo[Handler[V] | Null],
    set: (String, Handler[V]) => Callback
  ): AnonDel[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("del")(js.Any.fromFunction1((t0: java.lang.String) => del(t0).runNow()))
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.findMyWay.mod.Handler[V]) => set(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDel[V]]
  }
}

