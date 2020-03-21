package typingsJapgolly.jose.mod.JWS

import typingsJapgolly.jose.joseBooleans.`false`
import typingsJapgolly.jose.joseBooleans.`true`
import typingsJapgolly.jose.mod.ConsumeKeyInputWithNone
import typingsJapgolly.jose.mod.NoneKey
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify extends js.Object {
  def apply(jws: String, key: ConsumeKeyInputWithNone): String | js.Object = js.native
  def apply(jws: String, key: ConsumeKeyInputWithNone, options: VerifyOptions[`false`, `true`]): String | js.Object = js.native
  def apply(jws: String, key: NoneKey): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: String, key: NoneKey, options: VerifyOptions[`true`, `false`]): completeVerification[Buffer, NoneKey] = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInputWithNone): String | js.Object = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInputWithNone, options: VerifyOptions[`false`, `true`]): String | js.Object = js.native
  def apply(jws: FlattenedJWS, key: NoneKey): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: FlattenedJWS, key: NoneKey, options: VerifyOptions[`true`, `false`]): completeVerification[Buffer, NoneKey] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInputWithNone): String | js.Object = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInputWithNone, options: VerifyOptions[`false`, `true`]): String | js.Object = js.native
  def apply(jws: GeneralJWS, key: NoneKey): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: GeneralJWS, key: NoneKey, options: VerifyOptions[`true`, `false`]): completeVerification[Buffer, NoneKey] = js.native
}

