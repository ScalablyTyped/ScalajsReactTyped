package typingsJapgolly.awsSdkSignatureV4

import typingsJapgolly.awsSdkSignatureV4.signatureV4Mod.SignatureV4CryptoInit
import typingsJapgolly.awsSdkSignatureV4.signatureV4Mod.SignatureV4Init
import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/signature-v4", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SignatureV4 protected ()
    extends typingsJapgolly.awsSdkSignatureV4.signatureV4Mod.SignatureV4 {
    def this(hasApplyChecksumCredentialsRegionServiceSha256UriEscapePath: SignatureV4Init with SignatureV4CryptoInit) = this()
  }
  
  def createScope(shortDate: String, region: String, service: String): String = js.native
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

