package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeySessionEventMap extends js.Object {
  var keystatuseschange: Event_
  var message: MediaKeyMessageEvent
}

object MediaKeySessionEventMap {
  @scala.inline
  def apply(keystatuseschange: Event_, message: MediaKeyMessageEvent): MediaKeySessionEventMap = {
    val __obj = js.Dynamic.literal(keystatuseschange = keystatuseschange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaKeySessionEventMap]
  }
}

