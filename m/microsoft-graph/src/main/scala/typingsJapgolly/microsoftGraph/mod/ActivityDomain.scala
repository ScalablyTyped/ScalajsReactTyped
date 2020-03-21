package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.work
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.personal
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unrestricted
*/
trait ActivityDomain extends js.Object

object ActivityDomain {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def personal: typingsJapgolly.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unrestricted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unrestricted = this.cast("unrestricted")
  @scala.inline
  def work: typingsJapgolly.microsoftGraph.microsoftGraphStrings.work = this.cast("work")
}

