package typingsJapgolly.hashJs

import typingsJapgolly.hashJs.hashJsNumbers.`160`
import typingsJapgolly.hashJs.hashJsNumbers.`512`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hmac extends MessageDigest[Hmac] {
  @JSName("blockSize")
  var blockSize_Hmac: `512` = js.native
  @JSName("outSize")
  var outSize_Hmac: `160` = js.native
}

