package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.fullSync
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deltaSync
*/
trait DeviceManagementExchangeConnectorSyncType extends js.Object

object DeviceManagementExchangeConnectorSyncType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deltaSync: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deltaSync = this.cast("deltaSync")
  @scala.inline
  def fullSync: typingsJapgolly.microsoftGraph.microsoftGraphStrings.fullSync = this.cast("fullSync")
}

