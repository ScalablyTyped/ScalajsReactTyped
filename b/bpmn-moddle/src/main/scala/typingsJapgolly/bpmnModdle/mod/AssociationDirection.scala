package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.None
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.One
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Both
*/
trait AssociationDirection extends js.Object

object AssociationDirection {
  @scala.inline
  def Both: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Both = this.cast("Both")
  @scala.inline
  def None: typingsJapgolly.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def One: typingsJapgolly.bpmnModdle.bpmnModdleStrings.One = this.cast("One")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

