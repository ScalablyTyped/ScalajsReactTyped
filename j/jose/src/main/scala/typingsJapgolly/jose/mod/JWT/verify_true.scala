package typingsJapgolly.jose.mod.JWT

import typingsJapgolly.jose.joseBooleans.`true`
import typingsJapgolly.jose.mod.ConsumeKeyInput
import typingsJapgolly.jose.mod.JWK.Key
import typingsJapgolly.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.verify")
@js.native
object verify_true extends js.Object {
  def apply(jwt: String, key: ConsumeKeyInput, options: VerifyOptions[`true`]): completeResult[Key] = js.native
  def apply(jwt: String, key: NoneKey, options: VerifyOptions[`true`]): completeResult[NoneKey] = js.native
}

