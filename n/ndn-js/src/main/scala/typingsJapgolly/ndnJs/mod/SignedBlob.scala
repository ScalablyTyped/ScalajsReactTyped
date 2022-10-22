package typingsJapgolly.ndnJs.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "SignedBlob")
@js.native
open class SignedBlob ()
  extends typingsJapgolly.ndnJs.blobMod.SignedBlob {
  def this(value: js.Array[Double], signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
  def this(
    value: typingsJapgolly.ndnJs.blobMod.Blob,
    signedPortionBeginOffset: Double,
    signedPortionEndOffset: Double
  ) = this()
  def this(value: Buffer, signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
}
