package typingsJapgolly.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Parallel
  - typingsJapgolly.bpmnModdle.bpmnModdleStrings.Exclusive
*/
trait EventBasedGatewayType extends js.Object

object EventBasedGatewayType {
  @scala.inline
  def Exclusive: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Exclusive = this.cast("Exclusive")
  @scala.inline
  def Parallel: typingsJapgolly.bpmnModdle.bpmnModdleStrings.Parallel = this.cast("Parallel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

