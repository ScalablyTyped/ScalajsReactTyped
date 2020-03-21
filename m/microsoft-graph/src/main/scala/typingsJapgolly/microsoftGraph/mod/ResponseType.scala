package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.organizer
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.tentativelyAccepted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.accepted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.declined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notResponded
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def accepted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.declined = this.cast("declined")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notResponded: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notResponded = this.cast("notResponded")
  @scala.inline
  def organizer: typingsJapgolly.microsoftGraph.microsoftGraphStrings.organizer = this.cast("organizer")
  @scala.inline
  def tentativelyAccepted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.tentativelyAccepted = this.cast("tentativelyAccepted")
}

