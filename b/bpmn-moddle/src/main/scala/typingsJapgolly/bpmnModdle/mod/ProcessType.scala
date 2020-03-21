package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.None
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Public
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Private
*/
trait ProcessType extends js.Object

object ProcessType {
  @scala.inline
  def None: typingsJapgolly.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def Private: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Private = this.cast("Private")
  @scala.inline
  def Public: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Public = this.cast("Public")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

