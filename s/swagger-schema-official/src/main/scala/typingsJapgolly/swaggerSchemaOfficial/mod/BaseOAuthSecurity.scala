package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOAuthSecurity extends BaseSecurity {
  var flow: accessCode | application | `implicit` | password
  var scopes: js.UndefOr[OAuthScope] = js.undefined
  @JSName("type")
  var type_BaseOAuthSecurity: oauth2
}

object BaseOAuthSecurity {
  @scala.inline
  def apply(
    flow: accessCode | application | `implicit` | password,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): BaseOAuthSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOAuthSecurity]
  }
}

