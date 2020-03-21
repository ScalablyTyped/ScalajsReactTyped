package typingsJapgolly.jose.mod.JWE

import typingsJapgolly.jose.joseBooleans.`true`
import typingsJapgolly.jose.mod.ConsumeKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt_true extends js.Object {
  def apply(jwe: String, key: ConsumeKeyInput, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput, options: DecryptOptions[`true`]): completeDecrypt = js.native
}

