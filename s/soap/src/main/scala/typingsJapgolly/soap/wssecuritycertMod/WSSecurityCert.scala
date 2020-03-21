package typingsJapgolly.soap.wssecuritycertMod

import typingsJapgolly.soap.typesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/WSSecurityCert", "WSSecurityCert")
@js.native
class WSSecurityCert protected () extends ISecurity {
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
  var created: js.Any = js.native
  var expires: js.Any = js.native
  var hasTimeStamp: js.Any = js.native
  var publicP12PEM: js.Any = js.native
  var signatureTransformations: js.Any = js.native
  var signer: js.Any = js.native
  var signerOptions: js.Any = js.native
  var x509Id: js.Any = js.native
  @JSName("postProcess")
  def postProcess_MWSSecurityCert(xml: js.Any, envelopeKey: js.Any): String = js.native
}

