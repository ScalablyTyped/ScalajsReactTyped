package typingsJapgolly.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBGPPeerResponse extends js.Object {
  /**
    * The virtual interface.
    */
  var virtualInterface: js.UndefOr[VirtualInterface] = js.native
}

object DeleteBGPPeerResponse {
  @scala.inline
  def apply(virtualInterface: VirtualInterface = null): DeleteBGPPeerResponse = {
    val __obj = js.Dynamic.literal()
    if (virtualInterface != null) __obj.updateDynamic("virtualInterface")(virtualInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBGPPeerResponse]
  }
}

