package typingsJapgolly.jose.mod.JWE

import typingsJapgolly.jose.joseBooleans.`false`
import typingsJapgolly.jose.mod.ConsumeKeyInput
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt_false extends js.Object {
  def apply(jwe: String, key: ConsumeKeyInput, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput, options: DecryptOptions[`false`]): Buffer = js.native
}

