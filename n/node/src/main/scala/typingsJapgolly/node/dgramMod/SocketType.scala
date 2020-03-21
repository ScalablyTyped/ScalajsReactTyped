package typingsJapgolly.node.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.nodeStrings.udp4
  - typingsJapgolly.node.nodeStrings.udp6
*/
trait SocketType extends js.Object

object SocketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def udp4: typingsJapgolly.node.nodeStrings.udp4 = this.cast("udp4")
  @scala.inline
  def udp6: typingsJapgolly.node.nodeStrings.udp6 = this.cast("udp6")
}

