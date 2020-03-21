package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackListEventMap extends js.Object {
  var addtrack: org.scalajs.dom.raw.TrackEvent
  var change: Event_
  var removetrack: org.scalajs.dom.raw.TrackEvent
}

object TextTrackListEventMap {
  @scala.inline
  def apply(
    addtrack: org.scalajs.dom.raw.TrackEvent,
    change: Event_,
    removetrack: org.scalajs.dom.raw.TrackEvent
  ): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextTrackListEventMap]
  }
}

