package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.intune
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sccm
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.office365
*/
trait MdmAuthority extends js.Object

object MdmAuthority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def intune: typingsJapgolly.microsoftGraph.microsoftGraphStrings.intune = this.cast("intune")
  @scala.inline
  def office365: typingsJapgolly.microsoftGraph.microsoftGraphStrings.office365 = this.cast("office365")
  @scala.inline
  def sccm: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sccm = this.cast("sccm")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

