package typingsJapgolly.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketListenerInformation extends js.Object {
  var localPort: String
}

object IStreamSocketListenerInformation {
  @scala.inline
  def apply(localPort: String): IStreamSocketListenerInformation = {
    val __obj = js.Dynamic.literal(localPort = localPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStreamSocketListenerInformation]
  }
}

