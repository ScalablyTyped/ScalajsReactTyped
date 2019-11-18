package typingsJapgolly.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputFocusEventData extends TargetedEvent {
  var eventCount: Double
  var text: String
}

object TextInputFocusEventData {
  @scala.inline
  def apply(eventCount: Double, target: Double, text: String): TextInputFocusEventData = {
    val __obj = js.Dynamic.literal(eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextInputFocusEventData]
  }
}

