package typingsJapgolly.nodeJose.mod.parse

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.nodeJose.mod.JWE.DecryptResult
import typingsJapgolly.nodeJose.mod.JWK.KeyStore
import typingsJapgolly.nodeJose.mod.JWS.VerificationResult
import typingsJapgolly.nodeJose.nodeJoseStrings.JWE
import typingsJapgolly.nodeJose.nodeJoseStrings.JWS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseReturn extends js.Object {
  var format: typingsJapgolly.nodeJose.nodeJoseStrings.compact | typingsJapgolly.nodeJose.nodeJoseStrings.json
  var header: js.Object
  var input: Buffer | String | js.Object
  var `type`: JWS | JWE
  def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult]
}

object ParseReturn {
  @scala.inline
  def apply(
    format: typingsJapgolly.nodeJose.nodeJoseStrings.compact | typingsJapgolly.nodeJose.nodeJoseStrings.json,
    header: js.Object,
    input: Buffer | String | js.Object,
    perform: KeyStore => CallbackTo[js.Promise[DecryptResult | VerificationResult]],
    `type`: JWS | JWE
  ): ParseReturn = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.updateDynamic("perform")(js.Any.fromFunction1((t0: typingsJapgolly.nodeJose.mod.JWK.KeyStore) => perform(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseReturn]
  }
}

