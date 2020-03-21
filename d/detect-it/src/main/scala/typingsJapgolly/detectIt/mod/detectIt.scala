package typingsJapgolly.detectIt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.detectIt.detectItStrings.coarse
import typingsJapgolly.detectIt.detectItStrings.fine
import typingsJapgolly.detectIt.detectItStrings.hover
import typingsJapgolly.detectIt.detectItStrings.hybrid
import typingsJapgolly.detectIt.detectItStrings.mouseOnly
import typingsJapgolly.detectIt.detectItStrings.none
import typingsJapgolly.detectIt.detectItStrings.touchOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectIt extends js.Object {
  var deviceType: hybrid | mouseOnly | touchOnly
  var hasMouse: Boolean
  var hasTouch: Boolean
  var maxTouchPoints: Double
  var passiveEvents: Boolean
  var primaryHover: hover | none
  var primaryPointer: coarse | fine | none
  var state: typingsJapgolly.detectIt.mod.state
  def update(): Unit
}

object detectIt {
  @scala.inline
  def apply(
    deviceType: hybrid | mouseOnly | touchOnly,
    hasMouse: Boolean,
    hasTouch: Boolean,
    maxTouchPoints: Double,
    passiveEvents: Boolean,
    primaryHover: hover | none,
    primaryPointer: coarse | fine | none,
    state: state,
    update: Callback
  ): detectIt = {
    val __obj = js.Dynamic.literal(deviceType = deviceType.asInstanceOf[js.Any], hasMouse = hasMouse.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], passiveEvents = passiveEvents.asInstanceOf[js.Any], primaryHover = primaryHover.asInstanceOf[js.Any], primaryPointer = primaryPointer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[detectIt]
  }
}

