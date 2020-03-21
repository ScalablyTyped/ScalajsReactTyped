package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoaded extends js.Object {
  var event: ReactEventFrom[HTMLVideoElement]
  var loaded: Double
}

object AnonLoaded {
  @scala.inline
  def apply(event: ReactEventFrom[HTMLVideoElement], loaded: Double): AnonLoaded = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLoaded]
  }
}

