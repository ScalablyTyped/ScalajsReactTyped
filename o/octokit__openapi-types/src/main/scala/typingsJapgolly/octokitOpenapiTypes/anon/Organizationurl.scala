package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.billing_manager
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organizationurl extends StObject {
  
  var organization: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-simple'] */ js.Any
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/octocat
    */
  var organization_url: String
  
  var permissions: js.UndefOr[Cancreaterepository] = js.undefined
  
  /**
    * @description The user's membership type in the organization.
    * @example admin
    * @enum {string}
    */
  var role: admin | member_ | billing_manager
  
  /**
    * @description The state of the member in the organization. The `pending` state indicates the user has not yet accepted an invitation.
    * @example active
    * @enum {string}
    */
  var state: active | pending
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/octocat/memberships/defunkt
    */
  var url: String
  
  var user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
}
object Organizationurl {
  
  inline def apply(
    organization: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-simple'] */ js.Any,
    organization_url: String,
    role: admin | member_ | billing_manager,
    state: active | pending,
    url: String,
    user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  ): Organizationurl = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizationurl]
  }
  
  extension [Self <: Organizationurl](x: Self) {
    
    inline def setOrganization(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-simple'] */ js.Any
    ): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganization_url(value: String): Self = StObject.set(x, "organization_url", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Cancreaterepository): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setRole(value: admin | member_ | billing_manager): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setState(value: active | pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
