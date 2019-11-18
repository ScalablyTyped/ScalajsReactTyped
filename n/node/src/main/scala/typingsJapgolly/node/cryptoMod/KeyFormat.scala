package typingsJapgolly.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.pem
  - typings.node.nodeStrings.der
*/
trait KeyFormat extends js.Object

object KeyFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def der: typingsJapgolly.node.nodeStrings.der = this.cast("der")
  @scala.inline
  def pem: typingsJapgolly.node.nodeStrings.pem = this.cast("pem")
}

