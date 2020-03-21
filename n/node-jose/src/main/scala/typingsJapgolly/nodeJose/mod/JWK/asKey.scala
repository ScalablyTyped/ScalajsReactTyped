package typingsJapgolly.nodeJose.mod.JWK

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodeJose.nodeJoseStrings.`private`
import typingsJapgolly.nodeJose.nodeJoseStrings.json
import typingsJapgolly.nodeJose.nodeJoseStrings.pem
import typingsJapgolly.nodeJose.nodeJoseStrings.pkcs8
import typingsJapgolly.nodeJose.nodeJoseStrings.pkix
import typingsJapgolly.nodeJose.nodeJoseStrings.public
import typingsJapgolly.nodeJose.nodeJoseStrings.spki
import typingsJapgolly.nodeJose.nodeJoseStrings.x509
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWK.asKey")
@js.native
object asKey extends js.Object {
  def apply(key: String | Buffer | js.Object | RawKey): js.Promise[Key] = js.native
  def apply(
    key: String | Buffer | js.Object | RawKey,
    form: json | `private` | pkcs8 | public | spki | pkix | x509 | pem
  ): js.Promise[Key] = js.native
  def apply(
    key: String | Buffer | js.Object | RawKey,
    form: json | `private` | pkcs8 | public | spki | pkix | x509 | pem,
    extras: Record[String, _]
  ): js.Promise[Key] = js.native
}

