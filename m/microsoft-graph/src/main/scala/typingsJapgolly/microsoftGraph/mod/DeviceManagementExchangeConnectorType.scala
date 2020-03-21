package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.onPremises
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.hosted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.serviceToService
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.dedicated
*/
trait DeviceManagementExchangeConnectorType extends js.Object

object DeviceManagementExchangeConnectorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedicated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.dedicated = this.cast("dedicated")
  @scala.inline
  def hosted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.hosted = this.cast("hosted")
  @scala.inline
  def onPremises: typingsJapgolly.microsoftGraph.microsoftGraphStrings.onPremises = this.cast("onPremises")
  @scala.inline
  def serviceToService: typingsJapgolly.microsoftGraph.microsoftGraphStrings.serviceToService = this.cast("serviceToService")
}

