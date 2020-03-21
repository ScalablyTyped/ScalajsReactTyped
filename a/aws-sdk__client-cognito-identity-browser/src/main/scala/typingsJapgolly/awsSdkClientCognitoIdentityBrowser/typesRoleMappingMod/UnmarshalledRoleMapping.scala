package typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.AuthenticatedRole
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Deny
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Rules
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Token
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.UnmarshalledRulesConfigurationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRoleMapping extends RoleMapping {
  /**
    * <p>The rules to be used for mapping users to roles.</p> <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.</p>
    */
  @JSName("RulesConfiguration")
  var RulesConfiguration_UnmarshalledRoleMapping: js.UndefOr[UnmarshalledRulesConfigurationType] = js.undefined
}

object UnmarshalledRoleMapping {
  @scala.inline
  def apply(
    Type: Token | Rules | String,
    AmbiguousRoleResolution: AuthenticatedRole | Deny | String = null,
    RulesConfiguration: UnmarshalledRulesConfigurationType = null
  ): UnmarshalledRoleMapping = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (AmbiguousRoleResolution != null) __obj.updateDynamic("AmbiguousRoleResolution")(AmbiguousRoleResolution.asInstanceOf[js.Any])
    if (RulesConfiguration != null) __obj.updateDynamic("RulesConfiguration")(RulesConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRoleMapping]
  }
}

