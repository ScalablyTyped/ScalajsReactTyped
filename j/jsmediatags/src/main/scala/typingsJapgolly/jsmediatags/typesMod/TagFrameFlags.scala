package typingsJapgolly.jsmediatags.typesMod

import typingsJapgolly.jsmediatags.AnonCompression
import typingsJapgolly.jsmediatags.AnonFilealterpreservation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFrameFlags extends js.Object {
  var format: AnonCompression
  var message: AnonFilealterpreservation
}

object TagFrameFlags {
  @scala.inline
  def apply(format: AnonCompression, message: AnonFilealterpreservation): TagFrameFlags = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagFrameFlags]
  }
}

