package typingsJapgolly.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.nodeStrings.json
  - typingsJapgolly.node.nodeStrings.advanced
*/
trait SerializationType extends js.Object

object SerializationType {
  @scala.inline
  def advanced: typingsJapgolly.node.nodeStrings.advanced = this.cast("advanced")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typingsJapgolly.node.nodeStrings.json = this.cast("json")
}

