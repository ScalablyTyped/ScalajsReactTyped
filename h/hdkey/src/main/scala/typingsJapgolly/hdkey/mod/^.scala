package typingsJapgolly.hdkey.mod

import typingsJapgolly.hdkey.AnonXpriv
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdkey", JSImport.Namespace)
@js.native
class ^ () extends HDNode {
  /* CompleteClass */
  override var chainCode: Buffer = js.native
  /* CompleteClass */
  override var privateKey: Buffer = js.native
  /* CompleteClass */
  override var publicKey: Buffer = js.native
  /* CompleteClass */
  override def derive(path: String): HDNode = js.native
  /* CompleteClass */
  override def toJSON(): AnonXpriv = js.native
}

@JSImport("hdkey", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromJSON(obj: AnonXpriv): HDNode = js.native
  def fromMasterSeed(seed: Buffer): HDNode = js.native
}

