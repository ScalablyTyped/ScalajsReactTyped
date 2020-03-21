package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.AnonAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevAppDetails extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var commPort: Double
  var interfaces: js.Array[AnonAddress]
  var port: Double
}

object DevAppDetails {
  @scala.inline
  def apply(commPort: Double, interfaces: js.Array[AnonAddress], port: Double, channel: String = null): DevAppDetails = {
    val __obj = js.Dynamic.literal(commPort = commPort.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevAppDetails]
  }
}

