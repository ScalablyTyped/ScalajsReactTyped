package typingsJapgolly.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11ChannelData extends js.Object {
  var srcIP: String
  var srcPort: Double
}

object X11ChannelData {
  @scala.inline
  def apply(srcIP: String, srcPort: Double): X11ChannelData = {
    val __obj = js.Dynamic.literal(srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[X11ChannelData]
  }
}

