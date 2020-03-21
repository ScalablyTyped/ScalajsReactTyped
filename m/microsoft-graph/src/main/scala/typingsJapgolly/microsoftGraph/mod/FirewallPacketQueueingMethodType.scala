package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.queueInbound
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.queueOutbound
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.queueBoth
*/
trait FirewallPacketQueueingMethodType extends js.Object

object FirewallPacketQueueingMethodType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def disabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def queueBoth: typingsJapgolly.microsoftGraph.microsoftGraphStrings.queueBoth = this.cast("queueBoth")
  @scala.inline
  def queueInbound: typingsJapgolly.microsoftGraph.microsoftGraphStrings.queueInbound = this.cast("queueInbound")
  @scala.inline
  def queueOutbound: typingsJapgolly.microsoftGraph.microsoftGraphStrings.queueOutbound = this.cast("queueOutbound")
}

