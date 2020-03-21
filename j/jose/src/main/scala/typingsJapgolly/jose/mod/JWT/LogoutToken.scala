package typingsJapgolly.jose.mod.JWT

import typingsJapgolly.jose.joseBooleans.`false`
import typingsJapgolly.jose.joseBooleans.`true`
import typingsJapgolly.jose.joseStrings.logout_token
import typingsJapgolly.jose.mod.ConsumeKeyInput
import typingsJapgolly.jose.mod.ConsumeKeyInputWithNone
import typingsJapgolly.jose.mod.JWK.Key
import typingsJapgolly.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.LogoutToken")
@js.native
object LogoutToken extends js.Object {
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone,
    options: VerifyOptions[`false`] with VerifyProfileOptions[logout_token]
  ): js.Object = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptions[`true`] with VerifyProfileOptions[logout_token]): completeResult[NoneKey] = js.native
  @JSName("verify")
  def verify_completeResult(
    jwt: String,
    key: ConsumeKeyInput,
    options: VerifyOptions[`true`] with VerifyProfileOptions[logout_token]
  ): completeResult[Key] = js.native
}

