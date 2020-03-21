package typingsJapgolly.awsCryptoSha256Browser

import typingsJapgolly.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.HMAC
import typingsJapgolly.awsCryptoSha256Browser.awsCryptoSha256BrowserStrings.`SHA-256`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-browser/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val EMPTY_DATA_SHA_256: scala.scalajs.js.typedarray.Uint8Array = js.native
  @js.native
  object SHA_256_HASH extends js.Object {
    var name: `SHA-256` = js.native
  }
  
  @js.native
  object SHA_256_HMAC_ALGO extends js.Object {
    var hash: AnonName = js.native
    var name: HMAC = js.native
  }
  
}

