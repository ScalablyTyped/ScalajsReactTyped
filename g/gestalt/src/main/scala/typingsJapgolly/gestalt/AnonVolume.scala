package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVolume extends js.Object {
  var event: ReactEventFrom[HTMLDivElement]
  var volume: Double
}

object AnonVolume {
  @scala.inline
  def apply(event: ReactEventFrom[HTMLDivElement], volume: Double): AnonVolume = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVolume]
  }
}

