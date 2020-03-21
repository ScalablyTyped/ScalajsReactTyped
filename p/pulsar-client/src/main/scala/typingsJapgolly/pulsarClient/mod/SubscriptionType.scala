package typingsJapgolly.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulsarClient.pulsarClientStrings.Exclusive
  - typingsJapgolly.pulsarClient.pulsarClientStrings.Shared
  - typingsJapgolly.pulsarClient.pulsarClientStrings.Failover
*/
trait SubscriptionType extends js.Object

object SubscriptionType {
  @scala.inline
  def Exclusive: typingsJapgolly.pulsarClient.pulsarClientStrings.Exclusive = this.cast("Exclusive")
  @scala.inline
  def Failover: typingsJapgolly.pulsarClient.pulsarClientStrings.Failover = this.cast("Failover")
  @scala.inline
  def Shared: typingsJapgolly.pulsarClient.pulsarClientStrings.Shared = this.cast("Shared")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

