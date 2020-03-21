package typingsJapgolly.fastclick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastClickObject extends js.Object {
  var lastTouchIdentifier: Double
  var layer: Element
  var tapDelay: Double
  var targetElement: js.Any
  var touchBoundary: Double
  var touchStartX: Double
  var touchStartY: Double
  var trackingClick: Boolean
  var trackingClickStart: Double
  def destroy(): Unit
  def determineEventType(targetElement: js.Any): String
  def findControl(labelElement: js.Any): js.Any
  def focus(targetElement: js.Any): Unit
  def getTargetElementFromEventTarget(eventTarget: EventTarget): js.Any
  def needsClick(target: js.Any): Boolean
  def needsFocus(target: js.Any): Boolean
}

object FastClickObject {
  @scala.inline
  def apply(
    destroy: Callback,
    determineEventType: js.Any => CallbackTo[String],
    findControl: js.Any => CallbackTo[js.Any],
    focus: js.Any => Callback,
    getTargetElementFromEventTarget: EventTarget => CallbackTo[js.Any],
    lastTouchIdentifier: Double,
    layer: Element,
    needsClick: js.Any => CallbackTo[Boolean],
    needsFocus: js.Any => CallbackTo[Boolean],
    tapDelay: Double,
    targetElement: js.Any,
    touchBoundary: Double,
    touchStartX: Double,
    touchStartY: Double,
    trackingClick: Boolean,
    trackingClickStart: Double
  ): FastClickObject = {
    val __obj = js.Dynamic.literal(lastTouchIdentifier = lastTouchIdentifier.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], tapDelay = tapDelay.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], touchBoundary = touchBoundary.asInstanceOf[js.Any], touchStartX = touchStartX.asInstanceOf[js.Any], touchStartY = touchStartY.asInstanceOf[js.Any], trackingClick = trackingClick.asInstanceOf[js.Any], trackingClickStart = trackingClickStart.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("determineEventType")(js.Any.fromFunction1((t0: js.Any) => determineEventType(t0).runNow()))
    __obj.updateDynamic("findControl")(js.Any.fromFunction1((t0: js.Any) => findControl(t0).runNow()))
    __obj.updateDynamic("focus")(js.Any.fromFunction1((t0: js.Any) => focus(t0).runNow()))
    __obj.updateDynamic("getTargetElementFromEventTarget")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.EventTarget) => getTargetElementFromEventTarget(t0).runNow()))
    __obj.updateDynamic("needsClick")(js.Any.fromFunction1((t0: js.Any) => needsClick(t0).runNow()))
    __obj.updateDynamic("needsFocus")(js.Any.fromFunction1((t0: js.Any) => needsFocus(t0).runNow()))
    __obj.asInstanceOf[FastClickObject]
  }
}

