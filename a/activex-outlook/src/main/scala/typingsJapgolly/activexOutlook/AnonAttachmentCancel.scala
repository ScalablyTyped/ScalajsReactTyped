package typingsJapgolly.activexOutlook

import typingsJapgolly.activexOutlook.Outlook.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachmentCancel extends js.Object {
  val Attachment: typingsJapgolly.activexOutlook.Outlook.Attachment
  var Cancel: Boolean
}

object AnonAttachmentCancel {
  @scala.inline
  def apply(Attachment: Attachment, Cancel: Boolean): AnonAttachmentCancel = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttachmentCancel]
  }
}

