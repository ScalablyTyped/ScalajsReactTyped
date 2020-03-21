package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var style: js.Any
  def onMouseDown(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`]
  def onMouseUp(event: MouseTouchEvent[HTMLElement]): Unit
  def onTouchEnd(event: MouseTouchEvent[HTMLElement]): Unit
  def onTouchStart(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`]
}

object AnonClassName {
  @scala.inline
  def apply(
    className: String,
    onMouseDown: MouseTouchEvent[HTMLElement] => CallbackTo[js.UndefOr[`false`]],
    onMouseUp: MouseTouchEvent[HTMLElement] => Callback,
    onTouchEnd: MouseTouchEvent[HTMLElement] => Callback,
    onTouchStart: MouseTouchEvent[HTMLElement] => CallbackTo[js.UndefOr[`false`]],
    style: js.Any
  ): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent[org.scalajs.dom.raw.HTMLElement]) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent[org.scalajs.dom.raw.HTMLElement]) => onMouseUp(t0).runNow()))
    __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent[org.scalajs.dom.raw.HTMLElement]) => onTouchEnd(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent[org.scalajs.dom.raw.HTMLElement]) => onTouchStart(t0).runNow()))
    __obj.asInstanceOf[AnonClassName]
  }
}

