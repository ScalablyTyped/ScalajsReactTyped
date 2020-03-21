package typingsJapgolly.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSOAuth2Def extends HelloJSOAuthDef {
  var grant: js.UndefOr[String] = js.undefined
  var response_type: js.UndefOr[HelloJSTokenResponseType] = js.undefined
}

object HelloJSOAuth2Def {
  @scala.inline
  def apply(
    version: String | Double,
    auth: String = null,
    grant: String = null,
    response_type: HelloJSTokenResponseType = null
  ): HelloJSOAuth2Def = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (grant != null) __obj.updateDynamic("grant")(grant.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSOAuth2Def]
  }
}

