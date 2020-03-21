package typingsJapgolly.webappsecCredentialManagement

import org.scalajs.dom.experimental.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-credentialcreationoptions}
  */
trait CredentialCreationOptions extends js.Object {
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dom-credentialcreationoptions-federated}
    */
  var federated: js.UndefOr[FederatedCredentialInit] = js.undefined
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-federatedcredentialinit}
    */
  var password: js.UndefOr[PasswordCredentialInit] = js.undefined
  /**
    * @see {@link https://w3c.github.io/webauthn/#dictionary-makecredentialoptions}
    */
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.undefined
  /**
    * @see {@link https://w3c.github.io/webappsec-credential-management/#dom-credentialrequestoptions-signal}
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}

object CredentialCreationOptions {
  @scala.inline
  def apply(
    federated: FederatedCredentialInit = null,
    password: PasswordCredentialInit = null,
    publicKey: PublicKeyCredentialCreationOptions = null,
    signal: AbortSignal = null
  ): CredentialCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (federated != null) __obj.updateDynamic("federated")(federated.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialCreationOptions]
  }
}

