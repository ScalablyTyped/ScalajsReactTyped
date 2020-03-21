package typingsJapgolly.sybasePromised.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SybasePromised extends js.Object {
  def connect(): js.Promise[this.type]
  def disconnect(): Unit
  def query(sql: String): js.Promise[js.Array[_]]
}

object SybasePromised {
  @scala.inline
  def apply(
    connect: CallbackTo[js.Promise[SybasePromised]],
    disconnect: Callback,
    query: String => CallbackTo[js.Promise[js.Array[js.Any]]]
  ): SybasePromised = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(connect.toJsFn)
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: java.lang.String) => query(t0).runNow()))
    __obj.asInstanceOf[SybasePromised]
  }
}

