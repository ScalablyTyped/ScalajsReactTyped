package typingsJapgolly.nodeZendesk.mod.Requests.Comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.Comment
  - typingsJapgolly.nodeZendesk.nodeZendeskStrings.VoiceComment
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def Comment: typingsJapgolly.nodeZendesk.nodeZendeskStrings.Comment = this.cast("Comment")
  @scala.inline
  def VoiceComment: typingsJapgolly.nodeZendesk.nodeZendeskStrings.VoiceComment = this.cast("VoiceComment")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

