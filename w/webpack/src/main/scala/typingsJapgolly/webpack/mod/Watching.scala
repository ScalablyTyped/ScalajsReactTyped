package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watching extends js.Object {
  def close(callback: js.Function0[Unit]): Unit
  def invalidate(): Unit
}

object Watching {
  @scala.inline
  def apply(close: js.Function0[Unit] => Callback, invalidate: Callback): Watching = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => close(t0).runNow()))
    __obj.updateDynamic("invalidate")(invalidate.toJsFn)
    __obj.asInstanceOf[Watching]
  }
}

