package typingsJapgolly.monacoEditor.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEvent extends js.Object {
  val altKey: Boolean
  val browserEvent: MouseEvent
  val ctrlKey: Boolean
  val detail: Double
  val leftButton: Boolean
  val metaKey: Boolean
  val middleButton: Boolean
  val posx: Double
  val posy: Double
  val rightButton: Boolean
  val shiftKey: Boolean
  val target: HTMLElement
  val timestamp: Double
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object IMouseEvent {
  @scala.inline
  def apply(
    altKey: Boolean,
    browserEvent: MouseEvent,
    ctrlKey: Boolean,
    detail: Double,
    leftButton: Boolean,
    metaKey: Boolean,
    middleButton: Boolean,
    posx: Double,
    posy: Double,
    preventDefault: Callback,
    rightButton: Boolean,
    shiftKey: Boolean,
    stopPropagation: Callback,
    target: HTMLElement,
    timestamp: Double
  ): IMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], browserEvent = browserEvent.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], leftButton = leftButton.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], middleButton = middleButton.asInstanceOf[js.Any], posx = posx.asInstanceOf[js.Any], posy = posy.asInstanceOf[js.Any], rightButton = rightButton.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[IMouseEvent]
  }
}

