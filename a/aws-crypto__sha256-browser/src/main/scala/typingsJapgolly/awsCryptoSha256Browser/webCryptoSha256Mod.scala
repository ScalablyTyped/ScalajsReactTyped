package typingsJapgolly.awsCryptoSha256Browser

import typingsJapgolly.awsSdkTypes.cryptoMod.Hash
import typingsJapgolly.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-browser/build/webCryptoSha256", JSImport.Namespace)
@js.native
object webCryptoSha256Mod extends js.Object {
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    val key: js.Any = js.native
    var toHash: js.Any = js.native
  }
  
}

