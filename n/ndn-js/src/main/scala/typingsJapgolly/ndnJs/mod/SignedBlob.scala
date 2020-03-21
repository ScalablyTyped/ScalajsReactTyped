package typingsJapgolly.ndnJs.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SignedBlob")
@js.native
class SignedBlob ()
  extends typingsJapgolly.ndnJs.blobMod.SignedBlob {
  def this(value: js.Array[Double], signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
  def this(
    value: typingsJapgolly.ndnJs.blobMod.Blob,
    signedPortionBeginOffset: Double,
    signedPortionEndOffset: Double
  ) = this()
  def this(value: Buffer, signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
}

