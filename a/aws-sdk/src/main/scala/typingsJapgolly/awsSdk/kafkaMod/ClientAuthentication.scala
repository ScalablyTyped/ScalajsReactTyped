package typingsJapgolly.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientAuthentication extends js.Object {
  /**
    * 
    Details for ClientAuthentication using TLS.
    
    */
  var Tls: js.UndefOr[typingsJapgolly.awsSdk.kafkaMod.Tls] = js.native
}

object ClientAuthentication {
  @scala.inline
  def apply(Tls: Tls = null): ClientAuthentication = {
    val __obj = js.Dynamic.literal()
    if (Tls != null) __obj.updateDynamic("Tls")(Tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAuthentication]
  }
}

