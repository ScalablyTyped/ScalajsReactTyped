package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var event: ReactEventFrom[HTMLVideoElement]
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, event: ReactEventFrom[HTMLVideoElement]): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

