package typingsJapgolly.bitcoinjsLib.addressMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/address", "toBase58Check")
@js.native
object toBase58Check extends js.Object {
  def apply(hash: Buffer, version: Double): String = js.native
}

