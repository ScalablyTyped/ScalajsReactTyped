package typingsJapgolly.angularStrap.mgcrea.ngStrap.scrollspy

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollspy extends js.Object {
  def activate(index: Double): Unit
  def checkOffsets(): Unit
  def trackElement(target: js.Any, source: js.Any): Unit
  def untrackElement(target: js.Any, source: js.Any): Unit
}

object IScrollspy {
  @scala.inline
  def apply(
    activate: Double => Callback,
    checkOffsets: Callback,
    trackElement: (js.Any, js.Any) => Callback,
    untrackElement: (js.Any, js.Any) => Callback
  ): IScrollspy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: scala.Double) => activate(t0).runNow()))
    __obj.updateDynamic("checkOffsets")(checkOffsets.toJsFn)
    __obj.updateDynamic("trackElement")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => trackElement(t0, t1).runNow()))
    __obj.updateDynamic("untrackElement")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => untrackElement(t0, t1).runNow()))
    __obj.asInstanceOf[IScrollspy]
  }
}

