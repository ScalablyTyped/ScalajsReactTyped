package typingsJapgolly.awsCryptoSha256Browser

import typingsJapgolly.awsSdkTypes.cryptoMod.Hash
import typingsJapgolly.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-browser/build/ie11Sha256", JSImport.Namespace)
@js.native
object ie11Sha256Mod extends js.Object {
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    var operation: js.Any = js.native
  }
  
}

