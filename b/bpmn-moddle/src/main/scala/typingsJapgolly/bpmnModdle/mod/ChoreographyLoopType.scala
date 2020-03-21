package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.None
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Standard
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.MultiInstanceSequential
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.MultiInstanceParallel
*/
trait ChoreographyLoopType extends js.Object

object ChoreographyLoopType {
  @scala.inline
  def MultiInstanceParallel: typingsJapgolly.bpmnModdle.bpmnModdleStrings.MultiInstanceParallel = this.cast("MultiInstanceParallel")
  @scala.inline
  def MultiInstanceSequential: typingsJapgolly.bpmnModdle.bpmnModdleStrings.MultiInstanceSequential = this.cast("MultiInstanceSequential")
  @scala.inline
  def None: typingsJapgolly.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def Standard: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

