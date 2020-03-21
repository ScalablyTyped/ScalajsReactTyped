package typingsJapgolly.jose.mod.JWT

import typingsJapgolly.jose.joseBooleans.`false`
import typingsJapgolly.jose.joseBooleans.`true`
import typingsJapgolly.jose.joseStrings.atPlussignJWT
import typingsJapgolly.jose.mod.ConsumeKeyInput
import typingsJapgolly.jose.mod.ConsumeKeyInputWithNone
import typingsJapgolly.jose.mod.JWK.Key
import typingsJapgolly.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.AccessToken")
@js.native
object AccessToken extends js.Object {
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone,
    options: VerifyOptions[`false`] with VerifyProfileOptions[atPlussignJWT]
  ): js.Object = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptions[`true`] with VerifyProfileOptions[atPlussignJWT]): completeResult[NoneKey] = js.native
  @JSName("verify")
  def verify_completeResult(
    jwt: String,
    key: ConsumeKeyInput,
    options: VerifyOptions[`true`] with VerifyProfileOptions[atPlussignJWT]
  ): completeResult[Key] = js.native
}

