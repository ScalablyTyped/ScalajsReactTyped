package typingsJapgolly.detectTouchEvents.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectTouchEvents extends js.Object {
  var hasApi: Boolean
  var maxTouchPoints: Double
  def update(): Unit
}

object detectTouchEvents {
  @scala.inline
  def apply(hasApi: Boolean, maxTouchPoints: Double, update: Callback): detectTouchEvents = {
    val __obj = js.Dynamic.literal(hasApi = hasApi.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[detectTouchEvents]
  }
}

