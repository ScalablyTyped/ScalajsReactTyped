package typingsJapgolly.bitcoinjsLib.ecpairMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/ecpair", "fromPublicKey")
@js.native
object fromPublicKey extends js.Object {
  def apply(buffer: Buffer): ECPair = js.native
  def apply(buffer: Buffer, options: ECPairOptions): ECPair = js.native
}

