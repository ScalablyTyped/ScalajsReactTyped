package typingsJapgolly.soap.mod

import typingsJapgolly.soap.wssecuritycertMod.IWSSecurityCertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "WSSecurityCert")
@js.native
class WSSecurityCert protected ()
  extends typingsJapgolly.soap.securityMod.WSSecurityCert {
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
}

