package typingsJapgolly.node.clusterMod

import typingsJapgolly.node.nodeStrings.udp4
import typingsJapgolly.node.nodeStrings.udp6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var addressType: Double | udp4 | udp6
  var port: Double
}

object Address {
  @scala.inline
  def apply(address: String, addressType: Double | udp4 | udp6, port: Double): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Address]
  }
}

