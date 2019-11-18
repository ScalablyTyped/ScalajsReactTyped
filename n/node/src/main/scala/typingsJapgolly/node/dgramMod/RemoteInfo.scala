package typingsJapgolly.node.dgramMod

import typingsJapgolly.node.nodeStrings.IPv4
import typingsJapgolly.node.nodeStrings.IPv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo extends js.Object {
  var address: java.lang.String
  var family: IPv4 | IPv6
  var port: Double
  var size: Double
}

object RemoteInfo {
  @scala.inline
  def apply(address: java.lang.String, family: IPv4 | IPv6, port: Double, size: Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoteInfo]
  }
}

