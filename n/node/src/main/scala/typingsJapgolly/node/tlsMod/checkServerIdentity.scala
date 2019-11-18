package typingsJapgolly.node.tlsMod

import typingsJapgolly.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "checkServerIdentity")
@js.native
object checkServerIdentity extends js.Object {
  /*
    * Verifies the certificate `cert` is issued to host `host`.
    * @host The hostname to verify the certificate against
    * @cert PeerCertificate representing the peer's certificate
    *
    * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
    */
  def apply(host: java.lang.String, cert: PeerCertificate): js.UndefOr[Error] = js.native
}

