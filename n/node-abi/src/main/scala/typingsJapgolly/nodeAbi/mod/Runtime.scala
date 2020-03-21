package typingsJapgolly.nodeAbi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeAbi.nodeAbiStrings.electron
  - typingsJapgolly.nodeAbi.nodeAbiStrings.node
  - typingsJapgolly.nodeAbi.nodeAbiStrings.`node-webkit`
*/
trait Runtime extends js.Object

object Runtime {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def electron: typingsJapgolly.nodeAbi.nodeAbiStrings.electron = this.cast("electron")
  @scala.inline
  def node: typingsJapgolly.nodeAbi.nodeAbiStrings.node = this.cast("node")
  @scala.inline
  def `node-webkit`: typingsJapgolly.nodeAbi.nodeAbiStrings.`node-webkit` = this.cast("node-webkit")
}

