package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullscreen extends js.Object {
  var event: ReactEventFrom[HTMLDivElement]
  var fullscreen: Boolean
}

object AnonFullscreen {
  @scala.inline
  def apply(event: ReactEventFrom[HTMLDivElement], fullscreen: Boolean): AnonFullscreen = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFullscreen]
  }
}

