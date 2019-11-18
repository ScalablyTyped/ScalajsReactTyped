package typingsJapgolly.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.rsa
  - typings.node.nodeStrings.dsa
  - typings.node.nodeStrings.ec
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dsa: typingsJapgolly.node.nodeStrings.dsa = this.cast("dsa")
  @scala.inline
  def ec: typingsJapgolly.node.nodeStrings.ec = this.cast("ec")
  @scala.inline
  def rsa: typingsJapgolly.node.nodeStrings.rsa = this.cast("rsa")
}

