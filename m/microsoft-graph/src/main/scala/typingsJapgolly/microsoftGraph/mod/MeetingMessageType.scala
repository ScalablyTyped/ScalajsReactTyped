package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingRequest
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingCancelled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingAccepted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingTenativelyAccepted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingDeclined
*/
trait MeetingMessageType extends js.Object

object MeetingMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def meetingAccepted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingAccepted = this.cast("meetingAccepted")
  @scala.inline
  def meetingCancelled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingCancelled = this.cast("meetingCancelled")
  @scala.inline
  def meetingDeclined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingDeclined = this.cast("meetingDeclined")
  @scala.inline
  def meetingRequest: typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingRequest = this.cast("meetingRequest")
  @scala.inline
  def meetingTenativelyAccepted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.meetingTenativelyAccepted = this.cast("meetingTenativelyAccepted")
  @scala.inline
  def none: none_ = this.cast("none")
}

