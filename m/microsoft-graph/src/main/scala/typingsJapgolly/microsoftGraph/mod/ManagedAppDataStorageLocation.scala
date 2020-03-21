package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.oneDriveForBusiness_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.oneDriveForBusiness_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sharePoint
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.localStorage
*/
trait ManagedAppDataStorageLocation extends js.Object

object ManagedAppDataStorageLocation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typingsJapgolly.microsoftGraph.microsoftGraphStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def oneDriveForBusiness: oneDriveForBusiness_ = this.cast("oneDriveForBusiness")
  @scala.inline
  def sharePoint: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sharePoint = this.cast("sharePoint")
}

