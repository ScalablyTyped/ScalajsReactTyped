package typingsJapgolly.bip32

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip32/types/crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  def hash160(buffer: Buffer): Buffer = js.native
  def hmacSHA512(key: Buffer, data: Buffer): Buffer = js.native
}

