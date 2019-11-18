package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Anon_PlaintextLength
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherCCM extends Cipher {
  def getAuthTag(): Buffer = js.native
  def setAAD(buffer: Buffer, options: Anon_PlaintextLength): this.type = js.native
}

