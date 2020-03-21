package typingsJapgolly.aureliaBinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyObserver extends js.Object {
  /**
    * Subscribe to property change events.
    */
  def subscribe(callback: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit]): Disposable
}

object PropertyObserver {
  @scala.inline
  def apply(
    subscribe: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, Unit] => CallbackTo[Disposable]
  ): PropertyObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[PropertyObserver]
  }
}

