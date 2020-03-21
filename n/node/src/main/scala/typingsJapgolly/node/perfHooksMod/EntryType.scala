package typingsJapgolly.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.nodeStrings.node
  - typingsJapgolly.node.nodeStrings.mark
  - typingsJapgolly.node.nodeStrings.measure
  - typingsJapgolly.node.nodeStrings.gc
  - typingsJapgolly.node.nodeStrings.function
  - typingsJapgolly.node.nodeStrings.http2
  - typingsJapgolly.node.nodeStrings.http
*/
trait EntryType extends js.Object

object EntryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def function: typingsJapgolly.node.nodeStrings.function = this.cast("function")
  @scala.inline
  def gc: typingsJapgolly.node.nodeStrings.gc = this.cast("gc")
  @scala.inline
  def http: typingsJapgolly.node.nodeStrings.http = this.cast("http")
  @scala.inline
  def http2: typingsJapgolly.node.nodeStrings.http2 = this.cast("http2")
  @scala.inline
  def mark: typingsJapgolly.node.nodeStrings.mark = this.cast("mark")
  @scala.inline
  def measure: typingsJapgolly.node.nodeStrings.measure = this.cast("measure")
  @scala.inline
  def node: typingsJapgolly.node.nodeStrings.node = this.cast("node")
}

