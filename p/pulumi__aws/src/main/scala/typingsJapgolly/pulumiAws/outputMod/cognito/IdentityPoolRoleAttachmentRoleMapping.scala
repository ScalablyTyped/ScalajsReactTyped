package typingsJapgolly.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolRoleAttachmentRoleMapping extends js.Object {
  /**
    * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
    */
  var ambiguousRoleResolution: js.UndefOr[String] = js.native
  /**
    * A string identifying the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
    */
  var identityProvider: String = js.native
  /**
    * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
    */
  var mappingRules: js.UndefOr[js.Array[IdentityPoolRoleAttachmentRoleMappingMappingRule]] = js.native
  /**
    * The role mapping type.
    */
  var `type`: String = js.native
}

object IdentityPoolRoleAttachmentRoleMapping {
  @scala.inline
  def apply(
    identityProvider: String,
    `type`: String,
    ambiguousRoleResolution: String = null,
    mappingRules: js.Array[IdentityPoolRoleAttachmentRoleMappingMappingRule] = null
  ): IdentityPoolRoleAttachmentRoleMapping = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ambiguousRoleResolution != null) __obj.updateDynamic("ambiguousRoleResolution")(ambiguousRoleResolution.asInstanceOf[js.Any])
    if (mappingRules != null) __obj.updateDynamic("mappingRules")(mappingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMapping]
  }
}

