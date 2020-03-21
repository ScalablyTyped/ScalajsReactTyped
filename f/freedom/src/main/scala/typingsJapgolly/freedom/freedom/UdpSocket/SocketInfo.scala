package typingsJapgolly.freedom.freedom.UdpSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type for the chrome.socket.getInfo callback:
//   https://developer.chrome.com/apps/sockets_udp#type-SocketInfo
// This is also the type returned by getInfo().
trait SocketInfo extends js.Object {
  // Note that there are other fields but these are the ones we care about.
  var localAddress: String
  var localPort: Double
}

object SocketInfo {
  @scala.inline
  def apply(localAddress: String, localPort: Double): SocketInfo = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketInfo]
  }
}

