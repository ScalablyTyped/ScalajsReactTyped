package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Unknown
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.OneDrive
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.OneDriveForBusiness
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.OnPremOneDriveForBusiness
*/
trait OnenoteSourceService extends js.Object

object OnenoteSourceService {
  @scala.inline
  def OnPremOneDriveForBusiness: typingsJapgolly.microsoftGraph.microsoftGraphStrings.OnPremOneDriveForBusiness = this.cast("OnPremOneDriveForBusiness")
  @scala.inline
  def OneDrive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.OneDrive = this.cast("OneDrive")
  @scala.inline
  def OneDriveForBusiness: typingsJapgolly.microsoftGraph.microsoftGraphStrings.OneDriveForBusiness = this.cast("OneDriveForBusiness")
  @scala.inline
  def Unknown: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

