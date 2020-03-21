package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeEventTarget extends js.Object {
  def addListener(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit
}

object NodeEventTarget {
  @scala.inline
  def apply(addListener: (String, js.Function1[/* e */ js.Any, js.Any]) => Callback): NodeEventTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* e */ js.Any, js.Any]) => addListener(t0, t1).runNow()))
    __obj.asInstanceOf[NodeEventTarget]
  }
}

