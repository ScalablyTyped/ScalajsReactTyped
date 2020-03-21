package typingsJapgolly.irc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  var channel: AnonIdlength
  var kicklength: Double
  var maxlist: js.Array[Double]
  var maxtargets: js.Array[String]
  var modes: Double
  var nicklength: Double
  var topiclength: Double
  var usermodes: String
}

object AnonChannel {
  @scala.inline
  def apply(
    channel: AnonIdlength,
    kicklength: Double,
    maxlist: js.Array[Double],
    maxtargets: js.Array[String],
    modes: Double,
    nicklength: Double,
    topiclength: Double,
    usermodes: String
  ): AnonChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], kicklength = kicklength.asInstanceOf[js.Any], maxlist = maxlist.asInstanceOf[js.Any], maxtargets = maxtargets.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], nicklength = nicklength.asInstanceOf[js.Any], topiclength = topiclength.asInstanceOf[js.Any], usermodes = usermodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChannel]
  }
}

