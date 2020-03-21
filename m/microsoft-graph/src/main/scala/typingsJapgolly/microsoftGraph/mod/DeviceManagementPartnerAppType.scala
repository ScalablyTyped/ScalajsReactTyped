package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.singleTenantApp
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.multiTenantApp
*/
trait DeviceManagementPartnerAppType extends js.Object

object DeviceManagementPartnerAppType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multiTenantApp: typingsJapgolly.microsoftGraph.microsoftGraphStrings.multiTenantApp = this.cast("multiTenantApp")
  @scala.inline
  def singleTenantApp: typingsJapgolly.microsoftGraph.microsoftGraphStrings.singleTenantApp = this.cast("singleTenantApp")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

