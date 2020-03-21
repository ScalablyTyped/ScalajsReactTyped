package typingsJapgolly.chromeApps.chrome.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectDetails extends js.Object {
  /**
    * If given, the *selectClientCertificates* operates on this
    * list. Otherwise, obtains the list of all certificates from the platform's
    * certificate stores that are available to this extensions.
    * Entries that the extension doesn't have permission for or which doesn't
    * match the request, are removed.
    */
  var clientCerts: js.UndefOr[js.Array[scala.scalajs.js.typedarray.ArrayBuffer]] = js.undefined
  /** If true, the filtered list is presented to the user to manually select a
    * certificate and thereby granting the extension access to the
    * certificate(s) and key(s).Only the selected certificate(s) will be
    * returned. If is false, the list is reduced to all certificates that the
    * extension has been granted access to (automatically or manually). */
  var interactive: Boolean
  /** Only certificates that match this request will be returned. */
  var request: ClientCertificateRequest
}

object SelectDetails {
  @scala.inline
  def apply(
    interactive: Boolean,
    request: ClientCertificateRequest,
    clientCerts: js.Array[scala.scalajs.js.typedarray.ArrayBuffer] = null
  ): SelectDetails = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (clientCerts != null) __obj.updateDynamic("clientCerts")(clientCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectDetails]
  }
}

