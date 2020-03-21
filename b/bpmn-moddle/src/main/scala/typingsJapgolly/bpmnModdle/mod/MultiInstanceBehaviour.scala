package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.None
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.One
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.All
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Complex
*/
trait MultiInstanceBehaviour extends js.Object

object MultiInstanceBehaviour {
  @scala.inline
  def All: typingsJapgolly.bpmnModdle.bpmnModdleStrings.All = this.cast("All")
  @scala.inline
  def Complex: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Complex = this.cast("Complex")
  @scala.inline
  def None: typingsJapgolly.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def One: typingsJapgolly.bpmnModdle.bpmnModdleStrings.One = this.cast("One")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

