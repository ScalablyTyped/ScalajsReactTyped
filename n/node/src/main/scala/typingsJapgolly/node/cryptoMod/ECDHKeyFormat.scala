package typingsJapgolly.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.compressed
  - typings.node.nodeStrings.uncompressed
  - typings.node.nodeStrings.hybrid
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

