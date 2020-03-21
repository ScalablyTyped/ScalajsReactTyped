package typingsJapgolly.googleAuthLibrary.oauth2clientMod

import typingsJapgolly.gaxios.commonMod.GaxiosResponse
import typingsJapgolly.googleAuthLibrary.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTokenResponse extends js.Object {
  var res: GaxiosResponse[_] | Null
  var tokens: Credentials
}

object GetTokenResponse {
  @scala.inline
  def apply(tokens: Credentials, res: GaxiosResponse[_] = null): GetTokenResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTokenResponse]
  }
}

