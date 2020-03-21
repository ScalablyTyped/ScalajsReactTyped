package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.None
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Forward
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Backward
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Both
*/
trait RelationshipDirection extends js.Object

object RelationshipDirection {
  @scala.inline
  def Backward: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Backward = this.cast("Backward")
  @scala.inline
  def Both: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Both = this.cast("Both")
  @scala.inline
  def Forward: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Forward = this.cast("Forward")
  @scala.inline
  def None: typingsJapgolly.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

