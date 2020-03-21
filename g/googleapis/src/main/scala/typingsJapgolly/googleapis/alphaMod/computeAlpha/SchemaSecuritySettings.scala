package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The authentication and authorization settings for a BackendService.
  */
@js.native
trait SchemaSecuritySettings extends js.Object {
  /**
    * Authentication policy defines what authentication methods can be accepted
    * on backends, and if authenticated, which method/certificate will set the
    * request principal.
    */
  var authenticationPolicy: js.UndefOr[SchemaAuthenticationPolicy] = js.native
  /**
    * Authorization config defines the Role Based Access Control (RBAC) config.
    */
  var authorizationConfig: js.UndefOr[SchemaAuthorizationConfig] = js.native
  /**
    * TLS Settings for the backend service.
    */
  var clientTlsSettings: js.UndefOr[SchemaClientTlsSettings] = js.native
  /**
    * The listener config of the XDS client is generated if the selector
    * matches the client.
    */
  var serverSettingsSelector: js.UndefOr[SchemaServerSecuritySettingsSelector] = js.native
}

object SchemaSecuritySettings {
  @scala.inline
  def apply(
    authenticationPolicy: SchemaAuthenticationPolicy = null,
    authorizationConfig: SchemaAuthorizationConfig = null,
    clientTlsSettings: SchemaClientTlsSettings = null,
    serverSettingsSelector: SchemaServerSecuritySettingsSelector = null
  ): SchemaSecuritySettings = {
    val __obj = js.Dynamic.literal()
    if (authenticationPolicy != null) __obj.updateDynamic("authenticationPolicy")(authenticationPolicy.asInstanceOf[js.Any])
    if (authorizationConfig != null) __obj.updateDynamic("authorizationConfig")(authorizationConfig.asInstanceOf[js.Any])
    if (clientTlsSettings != null) __obj.updateDynamic("clientTlsSettings")(clientTlsSettings.asInstanceOf[js.Any])
    if (serverSettingsSelector != null) __obj.updateDynamic("serverSettingsSelector")(serverSettingsSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecuritySettings]
  }
}

