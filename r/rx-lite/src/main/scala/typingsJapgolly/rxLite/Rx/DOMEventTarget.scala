package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMEventTarget extends js.Object {
  def addEventListener(`type`: String, listener: js.Function1[/* e */ js.Any, _], useCapture: Boolean): Unit
  def removeEventListener(`type`: String, listener: js.Function1[/* e */ js.Any, _], useCapture: Boolean): Unit
}

object DOMEventTarget {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ js.Any, js.Any], Boolean) => Callback,
    removeEventListener: (String, js.Function1[/* e */ js.Any, js.Any], Boolean) => Callback
  ): DOMEventTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function1[/* e */ js.Any, js.Any], t2: scala.Boolean) => addEventListener(t0, t1, t2).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function1[/* e */ js.Any, js.Any], t2: scala.Boolean) => removeEventListener(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DOMEventTarget]
  }
}

