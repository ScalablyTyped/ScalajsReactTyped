package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Unspecified
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Converging
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Diverging
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Mixed
*/
trait GatewayDirection extends js.Object

object GatewayDirection {
  @scala.inline
  def Converging: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Converging = this.cast("Converging")
  @scala.inline
  def Diverging: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Diverging = this.cast("Diverging")
  @scala.inline
  def Mixed: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Mixed = this.cast("Mixed")
  @scala.inline
  def Unspecified: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Unspecified = this.cast("Unspecified")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

