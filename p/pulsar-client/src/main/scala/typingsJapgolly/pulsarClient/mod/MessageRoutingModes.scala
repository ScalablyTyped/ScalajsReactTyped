package typingsJapgolly.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulsarClient.pulsarClientStrings.RoundRobinPartition
  - typingsJapgolly.pulsarClient.pulsarClientStrings.SinglePartition
  - typingsJapgolly.pulsarClient.pulsarClientStrings.CustomPartition
*/
trait MessageRoutingModes extends js.Object

object MessageRoutingModes {
  @scala.inline
  def CustomPartition: typingsJapgolly.pulsarClient.pulsarClientStrings.CustomPartition = this.cast("CustomPartition")
  @scala.inline
  def RoundRobinPartition: typingsJapgolly.pulsarClient.pulsarClientStrings.RoundRobinPartition = this.cast("RoundRobinPartition")
  @scala.inline
  def SinglePartition: typingsJapgolly.pulsarClient.pulsarClientStrings.SinglePartition = this.cast("SinglePartition")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

