package typingsJapgolly.webappsecCredentialManagement

import org.scalajs.dom.experimental.AbortSignal
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.optional
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-credentialrequestoptions}
  */
trait CredentialRequestOptions extends js.Object {
  /**
    * If set, the user agent will request {@link FederatedCredential} objects
    * for the providers and protocol types listed. Defaults to {@code null}.
    */
  var federated: js.UndefOr[FederatedCredentialRequestOptions] = js.undefined
  /**
    * This property specifies the mediation requirements for a given credential
    * request.
    */
  var mediation: js.UndefOr[silent | optional | required] = js.undefined
  /**
    * If set, the user agent will request {@link PasswordCredential} objects.
    * Defaults to {@code false}.
    */
  var password: js.UndefOr[Boolean] = js.undefined
  /**
    * This property specifies options for requesting a public-key signature.
    */
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.undefined
  /**
    * This property lets the developer abort an ongoing get() operation.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * If {@code true}, the user agent will only attempt to provide a Credential
    * without user interaction. Defaults to {@code false}.
    *
    * @deprecated Use {@link mediation} instead.
    */
  var unmediated: js.UndefOr[Boolean] = js.undefined
}

object CredentialRequestOptions {
  @scala.inline
  def apply(
    federated: FederatedCredentialRequestOptions = null,
    mediation: silent | optional | required = null,
    password: js.UndefOr[Boolean] = js.undefined,
    publicKey: PublicKeyCredentialRequestOptions = null,
    signal: AbortSignal = null,
    unmediated: js.UndefOr[Boolean] = js.undefined
  ): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (federated != null) __obj.updateDynamic("federated")(federated.asInstanceOf[js.Any])
    if (mediation != null) __obj.updateDynamic("mediation")(mediation.asInstanceOf[js.Any])
    if (!js.isUndefined(password)) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(unmediated)) __obj.updateDynamic("unmediated")(unmediated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialRequestOptions]
  }
}

