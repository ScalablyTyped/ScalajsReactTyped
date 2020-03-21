package typingsJapgolly.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.nodeStrings.compressed
  - typingsJapgolly.node.nodeStrings.uncompressed
  - typingsJapgolly.node.nodeStrings.hybrid
*/
trait ECDHKeyFormat extends js.Object

object ECDHKeyFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compressed: typingsJapgolly.node.nodeStrings.compressed = this.cast("compressed")
  @scala.inline
  def hybrid: typingsJapgolly.node.nodeStrings.hybrid = this.cast("hybrid")
  @scala.inline
  def uncompressed: typingsJapgolly.node.nodeStrings.uncompressed = this.cast("uncompressed")
}

