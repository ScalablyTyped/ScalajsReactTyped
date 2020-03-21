package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPDialIn extends js.Object {
  /**
    * The protocol, including SIP, SIPS, and H323.
    */
  var CommsProtocol: typingsJapgolly.awsSdk.alexaforbusinessMod.CommsProtocol = js.native
  /**
    * The IP address.
    */
  var Endpoint: typingsJapgolly.awsSdk.alexaforbusinessMod.Endpoint = js.native
}

object IPDialIn {
  @scala.inline
  def apply(CommsProtocol: CommsProtocol, Endpoint: Endpoint): IPDialIn = {
    val __obj = js.Dynamic.literal(CommsProtocol = CommsProtocol.asInstanceOf[js.Any], Endpoint = Endpoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPDialIn]
  }
}

