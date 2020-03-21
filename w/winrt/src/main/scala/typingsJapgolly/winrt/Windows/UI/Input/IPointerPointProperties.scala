package typingsJapgolly.winrt.Windows.UI.Input

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerPointProperties extends js.Object {
  var contactRect: Rect
  var contactRectRaw: Rect
  var isBarrelButtonPressed: Boolean
  var isCanceled: Boolean
  var isEraser: Boolean
  var isHorizontalMouseWheel: Boolean
  var isInRange: Boolean
  var isInverted: Boolean
  var isLeftButtonPressed: Boolean
  var isMiddleButtonPressed: Boolean
  var isPrimary: Boolean
  var isRightButtonPressed: Boolean
  var isXButton1Pressed: Boolean
  var isXButton2Pressed: Boolean
  var mouseWheelDelta: Double
  var orientation: Double
  var pointerUpdateKind: PointerUpdateKind
  var pressure: Double
  var touchConfidence: Boolean
  var twist: Double
  var xTilt: Double
  var yTilt: Double
  def getUsageValue(usagePage: Double, usageId: Double): Double
  def hasUsage(usagePage: Double, usageId: Double): Boolean
}

object IPointerPointProperties {
  @scala.inline
  def apply(
    contactRect: Rect,
    contactRectRaw: Rect,
    getUsageValue: (Double, Double) => CallbackTo[Double],
    hasUsage: (Double, Double) => CallbackTo[Boolean],
    isBarrelButtonPressed: Boolean,
    isCanceled: Boolean,
    isEraser: Boolean,
    isHorizontalMouseWheel: Boolean,
    isInRange: Boolean,
    isInverted: Boolean,
    isLeftButtonPressed: Boolean,
    isMiddleButtonPressed: Boolean,
    isPrimary: Boolean,
    isRightButtonPressed: Boolean,
    isXButton1Pressed: Boolean,
    isXButton2Pressed: Boolean,
    mouseWheelDelta: Double,
    orientation: Double,
    pointerUpdateKind: PointerUpdateKind,
    pressure: Double,
    touchConfidence: Boolean,
    twist: Double,
    xTilt: Double,
    yTilt: Double
  ): IPointerPointProperties = {
    val __obj = js.Dynamic.literal(contactRect = contactRect.asInstanceOf[js.Any], contactRectRaw = contactRectRaw.asInstanceOf[js.Any], isBarrelButtonPressed = isBarrelButtonPressed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], isEraser = isEraser.asInstanceOf[js.Any], isHorizontalMouseWheel = isHorizontalMouseWheel.asInstanceOf[js.Any], isInRange = isInRange.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], isLeftButtonPressed = isLeftButtonPressed.asInstanceOf[js.Any], isMiddleButtonPressed = isMiddleButtonPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], isRightButtonPressed = isRightButtonPressed.asInstanceOf[js.Any], isXButton1Pressed = isXButton1Pressed.asInstanceOf[js.Any], isXButton2Pressed = isXButton2Pressed.asInstanceOf[js.Any], mouseWheelDelta = mouseWheelDelta.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pointerUpdateKind = pointerUpdateKind.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], touchConfidence = touchConfidence.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], xTilt = xTilt.asInstanceOf[js.Any], yTilt = yTilt.asInstanceOf[js.Any])
    __obj.updateDynamic("getUsageValue")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getUsageValue(t0, t1).runNow()))
    __obj.updateDynamic("hasUsage")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => hasUsage(t0, t1).runNow()))
    __obj.asInstanceOf[IPointerPointProperties]
  }
}

