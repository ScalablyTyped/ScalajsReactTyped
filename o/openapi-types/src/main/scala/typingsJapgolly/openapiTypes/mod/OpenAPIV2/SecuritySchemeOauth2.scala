package typingsJapgolly.openapiTypes.mod.OpenAPIV2

import typingsJapgolly.openapiTypes.openapiTypesStrings.`implicit`
import typingsJapgolly.openapiTypes.openapiTypesStrings.accessCode
import typingsJapgolly.openapiTypes.openapiTypesStrings.apiKey
import typingsJapgolly.openapiTypes.openapiTypesStrings.application
import typingsJapgolly.openapiTypes.openapiTypesStrings.basic
import typingsJapgolly.openapiTypes.openapiTypesStrings.oauth2
import typingsJapgolly.openapiTypes.openapiTypesStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit
  - typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode
  - typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password
  - typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application
*/
trait SecuritySchemeOauth2 extends SecuritySchemeObject

object SecuritySchemeOauth2 {
  @scala.inline
  def SecuritySchemeOauth2Implicit(
    authorizationUrl: String,
    flow: `implicit`,
    scopes: ScopesObject,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2 = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2]
  }
  @scala.inline
  def SecuritySchemeOauth2AccessCode(
    authorizationUrl: String,
    flow: accessCode,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2 = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2]
  }
  @scala.inline
  def SecuritySchemeOauth2Password(
    flow: password,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2 = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2]
  }
  @scala.inline
  def SecuritySchemeOauth2Application(
    flow: application,
    scopes: ScopesObject,
    tokenUrl: String,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2 = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2]
  }
}

