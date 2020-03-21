package typingsJapgolly.digibyte.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "PublicKey")
@js.native
class PublicKey protected () extends js.Object {
  def this(source: String) = this()
  def toBuffer(): Buffer = js.native
  def toDER(): Buffer = js.native
}

/* static members */
@JSImport("digibyte", "PublicKey")
@js.native
object PublicKey extends js.Object {
  def fromPrivateKey(privateKey: PrivateKey): PublicKey = js.native
}

