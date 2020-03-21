package typingsJapgolly.hashJs

import typingsJapgolly.hashJs.hashJsNumbers.`1024`
import typingsJapgolly.hashJs.hashJsNumbers.`128`
import typingsJapgolly.hashJs.hashJsNumbers.`192`
import typingsJapgolly.hashJs.hashJsNumbers.`384`
import typingsJapgolly.hashJs.hashJsStrings.big
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha384
  extends BlockHash[Sha384]
     with MessageDigest[Sha384] {
  @JSName("blockSize")
  var blockSize_Sha384: `1024` = js.native
  @JSName("endian")
  var endian_Sha384: big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha384: `192` = js.native
  @JSName("outSize")
  var outSize_Sha384: `384` = js.native
  @JSName("padLength")
  var padLength_Sha384: `128` = js.native
}

