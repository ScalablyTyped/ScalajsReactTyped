package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webappsecCredentialManagement {
  /**
    * @see {@link https://www.w3.org/TR/credential-management-1/#typedefdef-credentialbodytype}
    */
  type CredentialBodyType = org.scalajs.dom.raw.FormData | typingsJapgolly.std.URLSearchParams
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-federatedcredentialinit}
    */
  type FederatedCredentialInit = typingsJapgolly.webappsecCredentialManagement.FederatedCredentialData
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#typedefdef-passwordcredentialinit}
    */
  type PasswordCredentialInit = typingsJapgolly.webappsecCredentialManagement.PasswordCredentialData | org.scalajs.dom.raw.HTMLFormElement
}
