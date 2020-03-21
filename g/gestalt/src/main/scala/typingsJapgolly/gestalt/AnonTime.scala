package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTime extends js.Object {
  var event: ReactEventFrom[HTMLVideoElement]
  var time: Double
}

object AnonTime {
  @scala.inline
  def apply(event: ReactEventFrom[HTMLVideoElement], time: Double): AnonTime = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTime]
  }
}

