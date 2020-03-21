package typingsJapgolly.puppeteer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touchscreen extends js.Object {
  /**
    * Dispatches a touchstart and touchend event.
    * @param x The x position.
    * @param y The y position.
    */
  def tap(x: Double, y: Double): js.Promise[Unit]
}

object Touchscreen {
  @scala.inline
  def apply(tap: (Double, Double) => CallbackTo[js.Promise[Unit]]): Touchscreen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tap")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => tap(t0, t1).runNow()))
    __obj.asInstanceOf[Touchscreen]
  }
}

