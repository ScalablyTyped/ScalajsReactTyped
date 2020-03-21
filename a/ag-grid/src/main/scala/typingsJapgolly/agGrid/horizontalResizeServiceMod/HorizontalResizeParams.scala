package typingsJapgolly.agGrid.horizontalResizeServiceMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalResizeParams extends js.Object {
  var eResizeBar: HTMLElement
  def onResizeEnd(delta: Double): Unit
  def onResizeStart(shiftKey: Boolean): Unit
  def onResizing(delta: Double): Unit
}

object HorizontalResizeParams {
  @scala.inline
  def apply(
    eResizeBar: HTMLElement,
    onResizeEnd: Double => Callback,
    onResizeStart: Boolean => Callback,
    onResizing: Double => Callback
  ): HorizontalResizeParams = {
    val __obj = js.Dynamic.literal(eResizeBar = eResizeBar.asInstanceOf[js.Any])
    __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1((t0: scala.Double) => onResizeEnd(t0).runNow()))
    __obj.updateDynamic("onResizeStart")(js.Any.fromFunction1((t0: scala.Boolean) => onResizeStart(t0).runNow()))
    __obj.updateDynamic("onResizing")(js.Any.fromFunction1((t0: scala.Double) => onResizing(t0).runNow()))
    __obj.asInstanceOf[HorizontalResizeParams]
  }
}

