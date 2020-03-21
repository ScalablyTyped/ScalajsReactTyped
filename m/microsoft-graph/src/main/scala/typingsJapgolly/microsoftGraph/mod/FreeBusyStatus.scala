package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.free
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.tentative
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.busy
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.oof
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.workingElsewhere
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait FreeBusyStatus extends js.Object

object FreeBusyStatus {
  @scala.inline
  def busy: typingsJapgolly.microsoftGraph.microsoftGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def free: typingsJapgolly.microsoftGraph.microsoftGraphStrings.free = this.cast("free")
  @scala.inline
  def oof: typingsJapgolly.microsoftGraph.microsoftGraphStrings.oof = this.cast("oof")
  @scala.inline
  def tentative: typingsJapgolly.microsoftGraph.microsoftGraphStrings.tentative = this.cast("tentative")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def workingElsewhere: typingsJapgolly.microsoftGraph.microsoftGraphStrings.workingElsewhere = this.cast("workingElsewhere")
}

