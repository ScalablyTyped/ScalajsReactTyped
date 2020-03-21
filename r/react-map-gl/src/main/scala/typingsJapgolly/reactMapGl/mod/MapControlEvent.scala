package typingsJapgolly.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControlEvent extends js.Object {
  var center: Center
  var delta: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[Double] = js.undefined
  var leftButton: js.UndefOr[Boolean] = js.undefined
  var middleButton: js.UndefOr[Boolean] = js.undefined
  var offsetCenter: Center
  var pointerType: js.UndefOr[String] = js.undefined
  var rightButton: js.UndefOr[Boolean] = js.undefined
  var srcEvent: js.Any
  var target: js.Any
  var `type`: String
}

object MapControlEvent {
  @scala.inline
  def apply(
    center: Center,
    offsetCenter: Center,
    srcEvent: js.Any,
    target: js.Any,
    `type`: String,
    delta: Int | Double = null,
    key: Int | Double = null,
    leftButton: js.UndefOr[Boolean] = js.undefined,
    middleButton: js.UndefOr[Boolean] = js.undefined,
    pointerType: String = null,
    rightButton: js.UndefOr[Boolean] = js.undefined
  ): MapControlEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], offsetCenter = offsetCenter.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(leftButton)) __obj.updateDynamic("leftButton")(leftButton.asInstanceOf[js.Any])
    if (!js.isUndefined(middleButton)) __obj.updateDynamic("middleButton")(middleButton.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType.asInstanceOf[js.Any])
    if (!js.isUndefined(rightButton)) __obj.updateDynamic("rightButton")(rightButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControlEvent]
  }
}

