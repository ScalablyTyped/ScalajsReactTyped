package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackEventMap extends js.Object {
  var cuechange: Event_
  var error: Event_
  var load: Event_
}

object TextTrackEventMap {
  @scala.inline
  def apply(cuechange: Event_, error: Event_, load: Event_): TextTrackEventMap = {
    val __obj = js.Dynamic.literal(cuechange = cuechange.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextTrackEventMap]
  }
}

