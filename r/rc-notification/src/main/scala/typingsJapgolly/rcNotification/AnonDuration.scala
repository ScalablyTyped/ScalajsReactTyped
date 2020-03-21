package typingsJapgolly.rcNotification

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var style: AnonRight
  def onClose(): Unit
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, onClose: Callback, style: AnonRight): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.asInstanceOf[AnonDuration]
  }
}

