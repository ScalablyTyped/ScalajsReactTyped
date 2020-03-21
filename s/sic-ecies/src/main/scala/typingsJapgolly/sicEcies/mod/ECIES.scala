package typingsJapgolly.sicEcies.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.bitcoreLib.mod.PrivateKey
import typingsJapgolly.bitcoreLib.mod.PublicKey
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECIES extends js.Object {
  var Rbuf: Buffer = js.native
  var kE: Buffer = js.native
  var kEkM: Buffer = js.native
  var kM: Buffer = js.native
  def apply(): ECIES = js.native
  def apply(opts: ECIESOptions): ECIES = js.native
  def decrypt(encbuf: Buffer): Buffer = js.native
  def encrypt(message: String): Buffer = js.native
  def encrypt(message: String, ivbuf: Buffer): Buffer = js.native
  def encrypt(message: Buffer): Buffer = js.native
  def encrypt(message: Buffer, ivbuf: Buffer): Buffer = js.native
  def privateKey(privateKey: PrivateKey): ECIES = js.native
  def publicKey(publicKey: PublicKey): ECIES = js.native
}

@JSImport("sic-ecies", "ECIES")
@js.native
object ECIES extends TopLevel[ECIES]

