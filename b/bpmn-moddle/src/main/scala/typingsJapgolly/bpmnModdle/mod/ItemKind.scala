package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Physical
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Information
*/
trait ItemKind extends js.Object

object ItemKind {
  @scala.inline
  def Information: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Information = this.cast("Information")
  @scala.inline
  def Physical: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Physical = this.cast("Physical")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

