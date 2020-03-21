package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.connectionPending
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.connected
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.disconnected
*/
trait DeviceManagementExchangeConnectorStatus extends js.Object

object DeviceManagementExchangeConnectorStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsJapgolly.microsoftGraph.microsoftGraphStrings.connected = this.cast("connected")
  @scala.inline
  def connectionPending: typingsJapgolly.microsoftGraph.microsoftGraphStrings.connectionPending = this.cast("connectionPending")
  @scala.inline
  def disconnected: typingsJapgolly.microsoftGraph.microsoftGraphStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def none: none_ = this.cast("none")
}

