package typingsJapgolly.awsSdkSignatureV4

import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/signature-v4/build/credentialDerivation", JSImport.Namespace)
@js.native
object credentialDerivationMod extends js.Object {
  def createScope(shortDate: String, region: String, service: String): String = js.native
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

